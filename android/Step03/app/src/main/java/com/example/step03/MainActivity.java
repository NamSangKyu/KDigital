package com.example.step03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtResult;
    EditText txtId;
    EditText txtPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtResult = findViewById(R.id.txtResult);
        txtId = findViewById(R.id.txtId);
        txtPassword = findViewById(R.id.txtPassword);
    }

    //로그인 버튼을 눌렀을때 입력한 아이디, 비밀번호를 읽어오는 메서드
    public void buttonLogin(View view){
        String id = txtId.getText().toString();
        String pass = txtPassword.getText().toString();
        txtResult.setText("아이디 : "+id + "\n암호 : "+pass);
    }

}