package com.huylv.demosqlite.model;

import com.orm.SugarRecord;

/**
 * Created by HuyLV-CT on 29-Aug-16.
 */
public class Pokemon extends SugarRecord{
    int dbid;
    String name;
    float rating;
    String type;
    float weight;
    float height;
    float max_theoretical_cp;
    int base_attack;
    int base_defense;
    int base_stamina;
    float capture_rate;
    float flee_rate;
    String pclass;

    public Pokemon(String name, float rating) {
        this.name = name;
        this.rating = rating;
    }

    public Pokemon(int dbid, String name, float rating, String type, float weight, float height, float max_theoretical_cp, int base_attack, int base_defense, int base_stamina, float capture_rate, float flee_rate, String pclass) {

        this.dbid = dbid;
        this.name = name;
        this.rating = rating;
        this.type = type;
        this.weight = weight;
        this.height = height;
        this.max_theoretical_cp = max_theoretical_cp;
        this.base_attack = base_attack;
        this.base_defense = base_defense;
        this.base_stamina = base_stamina;
        this.capture_rate = capture_rate;
        this.flee_rate = flee_rate;
        this.pclass = pclass;
    }

    public Pokemon() {

    }

    public int getDbid() {
        return dbid;
    }

    public void setDbid(int dbid) {
        this.dbid = dbid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getMax_theoretical_cp() {
        return max_theoretical_cp;
    }

    public void setMax_theoretical_cp(float max_theoretical_cp) {
        this.max_theoretical_cp = max_theoretical_cp;
    }

    public int getBase_attack() {
        return base_attack;
    }

    public void setBase_attack(int base_attack) {
        this.base_attack = base_attack;
    }

    public int getBase_defense() {
        return base_defense;
    }

    public void setBase_defense(int base_defense) {
        this.base_defense = base_defense;
    }

    public int getBase_stamina() {
        return base_stamina;
    }

    public void setBase_stamina(int base_stamina) {
        this.base_stamina = base_stamina;
    }

    public float getCapture_rate() {
        return capture_rate;
    }

    public void setCapture_rate(float capture_rate) {
        this.capture_rate = capture_rate;
    }

    public float getFlee_rate() {
        return flee_rate;
    }

    public void setFlee_rate(float flee_rate) {
        this.flee_rate = flee_rate;
    }

    public String getPclass() {
        return pclass;
    }

    public void setPclass(String pclass) {
        this.pclass = pclass;
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
