package com.thephoenixit.mygymclub.models;

import java.util.Date;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by root on 18/01/19.
 */

public class ActivityLevel extends RealmObject {
    @PrimaryKey
    private long activity_level_id;
    private String activity_level_name;

    public long getactivity_level_id() {
        return activity_level_id;
    }

    public void setactivity_level_id(long activity_level_id) {
        this.activity_level_id = activity_level_id;
    }

    public String getactivity_level_name() {
        return activity_level_name;
    }

    public void setactivity_level_name(String activity_level_name) {
        this.activity_level_name = activity_level_name;
    }
}
