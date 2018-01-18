package com.thephoenixit.mygymclub.models;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by root on 18/01/19.
 */

public class BMIClass extends RealmObject {
    @PrimaryKey
    private int bmi_class_id;
    private String bmi_class_name;
    private StaticBodyShape static_body_shape;
}
