package com.haibo.daomodel;

import java.util.Date;

public class Score {
    private Long nId;

    private String sScore;

    private String sUseridcard;

    private Integer sUserid;

    private Date tcreatedate;

    private Date toperatedate;

    public Long getnId() {
        return nId;
    }

    public void setnId(Long nId) {
        this.nId = nId;
    }

    public String getsScore() {
        return sScore;
    }

    public void setsScore(String sScore) {
        this.sScore = sScore == null ? null : sScore.trim();
    }

    public String getsUseridcard() {
        return sUseridcard;
    }

    public void setsUseridcard(String sUseridcard) {
        this.sUseridcard = sUseridcard == null ? null : sUseridcard.trim();
    }

    public Integer getsUserid() {
        return sUserid;
    }

    public void setsUserid(Integer sUserid) {
        this.sUserid = sUserid;
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