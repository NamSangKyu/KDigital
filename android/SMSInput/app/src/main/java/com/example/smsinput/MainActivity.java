package com.example.smsinput;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText edtContent = findViewById(R.id.edtContent);
        TextView txtLength = findViewById(R.id.txtLength);

        Button btnExit = findViewById(R.id.btnExit);
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finishAndRemoveTask();
            }
        });

        Button btnSend = findViewById(R.id.btnSend);
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, edtContent.getText().toString(),Toast.LENGTH_SHORT).show();
            }
        });

        edtContent.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(charSequence.length() > 80){
                    //80글자까지 입력 되게끔 설정, 매번 80글자까지만 잘라내서 다시 셋팅
                    edtContent.setText(charSequence.subSequence(0,80));
                    //커서위치 설정
                    edtContent.setSelection(80);
                }

                int count = edtContent.getText().length();
                Log.d("SMSInput", "onTextChanged: 글자 개수 : "+count);
                txtLength.setText(count + " / 80 글자");
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }
}