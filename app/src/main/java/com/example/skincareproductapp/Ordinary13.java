package com.example.skincareproductapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Ordinary13 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ordinary13);

        TextView textView = findViewById(R.id.textView90);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Ordinary13.this, MyCart.class);
                startActivity(intent);
            }
        });

        Button btn = findViewById(R.id.button6);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Ordinary13.this, PlaceOrder.class);
                startActivity(intent);
            }
        });

        TextView textView1 = findViewById(R.id.textView15);

        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Ordinary13.this, Home.class);
                startActivity(intent);
            }
        });

        ImageView imageView = findViewById(R.id.imageView2);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Ordinary13.this, Profile.class);
                startActivity(intent);
            }
        });
    }
}