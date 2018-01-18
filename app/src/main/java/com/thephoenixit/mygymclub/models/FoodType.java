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
}
