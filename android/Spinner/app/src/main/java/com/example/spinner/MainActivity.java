package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.textView);
        Spinner spinner = findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this,
                        spinner.getSelectedItem().toString(),Toast.LENGTH_LONG).show();
                textView.setText(i + " - " + spinner.getSelectedItem().toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        Spinner customSpinner = findViewById(R.id.spinner2);
        TextView textView2 = findViewById(R.id.textView2);

        CustomSpinnerAdapter adapter = new CustomSpinnerAdapter();
        adapter.addItem(getDrawable(R.drawable.china),"중국");
        adapter.addItem(getDrawable(R.drawable.fance),"프랑스");
        adapter.addItem(getDrawable(R.drawable.united),"미국");
        adapter.addItem(getDrawable(R.drawable.japan),"일본");

        customSpinner.setAdapter(adapter);

        customSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                SpinnerItem item = (SpinnerItem) adapter.getItem(i);
                textView2.setText(item.getText());
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        CheckBox checkBox = findViewById(R.id.checkBox);

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                Log.d("Spinner", "onCheckedChanged: "+checkBox.isChecked());
            }
        });
    }
}










