package com.thephoenixit.mygymclub.models;

import java.util.Date;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by root on 18/01/19.
 */

public class FitnessCalcul extends RealmObject {
    public long getFitness_calcul_id() {
        return fitness_calcul_id;
    }

    public void setFitness_calcul_id(long fitness_calcul_id) {
        this.fitness_calcul_id = fitness_calcul_id;
    }

    public Measurement getMeasurement() {
        return measurement;
    }

    public void setMeasurement(Measurement measurement) {
        this.measurement = measurement;
    }

    public Date getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(Date creation_date) {
        this.creation_date = creation_date;
    }

    public double getBmi() {
        return bmi;
    }

    public void setBmi(double bmi) {
        this.bmi = bmi;
    }

    public BMIClass getBmi_class() {
        return bmi_class;
    }

    public void setBmi_class(BMIClass bmi_class) {
        this.bmi_class = bmi_class;
    }

    public double getWait_hip_ratio() {
        return wait_hip_ratio;
    }

    public void setWait_hip_ratio(double wait_hip_ratio) {
        this.wait_hip_ratio = wait_hip_ratio;
    }

    public StaticBodyShape getStatic_body_shape() {
        return static_body_shape;
    }

    public void setStatic_body_shape(StaticBodyShape static_body_shape) {
        this.static_body_shape = static_body_shape;
    }

    public String getInterpretation() {
        return interpretation;
    }

    public void setInterpretation(String interpretation) {
        this.interpretation = interpretation;
    }

    public double getBody_frame_size() {
        return body_frame_size;
    }

    public void setBody_frame_size(double body_frame_size) {
        this.body_frame_size = body_frame_size;
    }

    public double getIdeal_weight() {
        return ideal_weight;
    }

    public void setIdeal_weight(double ideal_weight) {
        this.ideal_weight = ideal_weight;
    }

    public double getBody_fat() {
        return body_fat;
    }

    public void setBody_fat(double body_fat) {
        this.body_fat = body_fat;
    }

    public int getLean_mass() {
        return lean_mass;
    }

    public void setLean_mass(int lean_mass) {
        this.lean_mass = lean_mass;
    }

    public double getRmr_cal_day() {
        return rmr_cal_day;
    }

    public void setRmr_cal_day(double rmr_cal_day) {
        this.rmr_cal_day = rmr_cal_day;
    }

    public double getAam_cal_day() {
        return aam_cal_day;
    }

    public void setAam_cal_day(double aam_cal_day) {
        this.aam_cal_day = aam_cal_day;
    }

    public double getThr_bpm() {
        return thr_bpm;
    }

    public void setThr_bpm(double thr_bpm) {
        this.thr_bpm = thr_bpm;
    }

    public double getMhr_bpm() {
        return mhr_bpm;
    }

    public void setMhr_bpm(double mhr_bpm) {
        this.mhr_bpm = mhr_bpm;
    }

    public double getRmr_cal_hour() {
        return rmr_cal_hour;
    }

    public void setRmr_cal_hour(double rmr_cal_hour) {
        this.rmr_cal_hour = rmr_cal_hour;
    }

    public double getAam_cal_hour() {
        return aam_cal_hour;
    }

    public void setAam_cal_hour(double aam_cal_hour) {
        this.aam_cal_hour = aam_cal_hour;
    }

    public double getThr_bp10s() {
        return thr_bp10s;
    }

    public void setThr_bp10s(double thr_bp10s) {
        this.thr_bp10s = thr_bp10s;
    }

    public double getMhr_bp10s() {
        return mhr_bp10s;
    }

    public void setMhr_bp10s(double mhr_bp10s) {
        this.mhr_bp10s = mhr_bp10s;
    }

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
