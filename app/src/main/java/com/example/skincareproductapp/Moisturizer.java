package com.example.skincareproductapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Moisturizer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moisturizer);

        ImageView imageView = findViewById(R.id.imageView6);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Moisturizer.this, Ordinary18.class);
                startActivity(intent);
            }
        });

        ImageView imageview2 = findViewById(R.id.imageView8);

        imageview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Moisturizer.this, Ordinary23.class);
                startActivity(intent);
            }
        });

        ImageView imageview3 = findViewById(R.id.imageView10);

        imageview3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Moisturizer.this, Ordinary24.class);
                startActivity(intent);
            }
        });

        ImageView imageview4 = findViewById(R.id.imageView11);

        imageview4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Moisturizer.this, Ordinary26.class);
                startActivity(intent);
            }
        });

        ImageView imageview5 = findViewById(R.id.imageView12);

        imageview5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Moisturizer.this, Cetaphil13.class);
                startActivity(intent);
            }
        });

        ImageView imageview6 = findViewById(R.id.imageView15);

        imageview6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Moisturizer.this, Cetaphil7.class);
                startActivity(intent);
            }
        });

        ImageView imageview7 = findViewById(R.id.imageView16);

        imageview7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Moisturizer.this, Cetaphil10.class);
                startActivity(intent);
            }
        });

        ImageView imageview8 = findViewById(R.id.imageView17);

        imageview8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Moisturizer.this, Cetaphil11.class);
                startActivity(intent);
            }
        });

        ImageView imageview9 = findViewById(R.id.imageView18);

        imageview9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Moisturizer.this, Cetaphil12.class);
                startActivity(intent);
            }
        });

        ImageView imageview10 = findViewById(R.id.imageView19);

        imageview10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Moisturizer.this, Cetaphil13.class);
                startActivity(intent);
            }
        });

        ImageView imageview11 = findViewById(R.id.imageView20);

        imageview11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Moisturizer.this, Cetaphil15.class);
                startActivity(intent);
            }
        });

        ImageView imageview12 = findViewById(R.id.imageView22);

        imageview12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Moisturizer.this, Cetaphil18.class);
                startActivity(intent);
            }
        });

        ImageView imageview13 = findViewById(R.id.imageView23);

        imageview13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Moisturizer.this, Cetaphil19.class);
                startActivity(intent);
            }
        });

        ImageView imageview14 = findViewById(R.id.imageView24);

        imageview14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Moisturizer.this, Cetaphil20.class);
                startActivity(intent);
            }
        });

        ImageView imageview15 = findViewById(R.id.imageView25);

        imageview15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Moisturizer.this, Cetaphil23.class);
                startActivity(intent);
            }
        });

        ImageView imageview16 = findViewById(R.id.imageView26);

        imageview16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Moisturizer.this, Cetaphil24.class);
                startActivity(intent);
            }
        });

        ImageView imageview17 = findViewById(R.id.imageView27);

        imageview17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Moisturizer.this, Cetaphil27.class);
                startActivity(intent);
            }
        });

        ImageView imageview18 = findViewById(R.id.imageView28);

        imageview18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Moisturizer.this, Cetaphil28.class);
                startActivity(intent);
            }
        });

        ImageView imageView19 = findViewById(R.id.imageView2);

        imageView19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Moisturizer.this, Profile.class);
                startActivity(intent);
            }
        });

        TextView textView = findViewById(R.id.textView15);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Moisturizer.this, Home.class);
                startActivity(intent);
            }
        });
    }
}