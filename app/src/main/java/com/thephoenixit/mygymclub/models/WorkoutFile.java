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
}
