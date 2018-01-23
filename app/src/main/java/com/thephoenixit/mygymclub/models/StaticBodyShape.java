package com.thephoenixit.mygymclub.models;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by root on 18/01/19.
 */

public class StaticBodyShape extends RealmObject {
    @PrimaryKey
    private int static_body_shape_id;
    private String static_body_shape_name;
    private String static_body_shape_desc;
    private String static_body_shape_img_path;

    public int getStatic_body_shape_id() {
        return static_body_shape_id;
    }

    public void setStatic_body_shape_id(int static_body_shape_id) {
        this.static_body_shape_id = static_body_shape_id;
    }

    public String getStatic_body_shape_name() {
        return static_body_shape_name;
    }

    public void setStatic_body_shape_name(String static_body_shape_name) {
        this.static_body_shape_name = static_body_shape_name;
    }

    public String getStatic_body_shape_desc() {
        return static_body_shape_desc;
    }

    public void setStatic_body_shape_desc(String static_body_shape_desc) {
        this.static_body_shape_desc = static_body_shape_desc;
    }

    public String getStatic_body_shape_img_path() {
        return static_body_shape_img_path;
    }

    public void setStatic_body_shape_img_path(String static_body_shape_img_path) {
        this.static_body_shape_img_path = static_body_shape_img_path;
    }
}
