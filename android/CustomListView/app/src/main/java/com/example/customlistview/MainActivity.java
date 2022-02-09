package com.example.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

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
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.d("CustomList", "onItemClick: "+i);
                ListViewItem item = (ListViewItem) customListAdapter.getItem(i);
                Toast.makeText(MainActivity.this,item.getText(),Toast.LENGTH_SHORT).show();
            }
        });


    }
}







