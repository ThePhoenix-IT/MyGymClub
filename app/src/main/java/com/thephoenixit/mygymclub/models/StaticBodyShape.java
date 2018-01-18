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
}
