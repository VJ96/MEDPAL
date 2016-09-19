package com.example.vijay.medpal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FIrstPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);

        TextView l = (TextView) findViewById(R.id.d);
        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(FIrstPage.this, MainActivity.class);
                startActivity(in);
            }
        });

        TextView z = (TextView) findViewById(R.id.ph);
        z.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(FIrstPage.this, PharSignIn.class);
                startActivity(in);
            }
        });

        TextView x1 = (TextView) findViewById(R.id.p);
        x1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(FIrstPage.this, MainSkActivity.class);
                startActivity(in);
            }
        });

    }
}
