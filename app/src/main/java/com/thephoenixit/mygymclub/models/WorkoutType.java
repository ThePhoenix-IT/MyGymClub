package com.thephoenixit.mygymclub.models;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by root on 18/01/19.
 */

public class WorkoutType extends RealmObject {
    @PrimaryKey
    private int workout_type_id;
    private String workout_name;
}
