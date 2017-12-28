package com.example.bzaharic.nsguideapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;

@EActivity(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {


    @AfterViews
    void afterViews(){
        CharSequence languages[] = new CharSequence[] {"Srpski","Engleski"};

        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Izbor jezika:");
        builder.setItems(languages, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // the user clicked on language[which]
            }
        });
        builder.show();
    }


    @Click
    void btnAround(View view){
        AroundActivity_.intent(this).start();
    }



    @Click
    void btnTour(View view){
        TourActivity_.intent(this).start();
    }

    @Click
    void btnFavorite(View view){
        FavoriteActivity_.intent(this).start();
    }

}
