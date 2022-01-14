package com.example.listviewex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {
    ListView lv;
    EditText et;
    Button count,search;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);
        String [] names= new String[] {"banana","grape","orange","potato","mango","mango2","mango3","mango4","mango5","mango6"};
        lv=(ListView)findViewById(R.id.listView);
        lv.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,names));
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Object o=parent.getItemAtPosition(position);
                String qua= o.toString();
                Toast.makeText(MainActivity.this,"Ban vua chon "+qua,Toast.LENGTH_LONG).show();
            }
        });

        et=(EditText)findViewById(R.id.SearchText);
        count=(Button)findViewById(R.id.btnCount);
        search=(Button)findViewById(R.id.btnSearch);

        count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer text = names.length;
                Toast.makeText(MainActivity.this,"Count: "+text,Toast.LENGTH_LONG).show();
            }
        });

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int dem = 0;
                String get = et.getText().toString();
                for(int i=0;i<names.length;i++){
                    if(get.equals(names[i])){
                        Toast.makeText(MainActivity.this,"Co "+get,Toast.LENGTH_LONG).show();
                        break;
                    }else {
                        dem++;
                    }
                }
                if(dem == names.length){
                    Toast.makeText(MainActivity.this,"ko Co "+get,Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}