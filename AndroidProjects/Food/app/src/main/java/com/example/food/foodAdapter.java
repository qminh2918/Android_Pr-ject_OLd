package com.example.food;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class foodAdapter extends BaseAdapter {
    Activity activity;
    List<food> foodList;

    public foodAdapter(Activity activity, List<food> foodList) {
        this.activity = activity;
        this.foodList = foodList;
    }



    @Override
    public int getCount() {
        return foodList.size();
    }

    @Override
    public Object getItem(int position) {
        return foodList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater=activity.getLayoutInflater();
        convertView = layoutInflater.inflate(R.layout.item_food,null);

        ImageView image= convertView.findViewById(R.id.ifo_thumbnail);
        TextView tieude=convertView.findViewById(R.id.ifo_title);
        TextView noidung=convertView.findViewById(R.id.if0_content);
        TextView gia=convertView.findViewById(R.id.ifo_price);
        food Food = foodList.get(position);
        image.setImageResource(Food.getId());
        tieude.setText(Food.getTitle());
        noidung.setText(Food.getContent());
        gia.setText(String.valueOf(Food.getPrice()));
        return convertView;
    }
}
