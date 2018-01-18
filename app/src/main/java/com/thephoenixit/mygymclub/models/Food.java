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
}
