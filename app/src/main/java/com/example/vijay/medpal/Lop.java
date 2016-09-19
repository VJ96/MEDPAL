package com.example.vijay.medpal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Lop extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lop);

        TextView p1 = (TextView) findViewById(R.id.pat1);
        p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Lop.this, p1.class);
                startActivity(in);
            }
        });

        TextView p2 = (TextView) findViewById(R.id.pat2);
        p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Lop.this, p2.class);
                startActivity(in);
            }
        });
    }
}
