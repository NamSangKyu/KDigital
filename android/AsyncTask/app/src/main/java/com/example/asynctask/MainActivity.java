package com.example.asynctask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
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
   //태스크 실행에 필요한 데이터 타입, 진행 중에 필요한 데이터 타입, 태스크 결과값 데이타입
    public class ProgressTask extends AsyncTask<Integer,Integer,Integer>{

       @Override
       protected void onPreExecute() {
           super.onPreExecute();
           //백그라운드 작업 전에 실행, 초기화 영역
           value = 0;
           bar.setProgress(value);
       }

       @Override
       protected void onPostExecute(Integer integer) {
           super.onPostExecute(integer);
           //결과값 받아서 UI 처리하는 부분
           bar.setProgress(0);
       }

       @Override
       protected void onCancelled() {
           //태스크 종료 신호를 받았을때
           bar.setProgress(0);
       }

       @Override
       protected void onProgressUpdate(Integer... values) {
           super.onProgressUpdate(values);
           //현재 작업 진행 상태 표시 ---> doInBackground에서 publishProgress 호출
           bar.setProgress(values[0]);
       }

       @Override
       protected Integer doInBackground(Integer... integers) {
           //태스크 처리 부분
           while(!isCancelled()){
               value++;
               if(value>=100) break;
               else
                   publishProgress(value);
               try {
                   Thread.sleep(500);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
           return value;
       }
   }
}







