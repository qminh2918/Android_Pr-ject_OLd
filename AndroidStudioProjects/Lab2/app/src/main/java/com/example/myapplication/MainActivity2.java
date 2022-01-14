package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    Button finish;
    EditText name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name=(EditText)(findViewById(R.id.txt));
                finish=(Button)findViewById(R.id.btnFinish);
                TextView type=(TextView)(findViewById(R.id.done));
                String ten=name.getText().toString();
                type.setText(ten);
            }
        });
    }
}