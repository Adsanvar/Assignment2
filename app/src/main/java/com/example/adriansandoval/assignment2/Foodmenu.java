package com.example.adriansandoval.assignment2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Foodmenu extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food_menu);

        ImageButton b1 = findViewById(R.id.i2);

        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent i = new Intent("android.intent.action.Salad_list");
                i.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                startActivity(i);
            }
        });
    }
}
