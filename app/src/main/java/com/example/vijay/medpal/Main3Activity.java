package com.example.vijay.medpal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        TextView as1  = (TextView) findViewById(R.id.d1);
        as1.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {
                                       Intent in = new Intent(Main3Activity.this, com.example.vijay.medpal.skp1.class);
                                       startActivity(in);
                                   }
                               }

        );

        TextView as2 = (TextView) findViewById(R.id.th1);
        as2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Main3Activity.this, com.example.vijay.medpal.thy.class);
                startActivity(in);
            }

        });
    }
}