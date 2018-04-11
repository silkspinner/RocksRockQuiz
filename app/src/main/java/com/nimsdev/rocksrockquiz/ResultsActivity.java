package com.nimsdev.rocksrockquiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ResultsActivity extends Activity {

    TextView mGrade, mFinalScore;
    Button mRetryButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        mGrade = (TextView)findViewById(R.id.grade);
        mFinalScore = (TextView)findViewById(R.id.outOf);
        mRetryButton = (Button)findViewById(R.id.retry);

        Bundle bundle = getIntent().getExtras();
        int score = bundle.getInt("finalScore");

        mFinalScore.setText("You scored " + score + " out of " + QuizData.questions.length);

        float percent = (float)score / (float)QuizData.questions.length;

        if (percent == 1.0) {
            mGrade.setText("Perfect!!");
        } else if (percent >= 0.850) {
            mGrade.setText("Great job!");
        } else if (percent >= 0.750) {
            mGrade.setText("Not bad!");
        } else if (percent >= 0.650) {
            mGrade.setText("Good effort.");
        } else {
            mGrade.setText("Better hit the rock books.");
        }

        mRetryButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ResultsActivity.this, QuizActivity.class));
                ResultsActivity.this.finish();
            }
        });

    }
}
