package com.example.zolotarevlab1;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class secondActivity extends AppCompatActivity {

    private TextView textViewParameter;
    private static final String PARAMETER_KEY = "parameter_key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        textViewParameter = findViewById(R.id.textViewParameter);


        Intent intent = getIntent();
        String parameterValue = intent.getStringExtra(PARAMETER_KEY);


        textViewParameter.setText("Переданный параметр: " + parameterValue);
    }
}