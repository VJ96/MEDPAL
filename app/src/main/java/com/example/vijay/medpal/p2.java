package com.example.vijay.medpal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class p2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p2);

        TextView med3 = (TextView) findViewById(R.id.m3);
        med3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(p2.this, MedChange1.class);
                startActivity(in);
            }
        });

        TextView med4 = (TextView) findViewById(R.id.m4);
        med4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(p2.this, MedChange1.class);
                startActivity(in);
            }
        });
    }
}
