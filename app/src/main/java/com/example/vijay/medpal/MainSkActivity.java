package com.example.vijay.medpal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainSkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skmain);


        TextView but=(TextView) findViewById(R.id.t1);
        but.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent in= new Intent(MainSkActivity.this, signup2.class);
                startActivity(in);
            }
        }

        );

        Button g = (Button)findViewById(R.id.dep);
        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainSkActivity.this, Main3Activity.class);
                startActivity(in);
            }
        });

    }
}
