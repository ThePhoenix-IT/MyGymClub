package com.thephoenixit.mygymclub.models;

import java.util.Date;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by root on 18/01/19.
 */

public class FitnessCalcul extends RealmObject {
    @PrimaryKey
    private long fitness_calcul_id;
    private Measurement measurement;
    private Date creation_date;
    private double bmi;
    private BMIClass bmi_class;
    private double wait_hip_ratio;
    private StaticBodyShape static_body_shape;
    private String interpretation;
    private double body_frame_size;
    private double ideal_weight;
    private double body_fat;
    private int lean_mass;
    private double rmr_cal_day;
    private double aam_cal_day;
    private double thr_bpm;
    private double mhr_bpm;
    private double rmr_cal_hour;
    private double aam_cal_hour;
    private double thr_bp10s;
    private double mhr_bp10s;
}
