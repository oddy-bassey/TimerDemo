package com.example.timerdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*new CountDownTimer(10000, 1000){

            @Override
            public void onTick(long millisUntilFinished) {
                Log.i("Time left-", String.valueOf(millisUntilFinished / 1000));
            }

            @Override
            public void onFinish() {
                Log.i("Time left-", "We are done! No more countdown.");
            }
        }.start();*/

        //this type of timer runs continuously except a condition is used to contorl its execution
        final Handler handler = new Handler();

        final Runnable run = new Runnable() {
            @Override
            public void run() {
                Log.i("Running", "sec passed");

                handler.postDelayed(this, 1000);
            }
        };
        handler.post(run);
    }
}
