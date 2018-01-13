package com.thephoenixit.mygymclub.models;

import java.util.Date;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by root on 18/01/14.
 */

public class User extends RealmObject {
    @PrimaryKey
    private Long user_id;
    private String user_full_name;
    private String user_email;
    private Date user_birth_date;
    private Boolean user_gender;
    private Date creation_date;
    private Account user_account;
}
