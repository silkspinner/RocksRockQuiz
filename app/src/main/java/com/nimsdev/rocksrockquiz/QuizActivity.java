package com.nimsdev.rocksrockquiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class QuizActivity extends Activity {

    private TextView mScoreView, mQuestion, mAnswerText;
    private ImageView mImageView;
    private Button mTrueButton, mFalseButton;

    private boolean mAnswer;
    private int mScore = 0;
    private int mTotal = 0;
    private int mQuestionNumber = 0;

    private Handler mHandler = new Handler();

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

        updateQuestion();

        //True button logic
        mTrueButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
            String toastText;
                mTotal++;
            mAnswerText.setText(QuizData.answersText[mQuestionNumber-1]);


            if (mAnswer == true){
                mScore++;
                toastText = "Correct!";
            } else {
                toastText = "Wrong.";
            }
            updateScore();

            //check for last question
            if (isLastQuestion()){
                results();
            } else {
                updateQuestion();
            }
            Toast.makeText(QuizActivity.this, toastText, Toast.LENGTH_SHORT).show();
            }

        });

        //False button logic
        mFalseButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
            String toastText;
            mTotal++;
            mAnswerText.setText(QuizData.answersText[mQuestionNumber-1]);
            if (mAnswer == false){
                mScore++;
                toastText = "Correct!";
            } else {
                toastText = "Wrong.";
            }
            updateScore();

            //check for last question
            if (mQuestionNumber == QuizData.questions.length){
                results();
            } else {
                updateQuestion();
            }
            Toast.makeText(QuizActivity.this, toastText, Toast.LENGTH_SHORT).show();
            }

        });
    }

    private void updateQuestion(){
        mImageView.setImageResource(QuizData.images[mQuestionNumber]);
        mQuestion.setText(QuizData.questions[mQuestionNumber]);
        mAnswerText.setText("");
        mAnswer = QuizData.answers[mQuestionNumber];
        mQuestionNumber++;
    }

    //check for last question
    boolean isLastQuestion() {
        return mQuestionNumber == QuizData.questions.length;
    }

    private void results() {
        Intent i = new Intent(QuizActivity.this, ResultsActivity.class);
        Bundle bundle = new Bundle();
        bundle.putInt("finalScore", mScore);
        i.putExtras(bundle);
        QuizActivity.this.finish();
        startActivity(i);
    }

    public void updateScore(){
        mScoreView.setText("" + mScore + " of " + mTotal);
    }
}
