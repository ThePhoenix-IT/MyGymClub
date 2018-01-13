package com.thephoenixit.mygymclub.models;

import java.util.Date;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by root on 18/01/14.
 */

public class Account extends RealmObject {
    @PrimaryKey
    private Long account_id;
    private String account_login;
    private String account_password;
    private Boolean account_status;
    private Date creation_date;
}
