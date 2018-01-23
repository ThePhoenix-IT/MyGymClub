package com.thephoenixit.mygymclub.models;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by root on 18/01/19.
 */

public class FoodType extends RealmObject {
    @PrimaryKey
    private int food_type_id;
    private String food_type_name;
    private double cal;

    public int getFood_type_id() {
        return food_type_id;
    }

    public void setFood_type_id(int food_type_id) {
        this.food_type_id = food_type_id;
    }

    public String getFood_type_name() {
        return food_type_name;
    }

    public void setFood_type_name(String food_type_name) {
        this.food_type_name = food_type_name;
    }

    public double getCal() {
        return cal;
    }

    public void setCal(double cal) {
        this.cal = cal;
    }
}
