package com.haibo.pojo;

import java.util.Date;

public class Choosecoach {
    private Long nId;

    private String sCoachid;

    private String sStudentid;

    private Integer sStatue;



    public Long getnId() {
        return nId;
    }

    public void setnId(Long nId) {
        this.nId = nId;
    }

    public String getsCoachid() {
        return sCoachid;
    }

    public void setsCoachid(String sCoachid) {
        this.sCoachid = sCoachid == null ? null : sCoachid.trim();
    }

    public String getsStudentid() {
        return sStudentid;
    }

    public void setsStudentid(String sStudentid) {
        this.sStudentid = sStudentid == null ? null : sStudentid.trim();
    }

    public Integer getsStatue() {
        return sStatue;
    }

    public void setsStatue(Integer sStatue) {
        this.sStatue = sStatue;
    }


}