package com.thephoenixit.mygymclub.Beans;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by root on 18/01/14.
 */

public class ChestItem {
    @JsonProperty("result")
    private String result;
    @JsonProperty("result_date")
    private String resultDate;

    public ChestItem() {
    }

    public ChestItem(String result, String result_date) {
        this.result = result;
        this.resultDate = result_date;
    }

    public String getResult() {
        return this.result;
    }

    public void setResult(String var1) {
        this.result = var1;
    }

    public String getResultDate() {
        return this.resultDate;
    }

    public void setResultDate(String var1) {
        this.resultDate = var1;
    }

    public String toString() {
        return "ChestItem{result = '" + this.result + '\'' + ",result_date = '" + this.resultDate + '\'' + "}";
    }
}
