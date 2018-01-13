package com.thephoenixit.mygymclub.models;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by root on 18/01/14.
 */

public class PlanStatus extends RealmObject {
    @PrimaryKey
    private Long plan_status_id;
    private String plan_statusçdesc;
    private Plan plan;
}
