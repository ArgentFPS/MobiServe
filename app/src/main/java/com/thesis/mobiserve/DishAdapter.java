package com.thesis.mobiserve;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class DishAdapter extends ArrayAdapter<Dish> {
    private Context ct;
    private ArrayList<Dish> arr;

    public DishAdapter(@NonNull Context context, int resource, @NonNull List<Dish> objects) {
        super(context, resource, objects);
        this.ct= context;
        this.arr = new ArrayList<>(objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
      if (convertView == null){
          LayoutInflater i = (LayoutInflater) ct.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
          convertView = i.inflate(R.layout.main_category, null);
      }
      if(arr.size()>0){
          Dish d =arr.get(position);
      }
      return convertView;
    }
}
