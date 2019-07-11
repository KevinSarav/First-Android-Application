package com.example.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SecondScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        if(getIntent().hasExtra("com.example.myapplication.SOMETHING")){
            TextView tv = findViewById(R.id.helloTextView);
            String text = getIntent().getExtras().getString("com.example.myapplication.SOMETHING");
            tv.setText(text);
        }
    }
}
