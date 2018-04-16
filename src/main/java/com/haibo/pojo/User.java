package com.haibo.pojo;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    public User(){};
    private Long n_id;
    private String s_name;



    private String s_password;
    private String s_sex;
//    private Date s_borth;
    private String s_idcard;
    private String s_telephone;
    private String s_email;

    private String s_address;

    private String s_nativeprovince;
    private String s_nativecity;
    private String s_nativearea;

    public Long getN_id() {
        return n_id;
    }

    public void setN_id(Long n_id) {
        this.n_id = n_id;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public String getS_password() {
        return s_password;
    }

    public void setS_password(String s_password) {
        this.s_password = s_password;
    }

    public String getS_sex() {
        return s_sex;
    }

    public void setS_sex(String s_sex) {
        this.s_sex = s_sex;
    }

//    public Date getS_borth() {
//        return s_borth;
//    }

//    public void setS_borth(Date s_borth) {
//        this.s_borth = s_borth;
//    }

    public String getS_idcard() {
        return s_idcard;
    }

    public void setS_idcard(String s_idcard) {
        this.s_idcard = s_idcard;
    }

    public String getS_telephone() {
        return s_telephone;
    }

    public void setS_telephone(String s_telephone) {
        this.s_telephone = s_telephone;
    }

    public String getS_email() {
        return s_email;
    }

    public void setS_email(String s_email) {
        this.s_email = s_email;
    }

    public String getS_address() {
        return s_address;
    }

    public void setS_address(String s_address) {
        this.s_address = s_address;
    }

    public String getS_nativeprovince() {
        return s_nativeprovince;
    }

    public void setS_nativeprovince(String s_nativeprovince) {
        this.s_nativeprovince = s_nativeprovince;
    }

    public String getS_nativecity() {
        return s_nativecity;
    }

    public void setS_nativecity(String s_nativecity) {
        this.s_nativecity = s_nativecity;
    }

    public String getS_nativearea() {
        return s_nativearea;
    }

    public void setS_nativearea(String s_nativearea) {
        this.s_nativearea = s_nativearea;
    }


    public Integer getS_status() {
        return s_status;
    }

    public void setS_status(Integer s_status) {
        this.s_status = s_status;
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


    private Integer s_status;

    private Date tcreatedate;

    private Date toperatedate;

}