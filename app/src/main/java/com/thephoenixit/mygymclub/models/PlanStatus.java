package com.thephoenixit.mygymclub.models;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by root on 18/01/14.
 */

public class PlanStatus extends RealmObject {
    @PrimaryKey
    private long plan_status_id;
    private String plan_statusçdesc;
    private Plan plan;

    public long getPlan_status_id() {
        return plan_status_id;
    }

    public void setPlan_status_id(long plan_status_id) {
        this.plan_status_id = plan_status_id;
    }

    public String getPlan_statusçdesc() {
        return plan_statusçdesc;
    }

    public void setPlan_statusçdesc(String plan_statusçdesc) {
        this.plan_statusçdesc = plan_statusçdesc;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }
}
