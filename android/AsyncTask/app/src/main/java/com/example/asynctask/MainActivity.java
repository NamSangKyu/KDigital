package com.example.asynctask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
    ProgressBar bar;
    Button btnRun;
    Button btnStop;

    int value=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bar = findViewById(R.id.progressBar);
        btnRun = findViewById(R.id.btnStart);

        btnRun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                ProgressThread thread = new ProgressThread(bar);
//                thread.start();
            }
        });
        btnStop = findViewById(R.id.btnStop);
    }

   /* public class ProgressThread extends Thread{
        @Override
        public void run() {
            while(value < 100){
                value+=5;
                bar.setProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }*/
}







