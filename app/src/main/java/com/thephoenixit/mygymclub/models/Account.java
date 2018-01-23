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

    public long getaccount_id() {
        return account_id;
    }

    public void setaccount_id(long account_id) {
        this.account_id = account_id;
    }

    public String getaccount_password() {
        return account_password;
    }

    public void setaccount_password(String account_password) {
        this.account_password = account_password;
    }
    public String getaccount_login() {
        return account_login;
    }
    public void setaccount_login(String account_login) {
        this.account_login = account_login;
    }
    public boolean getaccount_status() {
        return account_status;
    }
    public void setaccount_status(boolean account_status) {
        this.account_status = account_status;
    }
    public Date creation_date() {
        return creation_date;
    }
    public void setcreation_date(Date creation_date) {
        this.creation_date = creation_date;
    }
}
