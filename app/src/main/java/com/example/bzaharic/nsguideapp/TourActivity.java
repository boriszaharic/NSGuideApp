package com.example.bzaharic.nsguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bzaharic on 22.12.17..
 */

public class TourActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    TourAdapter tourAdapter;
    List<Tour> tourList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_tour);

        // Tour list

        tourList = new ArrayList<>();

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        //adding some items to our list
        tourList.add(
                new Tour(
                        1,
                        "Crvena",
                        "Gradska kuća, Spomenik Svetozaru Miletiću, Hotel “Vojvodina”, Rimokatolička Crkva Imena Marijinog, Kulturni centar Novog Sada (KCNS), Zgrada Rimokatoličkog župnog ureda – Plebanija, Ulica Laze Telečkog, Grčkoškolska ulica, Srpska pravoslavna Crkva Sv. Georgija (Saborna crkva), Gimnazija “Jovan Jovanović Zmaj”, Matica srpska, Srpska pravoslavna Crkva prenosa moštiju Sv. Nikole – Nikolajevska crkva, Srpska pravoslavna Crkva Sv. Tri Jerarha – Almaška crkva, Slovačka Evangelička crkva A.V., Grkokatolička crkva Sv. Apostola Petra i Pavla, Novosadsko pozorište - Újvidéki Színház, Sprska pravoslavna Crkva Uspenja Bogorodice, Reformatska hrišćanska crkva, Novosadska sinagoga, Srpsko narodno pozorište",
                        10,
                        4,
                        R.drawable.slide1));

        tourList.add(
                new Tour(
                        2,
                        "Plava",
                        "Ulica Zmaj Jovina, Spomenik Jovanu Jovanoviću Zmaju, Vladičanski dvor, Kuća “Kod belog Lava”, Dunavska ulica, Gradska biblioteka, Zbirka strane umetnosti, Pozorište mladih, Dunavski park, Muzej Vojvodine, Muzej savremene umetnosti Vojvodine, Riblja pijaca, Zgrada Vlada i Skupštine Autonomne pokrajine Vojvodine, Galerija Matice srpske, Spomen zbirka Pavla Beljanskog, Galerija likovne umetnosti poklon zbirka Rajka Mamuzića",
                        7,
                        3,
                        R.drawable.slide2));

        tourList.add(
                new Tour(
                        3,
                        "Zuta",
                        "Petrovaradinska tvrđava, Kapela Sv. Apostola Pavla, Kuća Josipa Jelačića, Beogradska kapija, Rimokatolička Crkva Svetog Juraja, Toranj sa satom, Terasa tvrđave, Planetarijum, Podzemne vojne galerije, Muzej Grada Novog Sada, Udruženje 'Likovni krug', Leopoldova kapija, Atelje 61",
                        5,
                        3,
                        R.drawable.slide3));

        tourList.add(
                new Tour(
                        4,
                        "Zelena",
                        "Univerzitetski kampus, SPENS - Sportsko poslovni centar Vojvodina, Prirodnjačka zbirka Zavoda za zaštitu prirode, Stadion FK Vojvodine “Karađorđe”, Kupalište Štrand, Sunčani kej, Kineska četvrt, Spomenik žrtvama racije 'Porodica'. ",
                        6,
                        3,
                        R.drawable.slide1));

        tourList.add(
                new Tour(
                        5,
                        "Najbliza",
                        "Univerzitetski kampus, SPENS - Sportsko poslovni centar Vojvodina, Prirodnjačka zbirka Zavoda za zaštitu prirode, Stadion FK Vojvodine “Karađorđe”",
                        7,
                        3,
                        R.drawable.slide2));

        tourList.add(
                new Tour(
                        6,
                        "Custom",
                        "Custom",
                        10,
                        5,
                        R.drawable.slide3));

        //creating recyclerview adapter
        TourAdapter adapter = new TourAdapter(this, tourList);

        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);

    }
}
