package com.haibo.pojo;

import java.io.Serializable;

/**
 * Created with IDEA.
 * User:haibo.
 * DATE:2018/5/2/002
 */
public class Coach implements Serializable {

    private Long coachid;
    private String coachname;

    public Long getCoachid() {
        return coachid;
    }

    public void setCoachid(Long coachid) {
        this.coachid = coachid;
    }

    public String getCoachname() {
        return coachname;
    }

    public void setCoachname(String coachname) {
        this.coachname = coachname;
    }




}