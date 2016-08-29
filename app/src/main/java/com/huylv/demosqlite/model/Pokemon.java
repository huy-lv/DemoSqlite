package com.huylv.demosqlite.model;

import com.orm.SugarRecord;

/**
 * Created by HuyLV-CT on 29-Aug-16.
 */
public class Pokemon extends SugarRecord{
    String name;
    float rating;

    public Pokemon(String name, float rating) {
        this.name = name;
        this.rating = rating;
    }

    public Pokemon() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }
}
