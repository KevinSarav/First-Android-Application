package com.example.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button screenBtn = findViewById(R.id.screenButton);
        screenBtn.setOnClickListener(new View.OnClickListener(){
           public void onClick(View view){
               Intent startIntent = new Intent(getApplicationContext(), SecondScreen.class);
               startIntent.putExtra("com.example.myapplication.SOMETHING", "HELLO WORLD!!!");
               startActivity(startIntent);
           }
        });

        Button searchBtn = findViewById(R.id.searchButton);
        searchBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                String google = "https://www.google.com/";
                Uri address = Uri.parse(google);
                Intent toGoogle = new Intent(Intent.ACTION_VIEW, address);
                if(toGoogle.resolveActivity(getPackageManager()) != null)
                    startActivity(toGoogle);
            }
        });
    }
}
