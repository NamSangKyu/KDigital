package com.example.quest01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.media.Image;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {
    ImageView imgView1;
    ImageView imgView2;

    BitmapDrawable bitmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //이미지뷰 연결
        imgView1 = findViewById(R.id.imgView1);
        imgView2 = findViewById(R.id.imgView2);
        //이미지 로드
        Resources res = getResources();
        bitmap = (BitmapDrawable) res.getDrawable(R.drawable.pier);

        //이미지 설정
        imgView1.setImageDrawable(bitmap);
        imgView2.setImageDrawable(null);
    }
}