package com.thephoenixit.mygymclub.models;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by root on 18/01/19.
 */

public class FitnessGoal extends RealmObject {
    @PrimaryKey
    private long fitness_goal_id;
    private String fitness_goal_name;
    public long getfitness_goal_id() {
        return fitness_goal_id;
    }

    public void setfitness_goal_id(long fitness_goal_id) {
        this.fitness_goal_id = fitness_goal_id;
    }

    public String getfitness_goal_name() {
        return fitness_goal_name;
    }

    public void setfitness_goal_name(String fitness_goal_name) {
        this.fitness_goal_name = fitness_goal_name;
    }
}
