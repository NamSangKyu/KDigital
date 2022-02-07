package com.example.step04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.button);
        EditText txt = findViewById(R.id.txt);

        //버튼 이벤트 처리
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast 메세지 - txt에 입력된 내용을  띄우기
                Toast.makeText(MainActivity.this,txt.getText().toString(),Toast.LENGTH_LONG).show();
            }
        });

        Button btnExit = findViewById(R.id.btnExit);
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finishAndRemoveTask();// 종료시 태스크 리스트에 남지 않음
                //finish(); 종료가 되도 태스크 리스트에 남음
            }
        });

    }
    public void onClick(View view){
        Toast.makeText(this,"메세지",Toast.LENGTH_LONG).show();
    }
}






