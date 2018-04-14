package com.haibo.pojo;

import java.util.Date;

public class Permission {
    private Long nId;

    private String sUrl;

    private String sPername;

    private Date tcreatedate;

    private Date toperatedate;

    public Long getnId() {
        return nId;
    }

    public void setnId(Long nId) {
        this.nId = nId;
    }

    public String getsUrl() {
        return sUrl;
    }

    public void setsUrl(String sUrl) {
        this.sUrl = sUrl == null ? null : sUrl.trim();
    }

    public String getsPername() {
        return sPername;
    }

    public void setsPername(String sPername) {
        this.sPername = sPername == null ? null : sPername.trim();
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