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
}
