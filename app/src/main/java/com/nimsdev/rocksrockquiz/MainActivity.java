package com.nimsdev.rocksrockquiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    Button  mStartButton1, mStartButton2, mStartButton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mStartButton1 = (Button)findViewById(R.id.startButton1);
        mStartButton2 = (Button)findViewById(R.id.startButton2);
        mStartButton3 = (Button)findViewById(R.id.startButton3);

        mStartButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity.this, QuizActivity.class);
                Bundle bundle = new Bundle();
                bundle.putInt("level", 1);
                i.putExtras(bundle);
                startActivity(i);
            }
        });

        mStartButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity.this, QuizActivity.class);
                Bundle bundle = new Bundle();
                bundle.putInt("level", 2);
                i.putExtras(bundle);
                startActivity(i);
            }
        });

        mStartButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity.this, QuizActivity.class);
                Bundle bundle = new Bundle();
                bundle.putInt("level", 3);
                i.putExtras(bundle);
                startActivity(i);
            }
        });
    }
}
