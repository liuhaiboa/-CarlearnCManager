package com.haibo.pojo;

import java.util.Date;

public class Role {
    private Long nId;

    private String sRolename;

    private Integer sRolestatue;

    private Date tcreatedate;

    private Date toperatedate;

    public Long getnId() {
        return nId;
    }

    public void setnId(Long nId) {
        this.nId = nId;
    }

    public String getsRolename() {
        return sRolename;
    }

    public void setsRolename(String sRolename) {
        this.sRolename = sRolename == null ? null : sRolename.trim();
    }

    public Integer getsRolestatue() {
        return sRolestatue;
    }

    public void setsRolestatue(Integer sRolestatue) {
        this.sRolestatue = sRolestatue;
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