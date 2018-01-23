package com.thephoenixit.mygymclub.models;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by root on 18/01/19.
 */

public class WorkoutFile extends RealmObject {
    @PrimaryKey
    private long workout_file_id;
    private int workout_file_rank;
    private String workout_file_path;
    private Workout workout;

    public long getWorkout_file_id() {
        return workout_file_id;
    }

    public void setWorkout_file_id(long workout_file_id) {
        this.workout_file_id = workout_file_id;
    }

    public int getWorkout_file_rank() {
        return workout_file_rank;
    }

    public void setWorkout_file_rank(int workout_file_rank) {
        this.workout_file_rank = workout_file_rank;
    }

    public String getWorkout_file_path() {
        return workout_file_path;
    }

    public void setWorkout_file_path(String workout_file_path) {
        this.workout_file_path = workout_file_path;
    }

    public Workout getWorkout() {
        return workout;
    }

    public void setWorkout(Workout workout) {
        this.workout = workout;
    }
}
