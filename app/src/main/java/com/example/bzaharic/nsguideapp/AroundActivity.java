package com.example.bzaharic.nsguideapp;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.bzaharic.nsguideapp.Adapters.ViewPagerAdapter;
import com.example.bzaharic.nsguideapp.R;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_around)
public class AroundActivity extends AppCompatActivity {

    @ViewById
    ViewPager viewPager;

    @AfterViews
    void afterViews(){
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this);
        viewPager.setAdapter(viewPagerAdapter);
    }
}
