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

    public long getWorkout_id() {
        return workout_id;
    }

    public void setWorkout_id(long workout_id) {
        this.workout_id = workout_id;
    }

    public WorkoutType getWorkout_type() {
        return workout_type;
    }

    public void setWorkout_type(WorkoutType workout_type) {
        this.workout_type = workout_type;
    }

    public String getWorkout_name() {
        return workout_name;
    }

    public void setWorkout_name(String workout_name) {
        this.workout_name = workout_name;
    }

    public String getWorkout_desc() {
        return workout_desc;
    }

    public void setWorkout_desc(String workout_desc) {
        this.workout_desc = workout_desc;
    }

    public double getWorkout_duration() {
        return workout_duration;
    }

    public void setWorkout_duration(double workout_duration) {
        this.workout_duration = workout_duration;
    }
}
