package com.thephoenixit.mygymclub.models;

import java.util.Date;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by root on 18/01/14.
 */

public class Plan extends RealmObject {
    @PrimaryKey
    private long plan_id;
    private Date plan_start_date;
    private Date plan_end_date;
    private User user;
    private PlanType plan_type;

    public long getPlan_id() {
        return plan_id;
    }

    public void setPlan_id(long plan_id) {
        this.plan_id = plan_id;
    }

    public Date getPlan_start_date() {
        return plan_start_date;
    }

    public void setPlan_start_date(Date plan_start_date) {
        this.plan_start_date = plan_start_date;
    }

    public Date getPlan_end_date() {
        return plan_end_date;
    }

    public void setPlan_end_date(Date plan_end_date) {
        this.plan_end_date = plan_end_date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public PlanType getPlan_type() {
        return plan_type;
    }

    public void setPlan_type(PlanType plan_type) {
        this.plan_type = plan_type;
    }
}
