package com.thephoenixit.mygymclub.models;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by root on 18/01/19.
 */

public class PlanType extends RealmObject {
    @PrimaryKey
    private int plan_type_id;
    private String plan_type_name;

    public int getPlan_type_id() {
        return plan_type_id;
    }

    public void setPlan_type_id(int plan_type_id) {
        this.plan_type_id = plan_type_id;
    }

    public String getPlan_type_name() {
        return plan_type_name;
    }

    public void setPlan_type_name(String plan_type_name) {
        this.plan_type_name = plan_type_name;
    }
}
