package com.example.vijay.medpal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MedChange1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_med_change1);

        Toast.makeText(getApplicationContext(),"Successfully Updated!",Toast.LENGTH_SHORT).show();
    }
}
