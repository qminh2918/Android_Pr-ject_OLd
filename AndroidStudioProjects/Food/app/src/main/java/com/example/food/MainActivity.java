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
    List<Food> datalist = new ArrayList<>();
    FoodAdapter foodAdapter;
    int currentIndex =-1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food);
        listView = findViewById(R.id.list_view);
        datalist.add(new Food(R.drawable.comrang,"Com rang","ok ngon 1",12000));
        datalist.add(new Food(R.drawable.thitcho,"Thit cho","Ok ngon",20000));
        foodAdapter = new FoodAdapter(this, datalist);
        listView.setAdapter(foodAdapter);
        registerForContextMenu(listView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.menu_food,menu);
        return super.onCreateOptionsMenu(menu);
    }
}