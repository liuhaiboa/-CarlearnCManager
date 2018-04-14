package com.haibo.daomodel;

import java.util.Date;

public class User {
    private Long nId;

    private String sName;

    private String sPassword;

    private String sSex;

    private Date sBorth;

    private String sIdcard;

    private String sTelephone;

    private String sEmail;

    private String sAddress;

    private String sNativeplace;

    private String sPhoto;

    private Integer sStatus;

    private Date tcreatedate;

    private Date toperatedate;

    public Long getnId() {
        return nId;
    }

    public void setnId(Long nId) {
        this.nId = nId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName == null ? null : sName.trim();
    }

    public String getsPassword() {
        return sPassword;
    }

    public void setsPassword(String sPassword) {
        this.sPassword = sPassword == null ? null : sPassword.trim();
    }

    public String getsSex() {
        return sSex;
    }

    public void setsSex(String sSex) {
        this.sSex = sSex == null ? null : sSex.trim();
    }

    public Date getsBorth() {
        return sBorth;
    }

    public void setsBorth(Date sBorth) {
        this.sBorth = sBorth;
    }

    public String getsIdcard() {
        return sIdcard;
    }

    public void setsIdcard(String sIdcard) {
        this.sIdcard = sIdcard == null ? null : sIdcard.trim();
    }

    public String getsTelephone() {
        return sTelephone;
    }

    public void setsTelephone(String sTelephone) {
        this.sTelephone = sTelephone == null ? null : sTelephone.trim();
    }

    public String getsEmail() {
        return sEmail;
    }

    public void setsEmail(String sEmail) {
        this.sEmail = sEmail == null ? null : sEmail.trim();
    }

    public String getsAddress() {
        return sAddress;
    }

    public void setsAddress(String sAddress) {
        this.sAddress = sAddress == null ? null : sAddress.trim();
    }

    public String getsNativeplace() {
        return sNativeplace;
    }

    public void setsNativeplace(String sNativeplace) {
        this.sNativeplace = sNativeplace == null ? null : sNativeplace.trim();
    }

    public String getsPhoto() {
        return sPhoto;
    }

    public void setsPhoto(String sPhoto) {
        this.sPhoto = sPhoto == null ? null : sPhoto.trim();
    }

    public Integer getsStatus() {
        return sStatus;
    }

    public void setsStatus(Integer sStatus) {
        this.sStatus = sStatus;
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