package com.example.bzaharic.nsguideapp.database;

/**
 * Created by bzaharic on 28.12.17..
 */

import com.example.bzaharic.nsguideapp.model.Monument;

import org.androidannotations.annotations.EBean;
import org.androidannotations.ormlite.annotations.OrmLiteDao;

import java.util.List;

@EBean
public class MonumentDAOWrapper {

    @OrmLiteDao(helper = DatabaseHelper.class)
    MonumentDAO monumentDAO;


    public void addMonument(Monument monument) {
        monumentDAO.create(monument);
    }

    public List<Monument> getAllMonuments() {
        final List<Monument> monuments = monumentDAO.queryForAll();
        return monuments;
    }


}
