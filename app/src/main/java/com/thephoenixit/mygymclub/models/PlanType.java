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
}
