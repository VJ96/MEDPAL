package com.example.vijay.medpal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PharSignIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phar_sign_in);

        Button sid = (Button)findViewById(R.id.s2);
        sid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(PharSignIn.this, PharDash.class);
                startActivity(in);
            }
        });

        TextView kat = (TextView) findViewById(R.id.s1);
        kat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(PharSignIn.this, PharSignUp.class);
                startActivity(in);
            }
        });
    }
}
