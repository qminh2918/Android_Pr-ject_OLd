package com.example.truyendulieu1;

import android.app.AppComponentFactory;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class RecevieActivity extends AppCompatActivity {
    TextView txtkq;
    Button btntong,btnback;

    @Override
    protected void onCreate(Bundle SaveInstanceState) {
        super.onCreate(SaveInstanceState);
        setContentView(R.layout.receive);
        Bundle re = getIntent().getExtras();
        if (re == null) {
            return;
        }
        int re1 = re.getInt("so1");
        int re2 = re.getInt("so2");
        int sum = re1 + re2;
        btntong = findViewById(R.id.btsum);
        txtkq = (TextView) findViewById(R.id.txtketqua);
        btnback = findViewById(R.id.btback);
        btntong.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                txtkq.setText(String.valueOf(sum));
            }
        });
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {finish();  }
        });
    }
}