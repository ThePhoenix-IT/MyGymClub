package com.thephoenixit.mygymclub.models;

import java.util.Date;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by root on 18/01/14.
 */

public class User extends RealmObject {
    @PrimaryKey
    private long user_id;
    private String user_full_name;
    private String user_email;
    private Date user_birth_date;
    private boolean user_gender;
    private Date creation_date;
    private Account user_account;

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public String getUser_full_name() {
        return user_full_name;
    }

    public void setUser_full_name(String user_full_name) {
        this.user_full_name = user_full_name;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public Date getUser_birth_date() {
        return user_birth_date;
    }

    public void setUser_birth_date(Date user_birth_date) {
        this.user_birth_date = user_birth_date;
    }

    public boolean isUser_gender() {
        return user_gender;
    }

    public void setUser_gender(boolean user_gender) {
        this.user_gender = user_gender;
    }

    public Date getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(Date creation_date) {
        this.creation_date = creation_date;
    }

    public Account getUser_account() {
        return user_account;
    }

    public void setUser_account(Account user_account) {
        this.user_account = user_account;
    }
}
