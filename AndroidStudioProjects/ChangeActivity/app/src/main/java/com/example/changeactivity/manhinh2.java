package com.example.changeactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class manhinh2 extends AppCompatActivity {
    Button back;

    EditText pass,user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manhinh2);
        back=(Button)findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                pass=(EditText)findViewById(R.id.pwd);
                user=(EditText)findViewById(R.id.id);
                String textToPass = pass.getText().toString();
                String textToUser = user.getText().toString();
                    Intent i = new Intent(manhinh2.this, MainActivity.class);
                    i.putExtra(Intent.EXTRA_TEXT, textToPass);
                    i.putExtra(Intent.EXTRA_TEXT, textToUser);
                    startActivity(i);
            }
        });
    }
}