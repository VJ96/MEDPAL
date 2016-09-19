package com.example.vijay.medpal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class signup2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup2);

        Button but=(Button)findViewById(R.id.button2);
                        but.setOnClickListener(new View.OnClickListener(){
                                   @Override
                                   public void onClick(View v){
                                       Intent in= new Intent(signup2.this, Main3Activity.class);
                                       startActivity(in);
                                   }
                               }

        );
    }
}
