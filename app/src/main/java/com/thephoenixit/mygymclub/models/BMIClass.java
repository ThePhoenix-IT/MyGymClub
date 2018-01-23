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
    public long getbmi_class_id() {
        return bmi_class_id;
    }

    public void setbmi_class_id(int bmi_class_id) {
        this.bmi_class_id = bmi_class_id;
    }

    public String getbmi_class_name() {
        return bmi_class_name;
    }

    public void setbmi_class_name(String bmi_class_name) {
        this.bmi_class_name = bmi_class_name;
    }
    public StaticBodyShape getstatic_body_shape() {
        return static_body_shape;
    }
    public void setstatic_body_shape(StaticBodyShape static_body_shape) {
        this.static_body_shape = static_body_shape;
    }
}
