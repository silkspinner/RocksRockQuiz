package com.nimsdev.rocksrockquiz;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ResultsActivity extends Activity {

    TextView mGrade, mFinalScore, mLevel;
    Button mRetryButton;

    private SharedPreferences savedValues;

    Handler restartHandler = new Handler();
    Runnable restartRunnable = new Runnable() {
        @Override
        public void run() {

            SharedPreferences.Editor editor = savedValues.edit();
            editor.clear().commit();
            ResultsActivity.this.finish();
            startActivity(new Intent(ResultsActivity.this, MainActivity.class));
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
       mGrade = (TextView)findViewById(R.id.grade);
        mFinalScore = (TextView)findViewById(R.id.outOf);
        mRetryButton = (Button)findViewById(R.id.retry);
        mLevel = (TextView)findViewById(R.id.levelTextView);

        // establish shared preferences
        PreferenceManager.setDefaultValues(this, R.xml.preferences, false);
        savedValues = getSharedPreferences("SavedValues", MODE_PRIVATE);


        Bundle bundle = getIntent().getExtras();
        int score = bundle.getInt("finalScore",0);
        int quantity = bundle.getInt("quantity",0);
        int level = bundle.getInt("level",0);

        mFinalScore.setText("You scored " + String.valueOf(score) + " out of " + String.valueOf(quantity));
        mLevel.setText("Quiz Level " + String.valueOf(level));

        float percent = (float)score / (float)quantity;

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

        // launch restartRunnable to restart quiz after 1 minute if button not pressed
        restartHandler.postDelayed(restartRunnable, 60000); // Millisecond 1000 = 1 sec


        mRetryButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                // cancel restartRunnable since button is pressed
                restartHandler.removeCallbacks(restartRunnable);

                SharedPreferences.Editor editor = savedValues.edit();
                editor.clear().commit();
                //launch main
                ResultsActivity.this.finish();
                startActivity(new Intent(ResultsActivity.this, MainActivity.class));
            }
        });

    }
}
