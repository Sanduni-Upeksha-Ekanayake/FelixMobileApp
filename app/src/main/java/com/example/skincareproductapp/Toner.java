package com.example.skincareproductapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Toner extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toner);

        ImageView imageView = findViewById(R.id.imageView2);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Toner.this, Profile.class);
                startActivity(intent);
            }
        });

        TextView textView = findViewById(R.id.textView15);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Toner.this, Home.class);
                startActivity(intent);
            }
        });

        ImageView imageView1 = findViewById(R.id.imageView21);

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Toner.this, Ordinary13.class);
                startActivity(intent);
            }
        });

        ImageView imageView2 = findViewById(R.id.imageView29);

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Toner.this, OrdinaryMilk.class);
                startActivity(intent);
            }
        });

        ImageView imageView3 = findViewById(R.id.imageView30);

        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Toner.this, CetaphilToner.class);
                startActivity(intent);
            }
        });
    }
}