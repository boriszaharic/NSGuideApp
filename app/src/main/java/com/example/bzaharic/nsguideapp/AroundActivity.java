package com.example.bzaharic.nsguideapp;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.bzaharic.nsguideapp.adapters.ViewPagerAdapter;
import com.example.bzaharic.nsguideapp.database.DatabaseHelper;
import com.example.bzaharic.nsguideapp.model.Monument;
import com.j256.ormlite.android.apptools.OpenHelperManager;
import com.j256.ormlite.dao.RuntimeExceptionDao;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import java.util.List;

@EActivity(R.layout.activity_around)
public class AroundActivity extends AppCompatActivity {

    @ViewById
    ViewPager viewPager;

    @AfterViews
    void afterViews(){
        final ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this);
        viewPager.setAdapter(viewPagerAdapter);
    }
}
