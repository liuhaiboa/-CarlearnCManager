package com.haibo.daomodel;

import java.util.Date;

public class Userunionrole {
    private Long nId;

    private String sUserid;

    private String sRoleid;

    private Date tcreatedate;

    private Date toperatedate;

    public Long getnId() {
        return nId;
    }

    public void setnId(Long nId) {
        this.nId = nId;
    }

    public String getsUserid() {
        return sUserid;
    }

    public void setsUserid(String sUserid) {
        this.sUserid = sUserid == null ? null : sUserid.trim();
    }

    public String getsRoleid() {
        return sRoleid;
    }

    public void setsRoleid(String sRoleid) {
        this.sRoleid = sRoleid == null ? null : sRoleid.trim();
    }

    public Date getTcreatedate() {
        return tcreatedate;
    }

    public void setTcreatedate(Date tcreatedate) {
        this.tcreatedate = tcreatedate;
    }

    public Date getToperatedate() {
        return toperatedate;
    }

    public void setToperatedate(Date toperatedate) {
        this.toperatedate = toperatedate;
    }
}