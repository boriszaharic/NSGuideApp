package com.example.bzaharic.nsguideapp;

import android.app.Application;
import com.facebook.stetho.Stetho;

import org.androidannotations.annotations.EApplication;

/**
 * Created by bzaharic on 20.12.17..
 */

@EApplication
public class App extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        Stetho.initializeWithDefaults(this);
    }
}
