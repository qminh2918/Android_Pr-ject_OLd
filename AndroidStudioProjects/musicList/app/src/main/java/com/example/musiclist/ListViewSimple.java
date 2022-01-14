package com.example.musiclist;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ListViewSimple extends AppCompatActivity {
    ArrayList<String> data = new ArrayList<String>();
    ListView ListView;
    MediaPlayer mp;
    ArrayAdapter arrayAdapter;


    protected void OnCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.manhinh);
        data.add("nhac");
        data.add("bai1");
        ListView = (ListView) findViewById(R.id.lvsimple);
        
    }
}
