package com.example.bzaharic.nsguideapp;

import android.media.Image;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.widget.TextView;

import com.example.bzaharic.nsguideapp.adapters.ViewPagerAdapter;
import com.example.bzaharic.nsguideapp.database.DatabaseHelper;
import com.example.bzaharic.nsguideapp.database.MonumentDAOWrapper;
import com.example.bzaharic.nsguideapp.model.Monument;
import com.j256.ormlite.android.apptools.OpenHelperManager;
import com.j256.ormlite.dao.RuntimeExceptionDao;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.PageScrolled;
import org.androidannotations.annotations.ViewById;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@EActivity(R.layout.activity_around)
public class AroundActivity extends AppCompatActivity {

    @ViewById
    TextView txtDescription;

    @ViewById
    ViewPager viewPager;

    @Bean
    MonumentDAOWrapper monumentDAOWrapper;

    @AfterViews
    void afterViews(){
        final ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this);
        viewPager.setAdapter(viewPagerAdapter);
        final List<Monument> allMonuments = monumentDAOWrapper.getAllMonuments();
        final List<String> imageUris = new ArrayList<>();
        final List<String> descriptions = new ArrayList<>();
        for(Monument monument:allMonuments){
            imageUris.add(monument.getImageUri());
            descriptions.add(monument.getDescription());
        }
        viewPagerAdapter.setImages(imageUris);

        viewPagerAdapter.notifyDataSetChanged();
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                txtDescription.setText(descriptions.get(position));
                txtDescription.setMovementMethod(new ScrollingMovementMethod());
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }
}
