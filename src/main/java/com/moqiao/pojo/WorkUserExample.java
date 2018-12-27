package com.moqiao.pojo;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

public class WorkUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WorkUserExample() {
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

        public Criteria andUsercodeIsNull() {
            addCriterion("USERCODE is null");
            return (Criteria) this;
        }

        public Criteria andUsercodeIsNotNull() {
            addCriterion("USERCODE is not null");
            return (Criteria) this;
        }

        public Criteria andUsercodeEqualTo(String value) {
            addCriterion("USERCODE =", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeNotEqualTo(String value) {
            addCriterion("USERCODE <>", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeGreaterThan(String value) {
            addCriterion("USERCODE >", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeGreaterThanOrEqualTo(String value) {
            addCriterion("USERCODE >=", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeLessThan(String value) {
            addCriterion("USERCODE <", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeLessThanOrEqualTo(String value) {
            addCriterion("USERCODE <=", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeLike(String value) {
            addCriterion("USERCODE like", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeNotLike(String value) {
            addCriterion("USERCODE not like", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeIn(List<String> values) {
            addCriterion("USERCODE in", values, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeNotIn(List<String> values) {
            addCriterion("USERCODE not in", values, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeBetween(String value1, String value2) {
            addCriterion("USERCODE between", value1, value2, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeNotBetween(String value1, String value2) {
            addCriterion("USERCODE not between", value1, value2, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("USERNAME is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("USERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("USERNAME =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("USERNAME <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("USERNAME >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("USERNAME >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("USERNAME <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("USERNAME <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("USERNAME like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("USERNAME not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("USERNAME in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("USERNAME not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("USERNAME between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("USERNAME not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsersexIsNull() {
            addCriterion("USERSEX is null");
            return (Criteria) this;
        }

        public Criteria andUsersexIsNotNull() {
            addCriterion("USERSEX is not null");
            return (Criteria) this;
        }

        public Criteria andUsersexEqualTo(String value) {
            addCriterion("USERSEX =", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexNotEqualTo(String value) {
            addCriterion("USERSEX <>", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexGreaterThan(String value) {
            addCriterion("USERSEX >", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexGreaterThanOrEqualTo(String value) {
            addCriterion("USERSEX >=", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexLessThan(String value) {
            addCriterion("USERSEX <", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexLessThanOrEqualTo(String value) {
            addCriterion("USERSEX <=", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexLike(String value) {
            addCriterion("USERSEX like", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexNotLike(String value) {
            addCriterion("USERSEX not like", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexIn(List<String> values) {
            addCriterion("USERSEX in", values, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexNotIn(List<String> values) {
            addCriterion("USERSEX not in", values, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexBetween(String value1, String value2) {
            addCriterion("USERSEX between", value1, value2, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexNotBetween(String value1, String value2) {
            addCriterion("USERSEX not between", value1, value2, "usersex");
            return (Criteria) this;
        }

        public Criteria andDepttypeIsNull() {
            addCriterion("DEPTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andDepttypeIsNotNull() {
            addCriterion("DEPTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDepttypeEqualTo(String value) {
            addCriterion("DEPTTYPE =", value, "depttype");
            return (Criteria) this;
        }

        public Criteria andDepttypeNotEqualTo(String value) {
            addCriterion("DEPTTYPE <>", value, "depttype");
            return (Criteria) this;
        }

        public Criteria andDepttypeGreaterThan(String value) {
            addCriterion("DEPTTYPE >", value, "depttype");
            return (Criteria) this;
        }

        public Criteria andDepttypeGreaterThanOrEqualTo(String value) {
            addCriterion("DEPTTYPE >=", value, "depttype");
            return (Criteria) this;
        }

        public Criteria andDepttypeLessThan(String value) {
            addCriterion("DEPTTYPE <", value, "depttype");
            return (Criteria) this;
        }

        public Criteria andDepttypeLessThanOrEqualTo(String value) {
            addCriterion("DEPTTYPE <=", value, "depttype");
            return (Criteria) this;
        }

        public Criteria andDepttypeLike(String value) {
            addCriterion("DEPTTYPE like", value, "depttype");
            return (Criteria) this;
        }

        public Criteria andDepttypeNotLike(String value) {
            addCriterion("DEPTTYPE not like", value, "depttype");
            return (Criteria) this;
        }

        public Criteria andDepttypeIn(List<String> values) {
            addCriterion("DEPTTYPE in", values, "depttype");
            return (Criteria) this;
        }

        public Criteria andDepttypeNotIn(List<String> values) {
            addCriterion("DEPTTYPE not in", values, "depttype");
            return (Criteria) this;
        }

        public Criteria andDepttypeBetween(String value1, String value2) {
            addCriterion("DEPTTYPE between", value1, value2, "depttype");
            return (Criteria) this;
        }

        public Criteria andDepttypeNotBetween(String value1, String value2) {
            addCriterion("DEPTTYPE not between", value1, value2, "depttype");
            return (Criteria) this;
        }

        public Criteria andUserpasswordIsNull() {
            addCriterion("USERPASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andUserpasswordIsNotNull() {
            addCriterion("USERPASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andUserpasswordEqualTo(String value) {
            addCriterion("USERPASSWORD =", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordNotEqualTo(String value) {
            addCriterion("USERPASSWORD <>", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordGreaterThan(String value) {
            addCriterion("USERPASSWORD >", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("USERPASSWORD >=", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordLessThan(String value) {
            addCriterion("USERPASSWORD <", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordLessThanOrEqualTo(String value) {
            addCriterion("USERPASSWORD <=", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordLike(String value) {
            addCriterion("USERPASSWORD like", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordNotLike(String value) {
            addCriterion("USERPASSWORD not like", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordIn(List<String> values) {
            addCriterion("USERPASSWORD in", values, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordNotIn(List<String> values) {
            addCriterion("USERPASSWORD not in", values, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordBetween(String value1, String value2) {
            addCriterion("USERPASSWORD between", value1, value2, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordNotBetween(String value1, String value2) {
            addCriterion("USERPASSWORD not between", value1, value2, "userpassword");
            return (Criteria) this;
        }

        public Criteria andDeptcodeIsNull() {
            addCriterion("DEPTCODE is null");
            return (Criteria) this;
        }

        public Criteria andDeptcodeIsNotNull() {
            addCriterion("DEPTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andDeptcodeEqualTo(String value) {
            addCriterion("DEPTCODE =", value, "deptcode");
            return (Criteria) this;
        }

        public Criteria andDeptcodeNotEqualTo(String value) {
            addCriterion("DEPTCODE <>", value, "deptcode");
            return (Criteria) this;
        }

        public Criteria andDeptcodeGreaterThan(String value) {
            addCriterion("DEPTCODE >", value, "deptcode");
            return (Criteria) this;
        }

        public Criteria andDeptcodeGreaterThanOrEqualTo(String value) {
            addCriterion("DEPTCODE >=", value, "deptcode");
            return (Criteria) this;
        }

        public Criteria andDeptcodeLessThan(String value) {
            addCriterion("DEPTCODE <", value, "deptcode");
            return (Criteria) this;
        }

        public Criteria andDeptcodeLessThanOrEqualTo(String value) {
            addCriterion("DEPTCODE <=", value, "deptcode");
            return (Criteria) this;
        }

        public Criteria andDeptcodeLike(String value) {
            addCriterion("DEPTCODE like", value, "deptcode");
            return (Criteria) this;
        }

        public Criteria andDeptcodeNotLike(String value) {
            addCriterion("DEPTCODE not like", value, "deptcode");
            return (Criteria) this;
        }

        public Criteria andDeptcodeIn(List<String> values) {
            addCriterion("DEPTCODE in", values, "deptcode");
            return (Criteria) this;
        }

        public Criteria andDeptcodeNotIn(List<String> values) {
            addCriterion("DEPTCODE not in", values, "deptcode");
            return (Criteria) this;
        }

        public Criteria andDeptcodeBetween(String value1, String value2) {
            addCriterion("DEPTCODE between", value1, value2, "deptcode");
            return (Criteria) this;
        }

        public Criteria andDeptcodeNotBetween(String value1, String value2) {
            addCriterion("DEPTCODE not between", value1, value2, "deptcode");
            return (Criteria) this;
        }

        public Criteria andTitlecodeIsNull() {
            addCriterion("TITLECODE is null");
            return (Criteria) this;
        }

        public Criteria andTitlecodeIsNotNull() {
            addCriterion("TITLECODE is not null");
            return (Criteria) this;
        }

        public Criteria andTitlecodeEqualTo(String value) {
            addCriterion("TITLECODE =", value, "titlecode");
            return (Criteria) this;
        }

        public Criteria andTitlecodeNotEqualTo(String value) {
            addCriterion("TITLECODE <>", value, "titlecode");
            return (Criteria) this;
        }

        public Criteria andTitlecodeGreaterThan(String value) {
            addCriterion("TITLECODE >", value, "titlecode");
            return (Criteria) this;
        }

        public Criteria andTitlecodeGreaterThanOrEqualTo(String value) {
            addCriterion("TITLECODE >=", value, "titlecode");
            return (Criteria) this;
        }

        public Criteria andTitlecodeLessThan(String value) {
            addCriterion("TITLECODE <", value, "titlecode");
            return (Criteria) this;
        }

        public Criteria andTitlecodeLessThanOrEqualTo(String value) {
            addCriterion("TITLECODE <=", value, "titlecode");
            return (Criteria) this;
        }

        public Criteria andTitlecodeLike(String value) {
            addCriterion("TITLECODE like", value, "titlecode");
            return (Criteria) this;
        }

        public Criteria andTitlecodeNotLike(String value) {
            addCriterion("TITLECODE not like", value, "titlecode");
            return (Criteria) this;
        }

        public Criteria andTitlecodeIn(List<String> values) {
            addCriterion("TITLECODE in", values, "titlecode");
            return (Criteria) this;
        }

        public Criteria andTitlecodeNotIn(List<String> values) {
            addCriterion("TITLECODE not in", values, "titlecode");
            return (Criteria) this;
        }

        public Criteria andTitlecodeBetween(String value1, String value2) {
            addCriterion("TITLECODE between", value1, value2, "titlecode");
            return (Criteria) this;
        }

        public Criteria andTitlecodeNotBetween(String value1, String value2) {
            addCriterion("TITLECODE not between", value1, value2, "titlecode");
            return (Criteria) this;
        }

        public Criteria andEpscodeIsNull() {
            addCriterion("EPSCODE is null");
            return (Criteria) this;
        }

        public Criteria andEpscodeIsNotNull() {
            addCriterion("EPSCODE is not null");
            return (Criteria) this;
        }

        public Criteria andEpscodeEqualTo(String value) {
            addCriterion("EPSCODE =", value, "epscode");
            return (Criteria) this;
        }

        public Criteria andEpscodeNotEqualTo(String value) {
            addCriterion("EPSCODE <>", value, "epscode");
            return (Criteria) this;
        }

        public Criteria andEpscodeGreaterThan(String value) {
            addCriterion("EPSCODE >", value, "epscode");
            return (Criteria) this;
        }

        public Criteria andEpscodeGreaterThanOrEqualTo(String value) {
            addCriterion("EPSCODE >=", value, "epscode");
            return (Criteria) this;
        }

        public Criteria andEpscodeLessThan(String value) {
            addCriterion("EPSCODE <", value, "epscode");
            return (Criteria) this;
        }

        public Criteria andEpscodeLessThanOrEqualTo(String value) {
            addCriterion("EPSCODE <=", value, "epscode");
            return (Criteria) this;
        }

        public Criteria andEpscodeLike(String value) {
            addCriterion("EPSCODE like", value, "epscode");
            return (Criteria) this;
        }

        public Criteria andEpscodeNotLike(String value) {
            addCriterion("EPSCODE not like", value, "epscode");
            return (Criteria) this;
        }

        public Criteria andEpscodeIn(List<String> values) {
            addCriterion("EPSCODE in", values, "epscode");
            return (Criteria) this;
        }

        public Criteria andEpscodeNotIn(List<String> values) {
            addCriterion("EPSCODE not in", values, "epscode");
            return (Criteria) this;
        }

        public Criteria andEpscodeBetween(String value1, String value2) {
            addCriterion("EPSCODE between", value1, value2, "epscode");
            return (Criteria) this;
        }

        public Criteria andEpscodeNotBetween(String value1, String value2) {
            addCriterion("EPSCODE not between", value1, value2, "epscode");
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