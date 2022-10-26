package com.thesis.mobiserve;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class All_Day_Breakfast_Meal extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Product> productList = new ArrayList<>();
    private LinearLayoutManager manager;
    private ProductAdapter productAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.all_day_breakfast_meal);
        
        Utils.changerStatusbarAndNavigationBarColor(All_Day_Breakfast_Meal.this, R.color.whitewari, R.color.medyo_white);

        recyclerView = findViewById(R.id.recycleview);

        setProductAdapter();
    }
    private  void  setProductAdapter()
    {
        productList.add(new Product("TuyoSilog","Tuyo, Sinangag and Itlog", "Php 75.00", "R.drawable.tuyo_silog_removebg_preview"));
        productList.add(new Product("ShangSilog","Shanghai, Sinangag and Itlog", "Php 85.00", "R.drawable.shang_silog"));
        productList.add(new Product("HotSilog","Hotdog, Sinangag and Itlog", "Php 90.00", "R.drawable.hot_silog"));
        productList.add(new Product("DaingSilog","Daing, Sinangag and Itlog", "Php 100.00", "R.drawable.daing_silog"));
        productList.add(new Product("DaingSilog","Bangus, Sinangag and Itlog", "Php 100.00", "R.drawable.bang_silog"));
        productList.add(new Product("LongSilog","Footlong, Sinangag and Itlog", "Php 100.00", "R.drawable.longsilog"));
        productList.add(new Product("ToSilog","Tocino, Sinangag and Itlog", "Php 100.00", "R.drawable.tosilog"));
        productList.add(new Product("AdoboSilog","Adobo, Sinangag and Itlog", "Php 100.00", "R.drawable.adobo_silog"));
        productList.add(new Product("ChicSilog","Chicken, Sinangag and Itlog", "Php 120.00", "R.drawable.chicksilog"));
        productList.add(new Product("BaconSilog","Bacon, Sinangag and Itlog", "Php 120.00", "R.drawable.baconsilog"));
        productList.add(new Product("TapSilog","Tapa, Sinangag and Itlog", "Php 130.00", "R.drawable.tapsilog"));
        productList.add(new Product("CornSilog","Cornbeef, Sinangag and Itlog", "Php 130.00", "R.drawable.cornsilog"));


        productAdapter = new ProductAdapter(All_Day_Breakfast_Meal.this, productList );
        recyclerView.setAdapter(productAdapter);
        manager = new LinearLayoutManager(All_Day_Breakfast_Meal.this);
        manager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(manager);
    }
}