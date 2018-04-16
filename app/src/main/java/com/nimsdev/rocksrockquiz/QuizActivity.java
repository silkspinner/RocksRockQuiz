package com.nimsdev.rocksrockquiz;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.preference.PreferenceManager;
import android.text.Html;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class QuizActivity extends Activity {

    private TextView mScoreView, mQuestion, mAnswerText, mTitleTextView, mAttributionTextView;
    private ImageView mImageView;
    private Button mTrueButton, mFalseButton, mNextButton;

    private boolean mAnswer;
    private int mScore = 0;
    private int mQuestionNumber = 0;

    private int mQuantity = 10;

    private Handler mHandler = new Handler();

    //define the shared pref object
    private SharedPreferences savedValues;
    //private SharedPreferences prefs;

    private QuizItem[] questionList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        mScoreView = (TextView)findViewById(R.id.points);
        mImageView = (ImageView)findViewById(R.id.imageView);
        mQuestion = (TextView)findViewById(R.id.question);
        mAnswerText = (TextView)findViewById(R.id.answerText);
        mTrueButton = (Button)findViewById(R.id.trueButton);
        mFalseButton = (Button)findViewById(R.id.falseButton);
        mNextButton = (Button)findViewById(R.id.nextButton);
        mNextButton.setVisibility(View.INVISIBLE); // initially next button should not be seen
        mTitleTextView = (TextView)findViewById(R.id.titleTextView);
        mAttributionTextView = (TextView)findViewById(R.id.attributionTextView);

        // establish shared preferences
        PreferenceManager.setDefaultValues(this, R.xml.preferences, false);
        savedValues = getSharedPreferences("SavedValues", MODE_PRIVATE);
        //prefs = PreferenceManager.getDefaultSharedPreferences(this);

        //retreive level from bundle
        Bundle bundle = getIntent().getExtras();
        int level = bundle.getInt("level", 1);

        // establish list of quiz quiestions
        questionList = QuizData.QuizList(mQuantity, level);
        updateQuestion();

        //True button logic
        mTrueButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                // modify available buttons
                mTrueButton.setVisibility(View.GONE);
                mFalseButton.setVisibility(View.GONE);
                mNextButton.setVisibility(View.VISIBLE);

                mAnswerText.setText(questionList[mQuestionNumber].response);

                if (mAnswer == true) mScore++;

                updateScore();

            }
        });

        //False button logic
        mFalseButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                // modify available buttons
                mTrueButton.setVisibility(View.GONE);
                mFalseButton.setVisibility(View.GONE);
                mNextButton.setVisibility(View.VISIBLE);

                mAnswerText.setText(questionList[mQuestionNumber].response);

                if (mAnswer == false) mScore++;

                updateScore();

            }
        });

        // NextButton button logic
        mNextButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                if (mQuestionNumber + 1 >= questionList.length) {
                    // if done with quiz
                    Intent i = new Intent(QuizActivity.this, ResultsActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("finalScore", mScore);
                    bundle.putInt("quantity", mQuantity);
                    i.putExtras(bundle);
                    QuizActivity.this.finish();
                    startActivity(i);
                } else {
                    // else setup next question

                    // modify available buttons
                    mTrueButton.setVisibility(View.VISIBLE);
                    mFalseButton.setVisibility(View.VISIBLE);
                    mNextButton.setVisibility(View.GONE);

                    mQuestionNumber++;
                    updateQuestion();
                }

            }
        });
    }

    private void updateQuestion(){
        //Refresh display with next question information

        mImageView.setImageResource(questionList[mQuestionNumber].image);
        mQuestion.setText(questionList[mQuestionNumber].question);
        mAnswerText.setText("");
        mAnswer = questionList[mQuestionNumber].answer;
        mTitleTextView.setText(questionList[mQuestionNumber].title);
        if (questionList[mQuestionNumber].attribution.equals("") ){
            mAttributionTextView.setText("");
        } else {
            // add attribution and link
            String attribLink = "Photo by <a href=\"" + questionList[mQuestionNumber].attribLink;
            attribLink += "\">" + questionList[mQuestionNumber].attribution + "</a>";
            Spanned htmlLink = Html.fromHtml(attribLink);
            mAttributionTextView.setMovementMethod(LinkMovementMethod.getInstance());
            mAttributionTextView.setText(htmlLink);
        }

        //TODO implement dark/light titles
        //if(questionList[mQuestionNumber].dark){
        //    mTitleTextView.setTextColor(3);
        //} else {
        //    mTitleTextView.setTextColor(1);
        //}
    }

    public void updateScore(){
        //Toast.makeText(getApplicationContext(), "UPDATE SCORE: mScore is " + String.valueOf(mScore), Toast.LENGTH_SHORT).show();
        mScoreView.setText("" + mScore + " of " + String.valueOf(mQuestionNumber+1));
    }

    @Override
    public void onPause(){

        //save the instance variablea
        SharedPreferences.Editor editor = savedValues.edit();
        editor.putInt("mScore", mScore);
        editor.putInt("mQuestionNumber", mQuestionNumber);
        editor.putString("mAnswerText", (String) mAnswerText.getText());
        editor.putBoolean("mAnswer", mAnswer);
        editor.apply();
        super.onPause();
    }

    @Override
    public void onResume() {

        super.onResume();

        //mQuestionNumber = savedValues.getInt("mQuestionNumber", 0);
        mScore = savedValues.getInt("mScore", 0);

        //TODO-FIX
        mQuestionNumber = savedValues.getInt("mQuestionNumber", 0);

        updateQuestion();
        updateScore();
    }

}
