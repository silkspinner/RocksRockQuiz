package com.nimsdev.rocksrockquiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

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
                mTotal++;
                mAnswerText.setText(QuizData.answersText[mQuestionNumber-1]);

                mHandler.postDelayed(new Runnable() {
                    public void run() {

                        if (mAnswer == true){
                            mScore++;
                            updateScore();

                            //check for last question
                            if (mQuestionNumber == QuizData.questions.length){
                                Intent i = new Intent(QuizActivity.this, ResultsActivity.class);
                                Bundle bundle = new Bundle();
                                bundle.putInt("finalScore", mScore);
                                i.putExtras(bundle);
                                QuizActivity.this.finish();
                                startActivity(i);
                            } else {
                                updateQuestion();
                            }
                        } else {
                            updateScore();
                            if (mQuestionNumber == QuizData.questions.length){
                                Intent i = new Intent(QuizActivity.this, ResultsActivity.class);
                                Bundle bundle = new Bundle();
                                bundle.putInt("finalScore", mScore);
                                i.putExtras(bundle);
                                QuizActivity.this.finish();
                                startActivity(i);
                            } else {
                                updateQuestion();
                            }
                        }

                    }
                }, 5000);

            }

        });

        //False button logic
        mFalseButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                mTotal++;
                mAnswerText.setText(QuizData.answersText[mQuestionNumber-1]);

                mHandler.postDelayed(new Runnable() {
                    public void run() {

                        if (mAnswer == false){
                            mScore++;
                            updateScore();

                            //check for last question
                            if (mQuestionNumber == QuizData.questions.length){
                                Intent i = new Intent(QuizActivity.this, ResultsActivity.class);
                                Bundle bundle = new Bundle();
                                bundle.putInt("finalScore", mScore);
                                i.putExtras(bundle);
                                QuizActivity.this.finish();
                                startActivity(i);
                            } else {
                                updateQuestion();
                            }
                        } else {
                            updateScore();
                            if (mQuestionNumber == QuizData.questions.length){
                                Intent i = new Intent(QuizActivity.this, ResultsActivity.class);
                                Bundle bundle = new Bundle();
                                bundle.putInt("finalScore", mScore);
                                i.putExtras(bundle);
                                QuizActivity.this.finish();
                                startActivity(i);
                            } else {
                                updateQuestion();
                            }
                        }

                    }
                }, 5000);

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

    public void updateScore(){
        mScoreView.setText("" + mScore + " of " + mTotal);
    }
}
