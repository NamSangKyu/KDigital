package com.example.runactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnSecond = findViewById(R.id.btnSecond);
        btnSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);//다른 액티비티 시작
            }
        });
        TextView txtTime = findViewById(R.id.txtTime);
        Date date = Calendar.getInstance().getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        txtTime.setText(sdf.format(date));
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("RUNACTIVITY", "onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("RUNACTIVITY", "onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("RUNACTIVITY", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("RUNACTIVITY", "onDestroy");
    }
}





