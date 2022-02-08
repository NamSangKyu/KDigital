package com.example.event;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.textView);
        View view = findViewById(R.id.view);
        View view2 = findViewById(R.id.view2);

        view.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                float xPos = motionEvent.getX();
                float yPos = motionEvent.getY();

                String str = "";
                Log.d("EVENT", "onTouch: "+action);
                if(action == MotionEvent.ACTION_DOWN){
                    str = String.format("손가락 누름 - xpos : %f, ypos : %f",xPos,yPos);
                }else if(action == MotionEvent.ACTION_MOVE){
                    str = String.format("손가락 움직임 - xpos : %f, ypos : %f",xPos,yPos);
                }else if(action == MotionEvent.ACTION_UP){
                    str = String.format("손가락 뗌 - xpos : %f, ypos : %f",xPos,yPos);
                }
                textView.setText(textView.getText() + "\n" + str);
                return true;
            }
        });
        GestureDetector detector = new GestureDetector(this, new GestureDetector.OnGestureListener() {
            @Override
            public boolean onDown(MotionEvent motionEvent) {
                textView.setText(textView.getText()+"\n"+"onDown()");
                return true;
            }

            @Override
            public void onShowPress(MotionEvent motionEvent) {
                textView.setText(textView.getText()+"\n"+"onPress()");
            }

            @Override
            public boolean onSingleTapUp(MotionEvent motionEvent) {
                textView.setText(textView.getText()+"\n"+"onSingleTapUp()");
                return true;
            }

            @Override
            public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
                textView.setText(textView.getText()+"\n"+"onScroll()");
                return true;
            }

            @Override
            public void onLongPress(MotionEvent motionEvent) {
                textView.setText(textView.getText()+"\n"+"onLongPress()");
            }

            @Override
            public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
                textView.setText(textView.getText()+"\n"+"onFling() "+ v + " , " + v1);
                return true;
            }
        });
        view2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                detector.onTouchEvent(motionEvent);
                return true;
            }
        });
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        Log.d("EVENT", "onKeyDown: "+keyCode);
        if(keyCode == KeyEvent.KEYCODE_BACK)
            Toast.makeText(this, "백버튼 누름",Toast.LENGTH_SHORT).show();
        else if(keyCode == KeyEvent.KEYCODE_VOLUME_DOWN)
            Toast.makeText(this, "음량 줄이는 버튼 누름",Toast.LENGTH_SHORT).show();
        else if(keyCode == KeyEvent.KEYCODE_VOLUME_UP)
            Toast.makeText(this, "음량 늘리는 버튼 누름",Toast.LENGTH_SHORT).show();
        return false;
    }
}









