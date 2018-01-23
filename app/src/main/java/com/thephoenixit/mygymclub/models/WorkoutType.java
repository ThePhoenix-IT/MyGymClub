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

    public int getWorkout_type_id() {
        return workout_type_id;
    }

    public void setWorkout_type_id(int workout_type_id) {
        this.workout_type_id = workout_type_id;
    }

    public String getWorkout_name() {
        return workout_name;
    }

    public void setWorkout_name(String workout_name) {
        this.workout_name = workout_name;
    }
}
