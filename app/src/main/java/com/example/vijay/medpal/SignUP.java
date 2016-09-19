package com.example.vijay.medpal;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.String;

public class SignUP extends AppCompatActivity {
    EditText fname, lname, email, uname, pass, repass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        fname = (EditText) findViewById(R.id.fname);
        lname = (EditText) findViewById(R.id.lname);
        email = (EditText) findViewById(R.id.email);
        uname = (EditText) findViewById(R.id.uname);
        pass = (EditText) findViewById(R.id.supwd);
        repass = (EditText) findViewById(R.id.surpwd);
    }

    //Button signup = (Button)findViewById(R.id.su);
    public void onLogin(View v) {
        if (!pass.getText().toString().equals(repass.getText().toString())) {
            Toast.makeText(getApplicationContext(), "Wrong Credentials", Toast.LENGTH_SHORT).show();


        } else {
            String n=fname.getText().toString();
            String e=email.getText().toString();
            String u=uname.getText().toString();
            String p=pass.getText().toString();
            db d=new db(this);
            d.execute(n,e,u,p);



            Intent in = new Intent(SignUP.this, SignUP2.class);
            startActivity(in);
        }


    }
}