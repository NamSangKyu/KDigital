package com.example.registerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class RegisterFinActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_fin);
        TextView txtResult = findViewById(R.id.txt_result);
        Intent intent = getIntent();
        String msg = intent.getStringExtra("id")+"님 회원가입이 완료되었습니다.";
        txtResult.setText(msg);
    }
}