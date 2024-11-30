package com.example.skincareproductapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button btn = findViewById(R.id.button2);

        btn.setOnClickListener(new View.OnClickListener(){

            @Override
           public void onClick(View v){
                Intent intent = new Intent(Login.this, Home.class);
                startActivity(intent);
            }
        });

        Button btn1 = findViewById(R.id.button3);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this, register.class);
                startActivity(intent);
            }
        });

    }
}