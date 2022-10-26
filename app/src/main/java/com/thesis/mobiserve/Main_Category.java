package com.thesis.mobiserve;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Main_Category extends AppCompatActivity {

    ListView lvdish;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_category);
        lvdish = findViewById(R.id.lvdish);

        ArrayList<Dish> arr = new ArrayList<>();
            while (arr.size()<10){
                arr.add(new Dish());
            }
        DishAdapter adapter = new DishAdapter(this, 0,arr);
            lvdish.setAdapter(adapter);
    }
}