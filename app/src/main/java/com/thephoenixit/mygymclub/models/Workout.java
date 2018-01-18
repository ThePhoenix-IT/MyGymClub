package com.thephoenixit.mygymclub.models;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by root on 18/01/19.
 */

public class Workout extends RealmObject {
    @PrimaryKey
    private long workout_id;
    private WorkoutType workout_type;
    private String workout_name;
    private String workout_desc;
    private double workout_duration;
}
