package com.example.truyendulieu1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SendActivity  extends AppCompatActivity {
    public static final int CODE =10;

    EditText txtsendA,txtsendB;
    Button btnsend;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.send);

        txtsendA = findViewById(R.id.txtsenda);
        txtsendB = findViewById(R.id.txtsendb);
        btnsend = (Button)findViewById(R.id.btsend);

        btnsend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SendActivity.this,RecevieActivity.class );
                int a=Integer.parseInt(txtsendA.getText().toString());
                int b=Integer.parseInt(txtsendB.getText().toString());
                intent.putExtra("so1",a);
                intent.putExtra("so2",b);
                startActivityForResult(intent,CODE);
            }
        });

    }


}
