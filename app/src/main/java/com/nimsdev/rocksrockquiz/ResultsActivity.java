package com.nimsdev.rocksrockquiz;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ResultsActivity extends Activity {

    TextView mGrade, mFinalScore;
    Button mRetryButton;

    private SharedPreferences savedValues;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        mGrade = (TextView)findViewById(R.id.grade);
        mFinalScore = (TextView)findViewById(R.id.outOf);
        mRetryButton = (Button)findViewById(R.id.retry);

        // establish shared preferences
        PreferenceManager.setDefaultValues(this, R.xml.preferences, false);
        savedValues = getSharedPreferences("SavedValues", MODE_PRIVATE);


        Bundle bundle = getIntent().getExtras();
        int score = bundle.getInt("finalScore",0);
        int quantity = bundle.getInt("quantity",0);

        mFinalScore.setText("You scored " + score + " out of " + quantity);

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

        mRetryButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                SharedPreferences.Editor editor = savedValues.edit();
                editor.clear().commit();
                ResultsActivity.this.finish();
                startActivity(new Intent(ResultsActivity.this, MainActivity.class));
            }
        });

    }
}
