package com.example.music;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {
    private List<Baihat> lisstbh ;
    private ListView lv;
    private Intent intent;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        lv=findViewById(R.id.lv);
        lisstbh=new ArrayList<>();
        lisstbh.add(new Baihat("Blue Tequila",R.raw.bluetequila));
        lisstbh.add(new Baihat("Fly me to the moon",R.raw.flymetothemoon));
        lisstbh.add(new Baihat("Ngày khác lạ",R.raw.ngaykhacla));
        lisstbh.add(new Baihat("Như anh mơ",R.raw.nhuanhmo));
        DSAdapter dsAdapter=new DSAdapter(this,lisstbh);
        lv.setAdapter(dsAdapter);
        intent=new Intent(this,PlayActivity.class);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
           intent.putExtra("BAIHAT",lisstbh.get(position));
           startActivity(intent);
            }
        });


    }
}
