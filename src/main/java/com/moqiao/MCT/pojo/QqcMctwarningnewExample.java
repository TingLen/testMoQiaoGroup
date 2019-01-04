package com.moqiao.MCT.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QqcMctwarningnewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QqcMctwarningnewExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(BigDecimal value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(BigDecimal value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(BigDecimal value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(BigDecimal value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<BigDecimal> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<BigDecimal> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andWarntyepIsNull() {
            addCriterion("WARNTYEP is null");
            return (Criteria) this;
        }

        public Criteria andWarntyepIsNotNull() {
            addCriterion("WARNTYEP is not null");
            return (Criteria) this;
        }

        public Criteria andWarntyepEqualTo(String value) {
            addCriterion("WARNTYEP =", value, "warntyep");
            return (Criteria) this;
        }

        public Criteria andWarntyepNotEqualTo(String value) {
            addCriterion("WARNTYEP <>", value, "warntyep");
            return (Criteria) this;
        }

        public Criteria andWarntyepGreaterThan(String value) {
            addCriterion("WARNTYEP >", value, "warntyep");
            return (Criteria) this;
        }

        public Criteria andWarntyepGreaterThanOrEqualTo(String value) {
            addCriterion("WARNTYEP >=", value, "warntyep");
            return (Criteria) this;
        }

        public Criteria andWarntyepLessThan(String value) {
            addCriterion("WARNTYEP <", value, "warntyep");
            return (Criteria) this;
        }

        public Criteria andWarntyepLessThanOrEqualTo(String value) {
            addCriterion("WARNTYEP <=", value, "warntyep");
            return (Criteria) this;
        }

        public Criteria andWarntyepLike(String value) {
            addCriterion("WARNTYEP like", value, "warntyep");
            return (Criteria) this;
        }

        public Criteria andWarntyepNotLike(String value) {
            addCriterion("WARNTYEP not like", value, "warntyep");
            return (Criteria) this;
        }

        public Criteria andWarntyepIn(List<String> values) {
            addCriterion("WARNTYEP in", values, "warntyep");
            return (Criteria) this;
        }

        public Criteria andWarntyepNotIn(List<String> values) {
            addCriterion("WARNTYEP not in", values, "warntyep");
            return (Criteria) this;
        }

        public Criteria andWarntyepBetween(String value1, String value2) {
            addCriterion("WARNTYEP between", value1, value2, "warntyep");
            return (Criteria) this;
        }

        public Criteria andWarntyepNotBetween(String value1, String value2) {
            addCriterion("WARNTYEP not between", value1, value2, "warntyep");
            return (Criteria) this;
        }

        public Criteria andMctguidIsNull() {
            addCriterion("MCTGUID is null");
            return (Criteria) this;
        }

        public Criteria andMctguidIsNotNull() {
            addCriterion("MCTGUID is not null");
            return (Criteria) this;
        }

        public Criteria andMctguidEqualTo(String value) {
            addCriterion("MCTGUID =", value, "mctguid");
            return (Criteria) this;
        }

        public Criteria andMctguidNotEqualTo(String value) {
            addCriterion("MCTGUID <>", value, "mctguid");
            return (Criteria) this;
        }

        public Criteria andMctguidGreaterThan(String value) {
            addCriterion("MCTGUID >", value, "mctguid");
            return (Criteria) this;
        }

        public Criteria andMctguidGreaterThanOrEqualTo(String value) {
            addCriterion("MCTGUID >=", value, "mctguid");
            return (Criteria) this;
        }

        public Criteria andMctguidLessThan(String value) {
            addCriterion("MCTGUID <", value, "mctguid");
            return (Criteria) this;
        }

        public Criteria andMctguidLessThanOrEqualTo(String value) {
            addCriterion("MCTGUID <=", value, "mctguid");
            return (Criteria) this;
        }

        public Criteria andMctguidLike(String value) {
            addCriterion("MCTGUID like", value, "mctguid");
            return (Criteria) this;
        }

        public Criteria andMctguidNotLike(String value) {
            addCriterion("MCTGUID not like", value, "mctguid");
            return (Criteria) this;
        }

        public Criteria andMctguidIn(List<String> values) {
            addCriterion("MCTGUID in", values, "mctguid");
            return (Criteria) this;
        }

        public Criteria andMctguidNotIn(List<String> values) {
            addCriterion("MCTGUID not in", values, "mctguid");
            return (Criteria) this;
        }

        public Criteria andMctguidBetween(String value1, String value2) {
            addCriterion("MCTGUID between", value1, value2, "mctguid");
            return (Criteria) this;
        }

        public Criteria andMctguidNotBetween(String value1, String value2) {
            addCriterion("MCTGUID not between", value1, value2, "mctguid");
            return (Criteria) this;
        }

        public Criteria andMctstoreyIsNull() {
            addCriterion("MCTSTOREY is null");
            return (Criteria) this;
        }

        public Criteria andMctstoreyIsNotNull() {
            addCriterion("MCTSTOREY is not null");
            return (Criteria) this;
        }

        public Criteria andMctstoreyEqualTo(BigDecimal value) {
            addCriterion("MCTSTOREY =", value, "mctstorey");
            return (Criteria) this;
        }

        public Criteria andMctstoreyNotEqualTo(BigDecimal value) {
            addCriterion("MCTSTOREY <>", value, "mctstorey");
            return (Criteria) this;
        }

        public Criteria andMctstoreyGreaterThan(BigDecimal value) {
            addCriterion("MCTSTOREY >", value, "mctstorey");
            return (Criteria) this;
        }

        public Criteria andMctstoreyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MCTSTOREY >=", value, "mctstorey");
            return (Criteria) this;
        }

        public Criteria andMctstoreyLessThan(BigDecimal value) {
            addCriterion("MCTSTOREY <", value, "mctstorey");
            return (Criteria) this;
        }

        public Criteria andMctstoreyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MCTSTOREY <=", value, "mctstorey");
            return (Criteria) this;
        }

        public Criteria andMctstoreyIn(List<BigDecimal> values) {
            addCriterion("MCTSTOREY in", values, "mctstorey");
            return (Criteria) this;
        }

        public Criteria andMctstoreyNotIn(List<BigDecimal> values) {
            addCriterion("MCTSTOREY not in", values, "mctstorey");
            return (Criteria) this;
        }

        public Criteria andMctstoreyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MCTSTOREY between", value1, value2, "mctstorey");
            return (Criteria) this;
        }

        public Criteria andMctstoreyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MCTSTOREY not between", value1, value2, "mctstorey");
            return (Criteria) this;
        }

        public Criteria andWarndateIsNull() {
            addCriterion("WARNDATE is null");
            return (Criteria) this;
        }

        public Criteria andWarndateIsNotNull() {
            addCriterion("WARNDATE is not null");
            return (Criteria) this;
        }

        public Criteria andWarndateEqualTo(Date value) {
            addCriterion("WARNDATE =", value, "warndate");
            return (Criteria) this;
        }

        public Criteria andWarndateNotEqualTo(Date value) {
            addCriterion("WARNDATE <>", value, "warndate");
            return (Criteria) this;
        }

        public Criteria andWarndateGreaterThan(Date value) {
            addCriterion("WARNDATE >", value, "warndate");
            return (Criteria) this;
        }

        public Criteria andWarndateGreaterThanOrEqualTo(Date value) {
            addCriterion("WARNDATE >=", value, "warndate");
            return (Criteria) this;
        }

        public Criteria andWarndateLessThan(Date value) {
            addCriterion("WARNDATE <", value, "warndate");
            return (Criteria) this;
        }

        public Criteria andWarndateLessThanOrEqualTo(Date value) {
            addCriterion("WARNDATE <=", value, "warndate");
            return (Criteria) this;
        }

        public Criteria andWarndateIn(List<Date> values) {
            addCriterion("WARNDATE in", values, "warndate");
            return (Criteria) this;
        }

        public Criteria andWarndateNotIn(List<Date> values) {
            addCriterion("WARNDATE not in", values, "warndate");
            return (Criteria) this;
        }

        public Criteria andWarndateBetween(Date value1, Date value2) {
            addCriterion("WARNDATE between", value1, value2, "warndate");
            return (Criteria) this;
        }

        public Criteria andWarndateNotBetween(Date value1, Date value2) {
            addCriterion("WARNDATE not between", value1, value2, "warndate");
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