package com.example.bzaharic.nsguideapp;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import org.androidannotations.annotations.AfterInject;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_welcome)
public class WelcomeActivity extends AppCompatActivity {

    private static final int SPLASH_TIME_OUT = 2500;

    @Bean
    UtilityDatabaseClass utilityDatabaseClass;

    @ViewById
    ImageView image;

    @UiThread(delay = SPLASH_TIME_OUT)
    @AfterViews
    void afterViews(){
        MainActivity_.intent(this).start();
        initDatabase();
        finish();
    }

    @Background
    void initDatabase(){
        utilityDatabaseClass.addMonumentsInDatabase();
    }
}
