package com.example.food;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    List<food> datalist=new ArrayList<>();
    foodAdapter FoodAdapter;
    int currentIndex =1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food);
        listView=findViewById(R.id.afo_listview);

        datalist.add(new food(R.drawable.pizza,"Pizza 01","Ok ngon 1",100000));
        datalist.add(new food(R.drawable.pizza,"Pizza 02","Ok ngon 2",110000));
        datalist.add(new food(R.drawable.pizza,"Pizza 03","Ok ngon 3",120000));

        FoodAdapter= new foodAdapter(this,datalist);
        listView.setAdapter(FoodAdapter);
        registerForContextMenu(listView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.menu_food,menu);
        return super.onCreateOptionsMenu(menu);
    }


}