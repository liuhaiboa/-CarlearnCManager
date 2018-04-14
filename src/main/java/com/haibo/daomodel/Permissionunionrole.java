package com.haibo.daomodel;

import java.util.Date;

public class Permissionunionrole {
    private Long nId;

    private String sRoleid;

    private String sPreid;

    private Date tcreatedate;

    private Date toperatedate;

    public Long getnId() {
        return nId;
    }

    public void setnId(Long nId) {
        this.nId = nId;
    }

    public String getsRoleid() {
        return sRoleid;
    }

    public void setsRoleid(String sRoleid) {
        this.sRoleid = sRoleid == null ? null : sRoleid.trim();
    }

    public String getsPreid() {
        return sPreid;
    }

    public void setsPreid(String sPreid) {
        this.sPreid = sPreid == null ? null : sPreid.trim();
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