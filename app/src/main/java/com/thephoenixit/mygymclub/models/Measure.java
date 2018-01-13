package com.thephoenixit.mygymclub.models;

import java.util.Date;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by root on 18/01/14.
 */

public class Measure extends RealmObject {
    @PrimaryKey
    private Long measure_id;
    private Float height;
    private Float weight;
    private Date creation_date;
    private User user;
}
