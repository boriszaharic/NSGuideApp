package com.example.bzaharic.nsguideapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CharSequence languages[] = new CharSequence[] {"Srpski","Engleski"};

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Izbor jezika:");
        builder.setItems(languages, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // the user clicked on language[which]
            }
        });
        builder.show();

    }

    public void btnAround(View view){
        Intent i = new Intent(this, Around.class);
        startActivity(i);
    }

    public void btnTour(View view){
        Intent i = new Intent(this, TourActivity.class);
        startActivity(i);
    }

    public void btnFavorite(View view){
        Intent i = new Intent(this, FavoriteActivity.class);
        startActivity(i);
    }

}
