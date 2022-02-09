package com.example.runactivity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button btnExit = findViewById(R.id.btnExit);
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        Button btnThrid = findViewById(R.id.btnThird);
        btnThrid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondActivity.this,ThirdActivity.class);
                //startActivity(intent);
                startActivityForResult(intent, 1000);
            }
        });
        //MainActivity에서 보낸 데이터 읽어오기
        Intent intent = getIntent();
        Toast.makeText(SecondActivity.this,intent.getStringExtra("data"),Toast.LENGTH_SHORT).show();
    }

    //ThirdActivity에서 결과값 받음
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        Toast.makeText(SecondActivity.this,
                requestCode + " , " + resultCode + " , " + data.getStringExtra("result"),Toast.LENGTH_LONG).show();

    }
}




