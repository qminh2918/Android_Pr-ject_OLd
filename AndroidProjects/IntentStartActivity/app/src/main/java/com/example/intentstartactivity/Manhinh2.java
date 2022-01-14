package com.example.intentstartactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Manhinh2 extends AppCompatActivity {

    Button pre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manhinh2);
        pre = (Button)findViewById(R.id.btn2);
        pre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(Manhinh2.this,MainActivity.class);
                startActivity(i);
            }
        });
    }
}