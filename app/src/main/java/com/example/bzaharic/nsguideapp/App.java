package com.example.bzaharic.nsguideapp;

import android.app.Application;
import com.facebook.stetho.Stetho;

/**
 * Created by bzaharic on 20.12.17..
 */

public class App extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        Stetho.initializeWithDefaults(this);
    }
}
