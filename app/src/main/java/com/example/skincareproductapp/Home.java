package com.example.skincareproductapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ImageView imageView2 = findViewById(R.id.imageView4);

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, Profile.class);
                startActivity(intent);
            }
        });

        ImageView imageView = findViewById(R.id.imageView58);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, All.class);
                startActivity(intent);
            }
        });

        TextView textView = findViewById(R.id.textView138);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, All.class);
                startActivity(intent);
            }
        });

        ImageView imageView1 = findViewById(R.id.imageView7);

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, Moisturizer.class);
                startActivity(intent);
            }
        });

        TextView textView1 = findViewById(R.id.textView13);

        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, Moisturizer.class);
                startActivity(intent);
            }
        });

        ImageView imageView3 = findViewById(R.id.imageView9);

        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this,Toner.class);
                startActivity(intent);
            }
        });

        TextView textView2 = findViewById(R.id.textView14);

        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, Toner.class);
                startActivity(intent);
            }
        });

        ImageView imageView4 = findViewById(R.id.imageView56);

        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, Facewash.class);
                startActivity(intent);
            }
        });

        TextView textView3 = findViewById(R.id.textView1);

        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, Facewash.class);
                startActivity(intent);
            }
        });

        ImageView imageView5 = findViewById(R.id.imageView57);

        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, Serum.class);
                startActivity(intent);
            }
        });

        TextView textView4 = findViewById(R.id.textView2);

        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, Serum.class);
                startActivity(intent);
            }
        });
    }
}