package com.example.registerapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText edtId = findViewById(R.id.edt_id);
        EditText edtPass1 = findViewById(R.id.edt_pass1);
        EditText edtPass2 = findViewById(R.id.edt_pass2);
        CheckBox chk = findViewById(R.id.chk_agree);
        Button button= findViewById(R.id.btn_register);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String result = "";
                if(edtId.getText().length() < 6){
                    result = "아이디는 6글자 이상 입력해야 합니다.";
                }else if(!edtPass1.getText().toString().equals(edtPass2.getText().toString())){
                    result = "암호는 일치해야 합니다.";
                }else if(!chk.isChecked()){
                    result = "약관 동의를 해야 가입이 가능합니다.";
                }

                if(result.length()!=0){
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setTitle("오류");
                    builder.setMessage(result);
                    builder.setPositiveButton("yes",null);
                    builder.setNeutralButton("cancel",null);
                    AlertDialog dialog = builder.create();
                    dialog.show();
                }else{
                    Intent intent = new Intent(MainActivity.this, RegisterFinActivity.class);
                    intent.putExtra("id",edtId.getText().toString());
                    startActivity(intent);
                }

            }
        });
    }
}








