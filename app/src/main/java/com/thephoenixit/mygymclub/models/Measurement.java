package com.thephoenixit.mygymclub.models;

import java.util.Date;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by root on 18/01/14.
 */

public class Measurement extends RealmObject {
    @PrimaryKey
    private long measurement_id;
    private float height;
    private float weight;
    private Date creation_date;
    private User user;

    public long getMeasurement_id() {
        return measurement_id;
    }

    public void setMeasurement_id(long measurement_id) {
        this.measurement_id = measurement_id;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public Date getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(Date creation_date) {
        this.creation_date = creation_date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
