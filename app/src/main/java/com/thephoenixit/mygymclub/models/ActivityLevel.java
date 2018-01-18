package com.thephoenixit.mygymclub.models;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by root on 18/01/19.
 */

public class ActivityLevel extends RealmObject {
    @PrimaryKey
    private long activity_level_id;
    private String activity_level_name;
}
