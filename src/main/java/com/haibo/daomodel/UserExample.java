package com.haibo.daomodel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andNIdIsNull() {
            addCriterion("n_id is null");
            return (Criteria) this;
        }

        public Criteria andNIdIsNotNull() {
            addCriterion("n_id is not null");
            return (Criteria) this;
        }

        public Criteria andNIdEqualTo(Long value) {
            addCriterion("n_id =", value, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdNotEqualTo(Long value) {
            addCriterion("n_id <>", value, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdGreaterThan(Long value) {
            addCriterion("n_id >", value, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdGreaterThanOrEqualTo(Long value) {
            addCriterion("n_id >=", value, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdLessThan(Long value) {
            addCriterion("n_id <", value, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdLessThanOrEqualTo(Long value) {
            addCriterion("n_id <=", value, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdIn(List<Long> values) {
            addCriterion("n_id in", values, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdNotIn(List<Long> values) {
            addCriterion("n_id not in", values, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdBetween(Long value1, Long value2) {
            addCriterion("n_id between", value1, value2, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdNotBetween(Long value1, Long value2) {
            addCriterion("n_id not between", value1, value2, "nId");
            return (Criteria) this;
        }

        public Criteria andSNameIsNull() {
            addCriterion("s_name is null");
            return (Criteria) this;
        }

        public Criteria andSNameIsNotNull() {
            addCriterion("s_name is not null");
            return (Criteria) this;
        }

        public Criteria andSNameEqualTo(String value) {
            addCriterion("s_name =", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotEqualTo(String value) {
            addCriterion("s_name <>", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameGreaterThan(String value) {
            addCriterion("s_name >", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameGreaterThanOrEqualTo(String value) {
            addCriterion("s_name >=", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLessThan(String value) {
            addCriterion("s_name <", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLessThanOrEqualTo(String value) {
            addCriterion("s_name <=", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLike(String value) {
            addCriterion("s_name like", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotLike(String value) {
            addCriterion("s_name not like", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameIn(List<String> values) {
            addCriterion("s_name in", values, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotIn(List<String> values) {
            addCriterion("s_name not in", values, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameBetween(String value1, String value2) {
            addCriterion("s_name between", value1, value2, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotBetween(String value1, String value2) {
            addCriterion("s_name not between", value1, value2, "sName");
            return (Criteria) this;
        }

        public Criteria andSPasswordIsNull() {
            addCriterion("s_password is null");
            return (Criteria) this;
        }

        public Criteria andSPasswordIsNotNull() {
            addCriterion("s_password is not null");
            return (Criteria) this;
        }

        public Criteria andSPasswordEqualTo(String value) {
            addCriterion("s_password =", value, "sPassword");
            return (Criteria) this;
        }

        public Criteria andSPasswordNotEqualTo(String value) {
            addCriterion("s_password <>", value, "sPassword");
            return (Criteria) this;
        }

        public Criteria andSPasswordGreaterThan(String value) {
            addCriterion("s_password >", value, "sPassword");
            return (Criteria) this;
        }

        public Criteria andSPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("s_password >=", value, "sPassword");
            return (Criteria) this;
        }

        public Criteria andSPasswordLessThan(String value) {
            addCriterion("s_password <", value, "sPassword");
            return (Criteria) this;
        }

        public Criteria andSPasswordLessThanOrEqualTo(String value) {
            addCriterion("s_password <=", value, "sPassword");
            return (Criteria) this;
        }

        public Criteria andSPasswordLike(String value) {
            addCriterion("s_password like", value, "sPassword");
            return (Criteria) this;
        }

        public Criteria andSPasswordNotLike(String value) {
            addCriterion("s_password not like", value, "sPassword");
            return (Criteria) this;
        }

        public Criteria andSPasswordIn(List<String> values) {
            addCriterion("s_password in", values, "sPassword");
            return (Criteria) this;
        }

        public Criteria andSPasswordNotIn(List<String> values) {
            addCriterion("s_password not in", values, "sPassword");
            return (Criteria) this;
        }

        public Criteria andSPasswordBetween(String value1, String value2) {
            addCriterion("s_password between", value1, value2, "sPassword");
            return (Criteria) this;
        }

        public Criteria andSPasswordNotBetween(String value1, String value2) {
            addCriterion("s_password not between", value1, value2, "sPassword");
            return (Criteria) this;
        }

        public Criteria andSSexIsNull() {
            addCriterion("s_sex is null");
            return (Criteria) this;
        }

        public Criteria andSSexIsNotNull() {
            addCriterion("s_sex is not null");
            return (Criteria) this;
        }

        public Criteria andSSexEqualTo(String value) {
            addCriterion("s_sex =", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexNotEqualTo(String value) {
            addCriterion("s_sex <>", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexGreaterThan(String value) {
            addCriterion("s_sex >", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexGreaterThanOrEqualTo(String value) {
            addCriterion("s_sex >=", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexLessThan(String value) {
            addCriterion("s_sex <", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexLessThanOrEqualTo(String value) {
            addCriterion("s_sex <=", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexLike(String value) {
            addCriterion("s_sex like", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexNotLike(String value) {
            addCriterion("s_sex not like", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexIn(List<String> values) {
            addCriterion("s_sex in", values, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexNotIn(List<String> values) {
            addCriterion("s_sex not in", values, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexBetween(String value1, String value2) {
            addCriterion("s_sex between", value1, value2, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexNotBetween(String value1, String value2) {
            addCriterion("s_sex not between", value1, value2, "sSex");
            return (Criteria) this;
        }

        public Criteria andSBorthIsNull() {
            addCriterion("s_borth is null");
            return (Criteria) this;
        }

        public Criteria andSBorthIsNotNull() {
            addCriterion("s_borth is not null");
            return (Criteria) this;
        }

        public Criteria andSBorthEqualTo(Date value) {
            addCriterion("s_borth =", value, "sBorth");
            return (Criteria) this;
        }

        public Criteria andSBorthNotEqualTo(Date value) {
            addCriterion("s_borth <>", value, "sBorth");
            return (Criteria) this;
        }

        public Criteria andSBorthGreaterThan(Date value) {
            addCriterion("s_borth >", value, "sBorth");
            return (Criteria) this;
        }

        public Criteria andSBorthGreaterThanOrEqualTo(Date value) {
            addCriterion("s_borth >=", value, "sBorth");
            return (Criteria) this;
        }

        public Criteria andSBorthLessThan(Date value) {
            addCriterion("s_borth <", value, "sBorth");
            return (Criteria) this;
        }

        public Criteria andSBorthLessThanOrEqualTo(Date value) {
            addCriterion("s_borth <=", value, "sBorth");
            return (Criteria) this;
        }

        public Criteria andSBorthIn(List<Date> values) {
            addCriterion("s_borth in", values, "sBorth");
            return (Criteria) this;
        }

        public Criteria andSBorthNotIn(List<Date> values) {
            addCriterion("s_borth not in", values, "sBorth");
            return (Criteria) this;
        }

        public Criteria andSBorthBetween(Date value1, Date value2) {
            addCriterion("s_borth between", value1, value2, "sBorth");
            return (Criteria) this;
        }

        public Criteria andSBorthNotBetween(Date value1, Date value2) {
            addCriterion("s_borth not between", value1, value2, "sBorth");
            return (Criteria) this;
        }

        public Criteria andSIdcardIsNull() {
            addCriterion("s_idcard is null");
            return (Criteria) this;
        }

        public Criteria andSIdcardIsNotNull() {
            addCriterion("s_idcard is not null");
            return (Criteria) this;
        }

        public Criteria andSIdcardEqualTo(String value) {
            addCriterion("s_idcard =", value, "sIdcard");
            return (Criteria) this;
        }

        public Criteria andSIdcardNotEqualTo(String value) {
            addCriterion("s_idcard <>", value, "sIdcard");
            return (Criteria) this;
        }

        public Criteria andSIdcardGreaterThan(String value) {
            addCriterion("s_idcard >", value, "sIdcard");
            return (Criteria) this;
        }

        public Criteria andSIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("s_idcard >=", value, "sIdcard");
            return (Criteria) this;
        }

        public Criteria andSIdcardLessThan(String value) {
            addCriterion("s_idcard <", value, "sIdcard");
            return (Criteria) this;
        }

        public Criteria andSIdcardLessThanOrEqualTo(String value) {
            addCriterion("s_idcard <=", value, "sIdcard");
            return (Criteria) this;
        }

        public Criteria andSIdcardLike(String value) {
            addCriterion("s_idcard like", value, "sIdcard");
            return (Criteria) this;
        }

        public Criteria andSIdcardNotLike(String value) {
            addCriterion("s_idcard not like", value, "sIdcard");
            return (Criteria) this;
        }

        public Criteria andSIdcardIn(List<String> values) {
            addCriterion("s_idcard in", values, "sIdcard");
            return (Criteria) this;
        }

        public Criteria andSIdcardNotIn(List<String> values) {
            addCriterion("s_idcard not in", values, "sIdcard");
            return (Criteria) this;
        }

        public Criteria andSIdcardBetween(String value1, String value2) {
            addCriterion("s_idcard between", value1, value2, "sIdcard");
            return (Criteria) this;
        }

        public Criteria andSIdcardNotBetween(String value1, String value2) {
            addCriterion("s_idcard not between", value1, value2, "sIdcard");
            return (Criteria) this;
        }

        public Criteria andSTelephoneIsNull() {
            addCriterion("s_telephone is null");
            return (Criteria) this;
        }

        public Criteria andSTelephoneIsNotNull() {
            addCriterion("s_telephone is not null");
            return (Criteria) this;
        }

        public Criteria andSTelephoneEqualTo(String value) {
            addCriterion("s_telephone =", value, "sTelephone");
            return (Criteria) this;
        }

        public Criteria andSTelephoneNotEqualTo(String value) {
            addCriterion("s_telephone <>", value, "sTelephone");
            return (Criteria) this;
        }

        public Criteria andSTelephoneGreaterThan(String value) {
            addCriterion("s_telephone >", value, "sTelephone");
            return (Criteria) this;
        }

        public Criteria andSTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("s_telephone >=", value, "sTelephone");
            return (Criteria) this;
        }

        public Criteria andSTelephoneLessThan(String value) {
            addCriterion("s_telephone <", value, "sTelephone");
            return (Criteria) this;
        }

        public Criteria andSTelephoneLessThanOrEqualTo(String value) {
            addCriterion("s_telephone <=", value, "sTelephone");
            return (Criteria) this;
        }

        public Criteria andSTelephoneLike(String value) {
            addCriterion("s_telephone like", value, "sTelephone");
            return (Criteria) this;
        }

        public Criteria andSTelephoneNotLike(String value) {
            addCriterion("s_telephone not like", value, "sTelephone");
            return (Criteria) this;
        }

        public Criteria andSTelephoneIn(List<String> values) {
            addCriterion("s_telephone in", values, "sTelephone");
            return (Criteria) this;
        }

        public Criteria andSTelephoneNotIn(List<String> values) {
            addCriterion("s_telephone not in", values, "sTelephone");
            return (Criteria) this;
        }

        public Criteria andSTelephoneBetween(String value1, String value2) {
            addCriterion("s_telephone between", value1, value2, "sTelephone");
            return (Criteria) this;
        }

        public Criteria andSTelephoneNotBetween(String value1, String value2) {
            addCriterion("s_telephone not between", value1, value2, "sTelephone");
            return (Criteria) this;
        }

        public Criteria andSEmailIsNull() {
            addCriterion("s_email is null");
            return (Criteria) this;
        }

        public Criteria andSEmailIsNotNull() {
            addCriterion("s_email is not null");
            return (Criteria) this;
        }

        public Criteria andSEmailEqualTo(String value) {
            addCriterion("s_email =", value, "sEmail");
            return (Criteria) this;
        }

        public Criteria andSEmailNotEqualTo(String value) {
            addCriterion("s_email <>", value, "sEmail");
            return (Criteria) this;
        }

        public Criteria andSEmailGreaterThan(String value) {
            addCriterion("s_email >", value, "sEmail");
            return (Criteria) this;
        }

        public Criteria andSEmailGreaterThanOrEqualTo(String value) {
            addCriterion("s_email >=", value, "sEmail");
            return (Criteria) this;
        }

        public Criteria andSEmailLessThan(String value) {
            addCriterion("s_email <", value, "sEmail");
            return (Criteria) this;
        }

        public Criteria andSEmailLessThanOrEqualTo(String value) {
            addCriterion("s_email <=", value, "sEmail");
            return (Criteria) this;
        }

        public Criteria andSEmailLike(String value) {
            addCriterion("s_email like", value, "sEmail");
            return (Criteria) this;
        }

        public Criteria andSEmailNotLike(String value) {
            addCriterion("s_email not like", value, "sEmail");
            return (Criteria) this;
        }

        public Criteria andSEmailIn(List<String> values) {
            addCriterion("s_email in", values, "sEmail");
            return (Criteria) this;
        }

        public Criteria andSEmailNotIn(List<String> values) {
            addCriterion("s_email not in", values, "sEmail");
            return (Criteria) this;
        }

        public Criteria andSEmailBetween(String value1, String value2) {
            addCriterion("s_email between", value1, value2, "sEmail");
            return (Criteria) this;
        }

        public Criteria andSEmailNotBetween(String value1, String value2) {
            addCriterion("s_email not between", value1, value2, "sEmail");
            return (Criteria) this;
        }

        public Criteria andSAddressIsNull() {
            addCriterion("s_address is null");
            return (Criteria) this;
        }

        public Criteria andSAddressIsNotNull() {
            addCriterion("s_address is not null");
            return (Criteria) this;
        }

        public Criteria andSAddressEqualTo(String value) {
            addCriterion("s_address =", value, "sAddress");
            return (Criteria) this;
        }

        public Criteria andSAddressNotEqualTo(String value) {
            addCriterion("s_address <>", value, "sAddress");
            return (Criteria) this;
        }

        public Criteria andSAddressGreaterThan(String value) {
            addCriterion("s_address >", value, "sAddress");
            return (Criteria) this;
        }

        public Criteria andSAddressGreaterThanOrEqualTo(String value) {
            addCriterion("s_address >=", value, "sAddress");
            return (Criteria) this;
        }

        public Criteria andSAddressLessThan(String value) {
            addCriterion("s_address <", value, "sAddress");
            return (Criteria) this;
        }

        public Criteria andSAddressLessThanOrEqualTo(String value) {
            addCriterion("s_address <=", value, "sAddress");
            return (Criteria) this;
        }

        public Criteria andSAddressLike(String value) {
            addCriterion("s_address like", value, "sAddress");
            return (Criteria) this;
        }

        public Criteria andSAddressNotLike(String value) {
            addCriterion("s_address not like", value, "sAddress");
            return (Criteria) this;
        }

        public Criteria andSAddressIn(List<String> values) {
            addCriterion("s_address in", values, "sAddress");
            return (Criteria) this;
        }

        public Criteria andSAddressNotIn(List<String> values) {
            addCriterion("s_address not in", values, "sAddress");
            return (Criteria) this;
        }

        public Criteria andSAddressBetween(String value1, String value2) {
            addCriterion("s_address between", value1, value2, "sAddress");
            return (Criteria) this;
        }

        public Criteria andSAddressNotBetween(String value1, String value2) {
            addCriterion("s_address not between", value1, value2, "sAddress");
            return (Criteria) this;
        }

        public Criteria andSNativeplaceIsNull() {
            addCriterion("s_nativeplace is null");
            return (Criteria) this;
        }

        public Criteria andSNativeplaceIsNotNull() {
            addCriterion("s_nativeplace is not null");
            return (Criteria) this;
        }

        public Criteria andSNativeplaceEqualTo(String value) {
            addCriterion("s_nativeplace =", value, "sNativeplace");
            return (Criteria) this;
        }

        public Criteria andSNativeplaceNotEqualTo(String value) {
            addCriterion("s_nativeplace <>", value, "sNativeplace");
            return (Criteria) this;
        }

        public Criteria andSNativeplaceGreaterThan(String value) {
            addCriterion("s_nativeplace >", value, "sNativeplace");
            return (Criteria) this;
        }

        public Criteria andSNativeplaceGreaterThanOrEqualTo(String value) {
            addCriterion("s_nativeplace >=", value, "sNativeplace");
            return (Criteria) this;
        }

        public Criteria andSNativeplaceLessThan(String value) {
            addCriterion("s_nativeplace <", value, "sNativeplace");
            return (Criteria) this;
        }

        public Criteria andSNativeplaceLessThanOrEqualTo(String value) {
            addCriterion("s_nativeplace <=", value, "sNativeplace");
            return (Criteria) this;
        }

        public Criteria andSNativeplaceLike(String value) {
            addCriterion("s_nativeplace like", value, "sNativeplace");
            return (Criteria) this;
        }

        public Criteria andSNativeplaceNotLike(String value) {
            addCriterion("s_nativeplace not like", value, "sNativeplace");
            return (Criteria) this;
        }

        public Criteria andSNativeplaceIn(List<String> values) {
            addCriterion("s_nativeplace in", values, "sNativeplace");
            return (Criteria) this;
        }

        public Criteria andSNativeplaceNotIn(List<String> values) {
            addCriterion("s_nativeplace not in", values, "sNativeplace");
            return (Criteria) this;
        }

        public Criteria andSNativeplaceBetween(String value1, String value2) {
            addCriterion("s_nativeplace between", value1, value2, "sNativeplace");
            return (Criteria) this;
        }

        public Criteria andSNativeplaceNotBetween(String value1, String value2) {
            addCriterion("s_nativeplace not between", value1, value2, "sNativeplace");
            return (Criteria) this;
        }

        public Criteria andSPhotoIsNull() {
            addCriterion("s_photo is null");
            return (Criteria) this;
        }

        public Criteria andSPhotoIsNotNull() {
            addCriterion("s_photo is not null");
            return (Criteria) this;
        }

        public Criteria andSPhotoEqualTo(String value) {
            addCriterion("s_photo =", value, "sPhoto");
            return (Criteria) this;
        }

        public Criteria andSPhotoNotEqualTo(String value) {
            addCriterion("s_photo <>", value, "sPhoto");
            return (Criteria) this;
        }

        public Criteria andSPhotoGreaterThan(String value) {
            addCriterion("s_photo >", value, "sPhoto");
            return (Criteria) this;
        }

        public Criteria andSPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("s_photo >=", value, "sPhoto");
            return (Criteria) this;
        }

        public Criteria andSPhotoLessThan(String value) {
            addCriterion("s_photo <", value, "sPhoto");
            return (Criteria) this;
        }

        public Criteria andSPhotoLessThanOrEqualTo(String value) {
            addCriterion("s_photo <=", value, "sPhoto");
            return (Criteria) this;
        }

        public Criteria andSPhotoLike(String value) {
            addCriterion("s_photo like", value, "sPhoto");
            return (Criteria) this;
        }

        public Criteria andSPhotoNotLike(String value) {
            addCriterion("s_photo not like", value, "sPhoto");
            return (Criteria) this;
        }

        public Criteria andSPhotoIn(List<String> values) {
            addCriterion("s_photo in", values, "sPhoto");
            return (Criteria) this;
        }

        public Criteria andSPhotoNotIn(List<String> values) {
            addCriterion("s_photo not in", values, "sPhoto");
            return (Criteria) this;
        }

        public Criteria andSPhotoBetween(String value1, String value2) {
            addCriterion("s_photo between", value1, value2, "sPhoto");
            return (Criteria) this;
        }

        public Criteria andSPhotoNotBetween(String value1, String value2) {
            addCriterion("s_photo not between", value1, value2, "sPhoto");
            return (Criteria) this;
        }

        public Criteria andSStatusIsNull() {
            addCriterion("s_status is null");
            return (Criteria) this;
        }

        public Criteria andSStatusIsNotNull() {
            addCriterion("s_status is not null");
            return (Criteria) this;
        }

        public Criteria andSStatusEqualTo(Integer value) {
            addCriterion("s_status =", value, "sStatus");
            return (Criteria) this;
        }

        public Criteria andSStatusNotEqualTo(Integer value) {
            addCriterion("s_status <>", value, "sStatus");
            return (Criteria) this;
        }

        public Criteria andSStatusGreaterThan(Integer value) {
            addCriterion("s_status >", value, "sStatus");
            return (Criteria) this;
        }

        public Criteria andSStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_status >=", value, "sStatus");
            return (Criteria) this;
        }

        public Criteria andSStatusLessThan(Integer value) {
            addCriterion("s_status <", value, "sStatus");
            return (Criteria) this;
        }

        public Criteria andSStatusLessThanOrEqualTo(Integer value) {
            addCriterion("s_status <=", value, "sStatus");
            return (Criteria) this;
        }

        public Criteria andSStatusIn(List<Integer> values) {
            addCriterion("s_status in", values, "sStatus");
            return (Criteria) this;
        }

        public Criteria andSStatusNotIn(List<Integer> values) {
            addCriterion("s_status not in", values, "sStatus");
            return (Criteria) this;
        }

        public Criteria andSStatusBetween(Integer value1, Integer value2) {
            addCriterion("s_status between", value1, value2, "sStatus");
            return (Criteria) this;
        }

        public Criteria andSStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("s_status not between", value1, value2, "sStatus");
            return (Criteria) this;
        }

        public Criteria andTcreatedateIsNull() {
            addCriterion("tcreatedate is null");
            return (Criteria) this;
        }

        public Criteria andTcreatedateIsNotNull() {
            addCriterion("tcreatedate is not null");
            return (Criteria) this;
        }

        public Criteria andTcreatedateEqualTo(Date value) {
            addCriterion("tcreatedate =", value, "tcreatedate");
            return (Criteria) this;
        }

        public Criteria andTcreatedateNotEqualTo(Date value) {
            addCriterion("tcreatedate <>", value, "tcreatedate");
            return (Criteria) this;
        }

        public Criteria andTcreatedateGreaterThan(Date value) {
            addCriterion("tcreatedate >", value, "tcreatedate");
            return (Criteria) this;
        }

        public Criteria andTcreatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("tcreatedate >=", value, "tcreatedate");
            return (Criteria) this;
        }

        public Criteria andTcreatedateLessThan(Date value) {
            addCriterion("tcreatedate <", value, "tcreatedate");
            return (Criteria) this;
        }

        public Criteria andTcreatedateLessThanOrEqualTo(Date value) {
            addCriterion("tcreatedate <=", value, "tcreatedate");
            return (Criteria) this;
        }

        public Criteria andTcreatedateIn(List<Date> values) {
            addCriterion("tcreatedate in", values, "tcreatedate");
            return (Criteria) this;
        }

        public Criteria andTcreatedateNotIn(List<Date> values) {
            addCriterion("tcreatedate not in", values, "tcreatedate");
            return (Criteria) this;
        }

        public Criteria andTcreatedateBetween(Date value1, Date value2) {
            addCriterion("tcreatedate between", value1, value2, "tcreatedate");
            return (Criteria) this;
        }

        public Criteria andTcreatedateNotBetween(Date value1, Date value2) {
            addCriterion("tcreatedate not between", value1, value2, "tcreatedate");
            return (Criteria) this;
        }

        public Criteria andToperatedateIsNull() {
            addCriterion("toperatedate is null");
            return (Criteria) this;
        }

        public Criteria andToperatedateIsNotNull() {
            addCriterion("toperatedate is not null");
            return (Criteria) this;
        }

        public Criteria andToperatedateEqualTo(Date value) {
            addCriterion("toperatedate =", value, "toperatedate");
            return (Criteria) this;
        }

        public Criteria andToperatedateNotEqualTo(Date value) {
            addCriterion("toperatedate <>", value, "toperatedate");
            return (Criteria) this;
        }

        public Criteria andToperatedateGreaterThan(Date value) {
            addCriterion("toperatedate >", value, "toperatedate");
            return (Criteria) this;
        }

        public Criteria andToperatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("toperatedate >=", value, "toperatedate");
            return (Criteria) this;
        }

        public Criteria andToperatedateLessThan(Date value) {
            addCriterion("toperatedate <", value, "toperatedate");
            return (Criteria) this;
        }

        public Criteria andToperatedateLessThanOrEqualTo(Date value) {
            addCriterion("toperatedate <=", value, "toperatedate");
            return (Criteria) this;
        }

        public Criteria andToperatedateIn(List<Date> values) {
            addCriterion("toperatedate in", values, "toperatedate");
            return (Criteria) this;
        }

        public Criteria andToperatedateNotIn(List<Date> values) {
            addCriterion("toperatedate not in", values, "toperatedate");
            return (Criteria) this;
        }

        public Criteria andToperatedateBetween(Date value1, Date value2) {
            addCriterion("toperatedate between", value1, value2, "toperatedate");
            return (Criteria) this;
        }

        public Criteria andToperatedateNotBetween(Date value1, Date value2) {
            addCriterion("toperatedate not between", value1, value2, "toperatedate");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}