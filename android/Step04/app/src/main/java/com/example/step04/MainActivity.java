package com.example.step04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.KeyListener;
import android.util.Log;
import android.view.KeyEvent;
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

        //버튼 클릭 이벤트 처리
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast 메세지 - txt에 입력된 내용을  띄우기
                Toast.makeText(MainActivity.this,txt.getText().toString(),Toast.LENGTH_LONG).show();
            }
        });

        //버튼 클릭 이벤트 처리
        Button btnExit = findViewById(R.id.btnExit);
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finishAndRemoveTask();// 종료시 태스크 리스트에 남지 않음
                //finish(); 종료가 되도 태스크 리스트에 남음
            }
        });

        //EditText 이벤트 처리
        //setOnKeyListener는 PC 키보드 눌렀을때 이벤트
//        txt.setOnKeyListener(new View.OnKeyListener() {
//            @Override
//            public boolean onKey(View view, int i, KeyEvent keyEvent) {
//                Toast.makeText(MainActivity.this,i+"",Toast.LENGTH_SHORT).show();
//                return false;
//            }
//        });
        //입력된 텍스트가 변했을때 이벤트 처리
        txt.addTextChangedListener(new TextWatcher() {

            //charSequence 입력된 내용
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                //내용이 변하기 전
                Log.d("TextEvent", "beforeTextChanged: "+charSequence);
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                //입력된 내용용
               Log.d("TextEvent", "onTextChanged: "+charSequence);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }
    public void onClick(View view){
        Toast.makeText(this,"메세지",Toast.LENGTH_LONG).show();
    }
}






