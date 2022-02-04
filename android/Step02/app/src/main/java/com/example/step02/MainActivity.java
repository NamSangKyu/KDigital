package com.example.step02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imgView1;
    ImageView imgView2;

    boolean flag = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frame_layout);
        //뷰 연결
        imgView1 = findViewById(R.id.imageView);
        imgView2 = findViewById(R.id.imageView2);
    }

    public void changeImage(View view){
        flag = !flag;

        if(flag){
            imgView1.setVisibility(View.VISIBLE);
            imgView2.setVisibility(View.INVISIBLE);
        }else{
            imgView1.setVisibility(View.INVISIBLE);
            imgView2.setVisibility(View.VISIBLE);
        }
    }
}





