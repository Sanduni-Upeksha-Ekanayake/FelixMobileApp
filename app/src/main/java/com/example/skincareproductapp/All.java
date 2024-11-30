package com.example.skincareproductapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class All extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all);

        TextView textView = findViewById(R.id.textView15);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(All.this, Home.class);
                startActivity(intent);
            }
        });

        ImageView imageView =  findViewById(R.id.imageView2);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(All.this, Profile.class);
                startActivity(intent);
            }
        });

        ImageView imageView1 =  findViewById(R.id.imageView13);

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(All.this, Ordinary11.class);
                startActivity(intent);
            }
        });

        ImageView imageView2 =  findViewById(R.id.imageView14);

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(All.this, Ordinary24.class);
                startActivity(intent);
            }
        });

        ImageView imageView3 =  findViewById(R.id.imageView3);

        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(All.this, Cetaphil13.class);
                startActivity(intent);
            }
        });

        ImageView imageView4 =  findViewById(R.id.imageView5);

        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(All.this, Cetaphil3.class);
                startActivity(intent);
            }
        });
    }
}