package com.example.mytabviewpager.Controllers.Activities;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mytabviewpager.PageAdapter;
import com.example.mytabviewpager.databinding.ActivityMainBinding;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mMainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = mMainBinding.getRoot();
        setContentView(view);

        //Configure ViewPager
        this.configureViewPagerAndTabs();
    }

    private void configureViewPagerAndTabs() {

        //Set Adapter PageAdapter and glue it together
        mMainBinding.ViewPager.setAdapter(new PageAdapter(getSupportFragmentManager()));

        //Glue TabLayout and ViewPager together
        mMainBinding.tabLayout.setupWithViewPager(mMainBinding.ViewPager);

        //Design purpose. Tabs have the same width
        mMainBinding.tabLayout.setTabMode(TabLayout.MODE_FIXED);
    }
}