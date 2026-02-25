package com.example.androiduitesting;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import ads_mobile_sdk.v7;

public class CityActivity extends AppCompatActivity {
    Button back_button;
    TextView display_name;
    ArrayList<String> dataList;
    Integer index;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            dataList = extras.getStringArrayList("DataList");
            index = extras.getInt("index");
        }
        setContentView(R.layout.city_activity);
        display_name=findViewById(R.id.city_name);
        display_name.setText(dataList.get(index));

        back_button=findViewById(R.id.back_button);
        back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(CityActivity.this, MainActivity.class);
                intent2.putExtra("DataList", dataList);
                startActivity(intent2);
            }
        });
    }
}
