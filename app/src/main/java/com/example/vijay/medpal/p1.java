package com.example.vijay.medpal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class p1 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p1);

        TextView med1 = (TextView) findViewById(R.id.m1);
        med1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(p1.this, MedChange.class);
                startActivity(in);
            }
        });

        TextView med2 = (TextView) findViewById(R.id.m2);
        med2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(p1.this, MedChange.class);
                startActivity(in);
            }
        });


    }
}
