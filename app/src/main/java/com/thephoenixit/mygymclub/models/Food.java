package com.thephoenixit.mygymclub.models;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by root on 18/01/19.
 */

public class Food extends RealmObject {
    @PrimaryKey
    private long food_id;
    private FoodType food_type;
    private String food_name;
    private double cal;

    public void setFood_id(long food_id) {
        this.food_id = food_id;
    }

    public void setFood_type(FoodType food_type) {
        this.food_type = food_type;
    }

    public void setFood_name(String food_name) {
        this.food_name = food_name;
    }

    public void setCal(double cal) {
        this.cal = cal;
    }

    public FoodType getFood_type() {

        return food_type;
    }

    public String getFood_name() {
        return food_name;
    }

    public double getCal() {
        return cal;
    }

    public long getFood_id() {

        return food_id;
    }
}
