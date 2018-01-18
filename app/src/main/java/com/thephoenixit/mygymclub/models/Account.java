package com.thephoenixit.mygymclub.models;

import java.util.Date;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by root on 18/01/14.
 */

public class Account extends RealmObject {
    @PrimaryKey
    private long account_id;
    private String account_login;
    private String account_password;
    private boolean account_status;
    private Date creation_date;
}
