package com.example.androiduitesting;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

import ads_mobile_sdk.v7;

public class CityActivity extends androidx.appcompat.app.AppCompatActivity {
    Button back_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.city_activity);
        back_button=findViewById(R.id.back_button);
        back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(CityActivity.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}
