package com.example.listview;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
ListView lv;
Button count,search;
EditText type;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);
        String [] names=new String[] {"banana","grape","orange","potato","mango"};
        lv=(ListView)findViewById(R.id.listview);
        lv.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,names));
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Object o=parent.getItemAtPosition(position);
                String qua=o.toString();
                Toast.makeText(MainActivity.this,"Bạn vừa chọn "+qua,Toast.LENGTH_LONG).show();
            }
        });
        String qua=names.toString();
        search=(Button)findViewById(R.id.tim);
        type=(EditText)findViewById(R.id.nhap);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String qua=type.getText().toString();
                for(Integer i=0;i<names.length;i++)
                {
                    if (qua.equals(names[i])){
                    Toast.makeText(MainActivity.this,"Trong list co qua: "+qua,Toast.LENGTH_LONG).show();
                    break;
                    }
                    else
                    {
                        if (i==names.length-1)
                        {
                            Toast.makeText(MainActivity.this,"Trong list khong co qua "+qua,Toast.LENGTH_LONG).show();
                        }
                    }
                }
            }
        });
        AlertDialog.Builder alert=new AlertDialog.Builder(this);
        alert.setTitle("So qua co trong listview").setMessage("Xin chao")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Integer i=names.length;
                        Toast.makeText(MainActivity.this,"Trong list co: "+i,Toast.LENGTH_LONG).show();
                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                .show();
    }
}