package com.example.skincareproductapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Facewash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facewash);

        ImageView imageView = findViewById(R.id.imageView2);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Facewash.this, Profile.class);
                startActivity(intent);
            }
        });

        TextView textView = findViewById(R.id.textView15);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Facewash.this, Home.class);
                startActivity(intent);
            }
        });

        ImageView imageView1 = findViewById(R.id.imageView34);

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Facewash.this, Cetaphil4.class);
                startActivity(intent);
            }
        });

        ImageView imageView2 = findViewById(R.id.imageView35);

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Facewash.this, Cetaphil5.class);
                startActivity(intent);
            }
        });

        ImageView imageView3 = findViewById(R.id.imageView38);

        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Facewash.this, Cetaphil8.class);
                startActivity(intent);
            }
        });

        ImageView imageView4 = findViewById(R.id.imageView39);

        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Facewash.this, Cetaphil14.class);
                startActivity(intent);
            }
        });

        ImageView imageView5 = findViewById(R.id.imageView40);

        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Facewash.this, Cetaphil6.class);
                startActivity(intent);
            }
        });

        ImageView imageView6 = findViewById(R.id.imageView41);

        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Facewash.this, Cetaphil21.class);
                startActivity(intent);
            }
        });

        ImageView imageView7 = findViewById(R.id.imageView42);

        imageView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Facewash.this, Ordinary8.class);
                startActivity(intent);
            }
        });
    }
}