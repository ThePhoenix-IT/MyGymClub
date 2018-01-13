package com.thephoenixit.mygymclub.models;

import java.util.Date;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by root on 18/01/14.
 */

public class Plan extends RealmObject {
    @PrimaryKey
    private Long plan_id;
    private Date plan_start_date;
    private Date plan_end_date;
    private User user;
}
