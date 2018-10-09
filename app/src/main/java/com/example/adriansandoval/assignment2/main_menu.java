package com.example.adriansandoval.assignment2;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class main_menu extends Activity {

    RelativeLayout menuBtn = null;
    RelativeLayout newsBtn = null;
    RelativeLayout moviesBtn = null;
    RelativeLayout  feedbackBtn = null;
    RelativeLayout bookingBtn = null;
    RelativeLayout contactBtn = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        menuBtn = findViewById(R.id.menuButton);
        newsBtn = findViewById(R.id.newsButton);
        moviesBtn = findViewById(R.id.moviesButton);
        feedbackBtn = findViewById(R.id.feedbackButton);
        bookingBtn = findViewById(R.id.bookingButton);
        contactBtn = findViewById(R.id.contactButton);

      menuBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(main_menu.this, "Menu Pressed", Toast.LENGTH_LONG).show();
            }
        });

        newsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(main_menu.this, "News Pressed", Toast.LENGTH_LONG).show();
            }
        });


        moviesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(main_menu.this, "Movies Pressed", Toast.LENGTH_LONG).show();
            }
        });

        feedbackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(main_menu.this, "Feedback Pressed", Toast.LENGTH_LONG).show();
            }
        });

        bookingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(main_menu.this, "Booking Pressed", Toast.LENGTH_LONG).show();
            }
        });

        contactBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(main_menu.this, "Contact Pressed", Toast.LENGTH_LONG).show();
            }
        });


    }
}
