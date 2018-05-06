package com.haibo.pojo;

import java.util.Date;

public class Exam {
    private Long nId;


    private String sStudentid;
    private String sData;

    public Long getnId() {
        return nId;
    }

    public void setnId(Long nId) {
        this.nId = nId;
    }

    public String getsStudentid() {
        return sStudentid;
    }

    public void setsStudentid(String sStudentid) {
        this.sStudentid = sStudentid;
    }

    public String getsData() {
        return sData;
    }

    public void setsData(String sData) {
        this.sData = sData;
    }

    public Integer getsStatue() {
        return sStatue;
    }

    public void setsStatue(Integer sStatue) {
        this.sStatue = sStatue;
    }

    private Integer sStatue;


}