package com.example.intentktm;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button call, goole , sua, xem, xemhet, nhan, tim, maps;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        maps=findViewById(R.id.mk);
        call=findViewById(R.id.dial);
        goole=findViewById(R.id.goole);
        sua=findViewById(R.id.edit);
        xem=findViewById(R.id.view);
        xemhet=findViewById(R.id.viewlist);
        nhan=findViewById(R.id.sms);
        tim=findViewById(R.id.search);
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(Intent.ACTION_DIAL, Uri.parse("tel:0945807550"));
                startActivity(i);
            }
        });
        goole.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(Intent.ACTION_VIEW, Uri.parse("https://daotao.uneti.edu.vn"));
                startActivity(i);
            }
        });
        sua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(Intent.ACTION_EDIT, Uri.parse("content://contacts/people/2"));
                startActivity(i);
            }
        });
        xem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(Intent.ACTION_VIEW, Uri.parse("content://contacts/people/3"));
                startActivity(i);
            }
        });
        xemhet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(Intent.ACTION_VIEW, Uri.parse("content://contacts/people"));
                startActivity(i);
            }
        });
        tim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(Intent.ACTION_WEB_SEARCH);
                i.putExtra(SearchManager.QUERY,"Hoa");
                startActivity(i);
            }
        });
        nhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(Intent.ACTION_SENDTO, Uri.parse("smsto:0345399069"));
                i.putExtra("sms_body", "De lele te");
                startActivity(i);
            }
        });
        maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(Intent.ACTION_VIEW, Uri.parse("geo:XVW8+76"));
                startActivity(i);
            }
        });
    }
}