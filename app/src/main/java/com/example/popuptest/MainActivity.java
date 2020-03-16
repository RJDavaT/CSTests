package com.example.popuptest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button bopen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bopen=findViewById(R.id.button);
        bopen.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //Intent i=getPackageManager().getLaunchIntentForPackage("com.example.popuptest");
                //startActivity(i);
                startService(new Intent(getBaseContext(), AppChecker.class));

            }
        });
    }
}
