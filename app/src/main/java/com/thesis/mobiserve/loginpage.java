package com.thesis.mobiserve;

import android.os.Bundle;
import android.view.ViewGroup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class loginpage extends AppCompatActivity {

   private TabLayout tbllayout;
   private ViewPager viewpager;
   private TabItem Log, Sign;
   public PageAdapter pageAdapter;
    private Object PageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_page);

        tbllayout = (TabLayout) findViewById(R.id.tbl_layout);
        viewpager = findViewById(R.id.view_pager);
        Log = (TabItem) findViewById(R.id.login);
        Sign = (TabItem) findViewById(R.id.signup);

        PageAdapter = new PageAdapter(getSupportFragmentManager(), tbllayout.getTabCount());
        viewpager.setAdapter((PagerAdapter) PageAdapter);

        tbllayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewpager.setCurrentItem(tab.getPosition());
                if (tab.getPosition() == 0) {
                    pageAdapter.notifyDataSetChanged();
                } if (tab.getPosition() == 1){
                        pageAdapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


        viewpager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tbllayout));



    }
}