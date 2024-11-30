package com.example.skincareproductapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Serum extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_serum);

        ImageView imageView = findViewById(R.id.imageView2);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Serum.this, Profile.class);
                startActivity(intent);
            }
        });

        TextView textView = findViewById(R.id.textView15);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Serum.this, Home.class);
                startActivity(intent);
            }
        });

        ImageView imageView1 = findViewById(R.id.imageView31);

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Serum.this, Cetaphil17.class);
                startActivity(intent);
            }
        });

        ImageView imageView2 = findViewById(R.id.imageView32);

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Serum.this, Ordinary3.class);
                startActivity(intent);
            }
        });

        ImageView imageView3 = findViewById(R.id.imageView33);

        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Serum.this, Ordinary4.class);
                startActivity(intent);
            }
        });

        ImageView imageView4 = findViewById(R.id.imageView37);

        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Serum.this, Ordinary19.class);
                startActivity(intent);
            }
        });

        ImageView imageView5 = findViewById(R.id.imageView36);

        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Serum.this, Ordinary11.class);
                startActivity(intent);
            }
        });
    }
}