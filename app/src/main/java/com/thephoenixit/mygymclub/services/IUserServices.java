package com.thephoenixit.mygymclub.services;

import com.thephoenixit.mygymclub.models.Workout;

import java.util.Collection;

/**
 * Created by root on 18/01/19.
 */

public interface IUserServices {
    Collection<Workout> getAllWorkouts();
}
