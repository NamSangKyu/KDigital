package com.example.scrollview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {
    ScrollView scrollView;
    ImageView imageView;
    BitmapDrawable bitmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scrollView = findViewById(R.id.scrollView);
        imageView = findViewById(R.id.imgView);
        scrollView.setHorizontalScrollBarEnabled(true);//수평 스크롤바 설정

        //리소스 이미지
        Resources res = getResources();
        bitmap = (BitmapDrawable) res.getDrawable(R.drawable.pier);

        imageView.setImageDrawable(bitmap);
    }

    public void buttonClick(View view){
        changeImage();
    }

    public void changeImage(){
        Resources res = getResources();
        bitmap = (BitmapDrawable) res.getDrawable(R.drawable.nature);
        imageView.setImageDrawable(bitmap);
        //imageView.setImageDrawable(null);//이미지 없음
    }
}





