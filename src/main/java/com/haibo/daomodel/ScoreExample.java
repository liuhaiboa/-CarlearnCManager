package com.haibo.daomodel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ScoreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScoreExample() {
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

        public Criteria andSScoreIsNull() {
            addCriterion("s_score is null");
            return (Criteria) this;
        }

        public Criteria andSScoreIsNotNull() {
            addCriterion("s_score is not null");
            return (Criteria) this;
        }

        public Criteria andSScoreEqualTo(String value) {
            addCriterion("s_score =", value, "sScore");
            return (Criteria) this;
        }

        public Criteria andSScoreNotEqualTo(String value) {
            addCriterion("s_score <>", value, "sScore");
            return (Criteria) this;
        }

        public Criteria andSScoreGreaterThan(String value) {
            addCriterion("s_score >", value, "sScore");
            return (Criteria) this;
        }

        public Criteria andSScoreGreaterThanOrEqualTo(String value) {
            addCriterion("s_score >=", value, "sScore");
            return (Criteria) this;
        }

        public Criteria andSScoreLessThan(String value) {
            addCriterion("s_score <", value, "sScore");
            return (Criteria) this;
        }

        public Criteria andSScoreLessThanOrEqualTo(String value) {
            addCriterion("s_score <=", value, "sScore");
            return (Criteria) this;
        }

        public Criteria andSScoreLike(String value) {
            addCriterion("s_score like", value, "sScore");
            return (Criteria) this;
        }

        public Criteria andSScoreNotLike(String value) {
            addCriterion("s_score not like", value, "sScore");
            return (Criteria) this;
        }

        public Criteria andSScoreIn(List<String> values) {
            addCriterion("s_score in", values, "sScore");
            return (Criteria) this;
        }

        public Criteria andSScoreNotIn(List<String> values) {
            addCriterion("s_score not in", values, "sScore");
            return (Criteria) this;
        }

        public Criteria andSScoreBetween(String value1, String value2) {
            addCriterion("s_score between", value1, value2, "sScore");
            return (Criteria) this;
        }

        public Criteria andSScoreNotBetween(String value1, String value2) {
            addCriterion("s_score not between", value1, value2, "sScore");
            return (Criteria) this;
        }

        public Criteria andSUseridcardIsNull() {
            addCriterion("s_useridcard is null");
            return (Criteria) this;
        }

        public Criteria andSUseridcardIsNotNull() {
            addCriterion("s_useridcard is not null");
            return (Criteria) this;
        }

        public Criteria andSUseridcardEqualTo(String value) {
            addCriterion("s_useridcard =", value, "sUseridcard");
            return (Criteria) this;
        }

        public Criteria andSUseridcardNotEqualTo(String value) {
            addCriterion("s_useridcard <>", value, "sUseridcard");
            return (Criteria) this;
        }

        public Criteria andSUseridcardGreaterThan(String value) {
            addCriterion("s_useridcard >", value, "sUseridcard");
            return (Criteria) this;
        }

        public Criteria andSUseridcardGreaterThanOrEqualTo(String value) {
            addCriterion("s_useridcard >=", value, "sUseridcard");
            return (Criteria) this;
        }

        public Criteria andSUseridcardLessThan(String value) {
            addCriterion("s_useridcard <", value, "sUseridcard");
            return (Criteria) this;
        }

        public Criteria andSUseridcardLessThanOrEqualTo(String value) {
            addCriterion("s_useridcard <=", value, "sUseridcard");
            return (Criteria) this;
        }

        public Criteria andSUseridcardLike(String value) {
            addCriterion("s_useridcard like", value, "sUseridcard");
            return (Criteria) this;
        }

        public Criteria andSUseridcardNotLike(String value) {
            addCriterion("s_useridcard not like", value, "sUseridcard");
            return (Criteria) this;
        }

        public Criteria andSUseridcardIn(List<String> values) {
            addCriterion("s_useridcard in", values, "sUseridcard");
            return (Criteria) this;
        }

        public Criteria andSUseridcardNotIn(List<String> values) {
            addCriterion("s_useridcard not in", values, "sUseridcard");
            return (Criteria) this;
        }

        public Criteria andSUseridcardBetween(String value1, String value2) {
            addCriterion("s_useridcard between", value1, value2, "sUseridcard");
            return (Criteria) this;
        }

        public Criteria andSUseridcardNotBetween(String value1, String value2) {
            addCriterion("s_useridcard not between", value1, value2, "sUseridcard");
            return (Criteria) this;
        }

        public Criteria andSUseridIsNull() {
            addCriterion("s_userid is null");
            return (Criteria) this;
        }

        public Criteria andSUseridIsNotNull() {
            addCriterion("s_userid is not null");
            return (Criteria) this;
        }

        public Criteria andSUseridEqualTo(Integer value) {
            addCriterion("s_userid =", value, "sUserid");
            return (Criteria) this;
        }

        public Criteria andSUseridNotEqualTo(Integer value) {
            addCriterion("s_userid <>", value, "sUserid");
            return (Criteria) this;
        }

        public Criteria andSUseridGreaterThan(Integer value) {
            addCriterion("s_userid >", value, "sUserid");
            return (Criteria) this;
        }

        public Criteria andSUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_userid >=", value, "sUserid");
            return (Criteria) this;
        }

        public Criteria andSUseridLessThan(Integer value) {
            addCriterion("s_userid <", value, "sUserid");
            return (Criteria) this;
        }

        public Criteria andSUseridLessThanOrEqualTo(Integer value) {
            addCriterion("s_userid <=", value, "sUserid");
            return (Criteria) this;
        }

        public Criteria andSUseridIn(List<Integer> values) {
            addCriterion("s_userid in", values, "sUserid");
            return (Criteria) this;
        }

        public Criteria andSUseridNotIn(List<Integer> values) {
            addCriterion("s_userid not in", values, "sUserid");
            return (Criteria) this;
        }

        public Criteria andSUseridBetween(Integer value1, Integer value2) {
            addCriterion("s_userid between", value1, value2, "sUserid");
            return (Criteria) this;
        }

        public Criteria andSUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("s_userid not between", value1, value2, "sUserid");
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