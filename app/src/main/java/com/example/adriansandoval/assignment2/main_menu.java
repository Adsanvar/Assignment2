package com.example.adriansandoval.assignment2;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.PopupMenu;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.Toast;

public class main_menu extends Activity {

    RelativeLayout menuBtn = null;
    RelativeLayout newsBtn = null;
    RelativeLayout wineBtn = null;
    RelativeLayout  feedbackBtn = null;
    RelativeLayout bookingBtn = null;
    RelativeLayout contactBtn = null;
    int click =0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        menuBtn = findViewById(R.id.menuButton);
        newsBtn = findViewById(R.id.newsButton);
        wineBtn = findViewById(R.id.moviesButton);
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
                click++;

                Toast.makeText(main_menu.this, "News Pressed", Toast.LENGTH_LONG).show();
                if(click ==1){
                    Intent intent = new Intent(v.getContext(), News.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                    v.getContext().startActivity(intent);
                }
                if(click == 2){
                    //Mahdura's page
                    Toast.makeText(main_menu.this, "Mahdura's Page", Toast.LENGTH_LONG).show();
                    click=0;
                }

            }
        });


        wineBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(main_menu.this, "Wine Pressed", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(v.getContext(), WineList.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                v.getContext().startActivity(intent);

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
                Intent intent = new Intent(v.getContext(), Booking.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                v.getContext().startActivity(intent);
            }
        });

        contactBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(main_menu.this, "Contact Pressed", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(v.getContext(), contact.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                v.getContext().startActivity(intent);
            }
        });


    }

}
