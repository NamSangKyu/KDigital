package com.example.lifecycle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("LIFE_TAG", "onCreat");
        TextView textView = findViewById(R.id.textView);
        textView.setText("Data Setting");
        EditText editText = findViewById(R.id.edtText);
        Button button = findViewById(R.id.btnSave);

        if(savedInstanceState != null) {
            str = savedInstanceState.getString("str");
            Toast.makeText(MainActivity.this, str + " 읽어왔습니다.", Toast.LENGTH_SHORT).show();
        }
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = editText.getText().toString();
                Toast.makeText(MainActivity.this, str + " 저장되었습니다.",Toast.LENGTH_SHORT).show();
            }
        });
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LIFE_TAG", "onStart");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LIFE_TAG", "onStop");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LIFE_TAG", "onDestroy");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LIFE_TAG", "onPause");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LIFE_TAG", "onResume");
    }

    @Override
    //액티비티가 종료되기전의 상태를 저장
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("str",str);
    }
}







