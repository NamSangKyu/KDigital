package com.example.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView list = findViewById(R.id.list_view);
        CustomListAdapter customListAdapter = new CustomListAdapter();

        customListAdapter.addItem(getDrawable(R.drawable.facebook),"페이스북");
        customListAdapter.addItem(getDrawable(R.drawable.instagram),"인스타그램");

        list.setAdapter(customListAdapter);



    }
}







