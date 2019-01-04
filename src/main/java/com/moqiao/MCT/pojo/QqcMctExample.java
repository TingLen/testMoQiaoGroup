package com.moqiao.MCT.pojo;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class QqcMctExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QqcMctExample() {
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

        public Criteria andDatetimeIsNull() {
            addCriterion("DATETIME is null");
            return (Criteria) this;
        }

        public Criteria andDatetimeIsNotNull() {
            addCriterion("DATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andDatetimeEqualTo(Date value) {
            addCriterion("DATETIME =", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeNotEqualTo(Date value) {
            addCriterion("DATETIME <>", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeGreaterThan(Date value) {
            addCriterion("DATETIME >", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("DATETIME >=", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeLessThan(Date value) {
            addCriterion("DATETIME <", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("DATETIME <=", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeIn(List<Date> values) {
            addCriterion("DATETIME in", values, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeNotIn(List<Date> values) {
            addCriterion("DATETIME not in", values, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeBetween(Date value1, Date value2) {
            addCriterion("DATETIME between", value1, value2, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("DATETIME not between", value1, value2, "datetime");
            return (Criteria) this;
        }

        public Criteria andStoreyIsNull() {
            addCriterion("STOREY is null");
            return (Criteria) this;
        }

        public Criteria andStoreyIsNotNull() {
            addCriterion("STOREY is not null");
            return (Criteria) this;
        }

        public Criteria andStoreyEqualTo(BigDecimal value) {
            addCriterion("STOREY =", value, "storey");
            return (Criteria) this;
        }

        public Criteria andStoreyNotEqualTo(BigDecimal value) {
            addCriterion("STOREY <>", value, "storey");
            return (Criteria) this;
        }

        public Criteria andStoreyGreaterThan(BigDecimal value) {
            addCriterion("STOREY >", value, "storey");
            return (Criteria) this;
        }

        public Criteria andStoreyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("STOREY >=", value, "storey");
            return (Criteria) this;
        }

        public Criteria andStoreyLessThan(BigDecimal value) {
            addCriterion("STOREY <", value, "storey");
            return (Criteria) this;
        }

        public Criteria andStoreyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("STOREY <=", value, "storey");
            return (Criteria) this;
        }

        public Criteria andStoreyIn(List<BigDecimal> values) {
            addCriterion("STOREY in", values, "storey");
            return (Criteria) this;
        }

        public Criteria andStoreyNotIn(List<BigDecimal> values) {
            addCriterion("STOREY not in", values, "storey");
            return (Criteria) this;
        }

        public Criteria andStoreyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STOREY between", value1, value2, "storey");
            return (Criteria) this;
        }

        public Criteria andStoreyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STOREY not between", value1, value2, "storey");
            return (Criteria) this;
        }

        public Criteria andConTemp1IsNull() {
            addCriterion("CON_TEMP1 is null");
            return (Criteria) this;
        }

        public Criteria andConTemp1IsNotNull() {
            addCriterion("CON_TEMP1 is not null");
            return (Criteria) this;
        }

        public Criteria andConTemp1EqualTo(BigDecimal value) {
            addCriterion("CON_TEMP1 =", value, "conTemp1");
            return (Criteria) this;
        }

        public Criteria andConTemp1NotEqualTo(BigDecimal value) {
            addCriterion("CON_TEMP1 <>", value, "conTemp1");
            return (Criteria) this;
        }

        public Criteria andConTemp1GreaterThan(BigDecimal value) {
            addCriterion("CON_TEMP1 >", value, "conTemp1");
            return (Criteria) this;
        }

        public Criteria andConTemp1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CON_TEMP1 >=", value, "conTemp1");
            return (Criteria) this;
        }

        public Criteria andConTemp1LessThan(BigDecimal value) {
            addCriterion("CON_TEMP1 <", value, "conTemp1");
            return (Criteria) this;
        }

        public Criteria andConTemp1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("CON_TEMP1 <=", value, "conTemp1");
            return (Criteria) this;
        }

        public Criteria andConTemp1In(List<BigDecimal> values) {
            addCriterion("CON_TEMP1 in", values, "conTemp1");
            return (Criteria) this;
        }

        public Criteria andConTemp1NotIn(List<BigDecimal> values) {
            addCriterion("CON_TEMP1 not in", values, "conTemp1");
            return (Criteria) this;
        }

        public Criteria andConTemp1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("CON_TEMP1 between", value1, value2, "conTemp1");
            return (Criteria) this;
        }

        public Criteria andConTemp1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CON_TEMP1 not between", value1, value2, "conTemp1");
            return (Criteria) this;
        }

        public Criteria andConTemp2IsNull() {
            addCriterion("CON_TEMP2 is null");
            return (Criteria) this;
        }

        public Criteria andConTemp2IsNotNull() {
            addCriterion("CON_TEMP2 is not null");
            return (Criteria) this;
        }

        public Criteria andConTemp2EqualTo(BigDecimal value) {
            addCriterion("CON_TEMP2 =", value, "conTemp2");
            return (Criteria) this;
        }

        public Criteria andConTemp2NotEqualTo(BigDecimal value) {
            addCriterion("CON_TEMP2 <>", value, "conTemp2");
            return (Criteria) this;
        }

        public Criteria andConTemp2GreaterThan(BigDecimal value) {
            addCriterion("CON_TEMP2 >", value, "conTemp2");
            return (Criteria) this;
        }

        public Criteria andConTemp2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CON_TEMP2 >=", value, "conTemp2");
            return (Criteria) this;
        }

        public Criteria andConTemp2LessThan(BigDecimal value) {
            addCriterion("CON_TEMP2 <", value, "conTemp2");
            return (Criteria) this;
        }

        public Criteria andConTemp2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("CON_TEMP2 <=", value, "conTemp2");
            return (Criteria) this;
        }

        public Criteria andConTemp2In(List<BigDecimal> values) {
            addCriterion("CON_TEMP2 in", values, "conTemp2");
            return (Criteria) this;
        }

        public Criteria andConTemp2NotIn(List<BigDecimal> values) {
            addCriterion("CON_TEMP2 not in", values, "conTemp2");
            return (Criteria) this;
        }

        public Criteria andConTemp2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("CON_TEMP2 between", value1, value2, "conTemp2");
            return (Criteria) this;
        }

        public Criteria andConTemp2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CON_TEMP2 not between", value1, value2, "conTemp2");
            return (Criteria) this;
        }

        public Criteria andConTemp3IsNull() {
            addCriterion("CON_TEMP3 is null");
            return (Criteria) this;
        }

        public Criteria andConTemp3IsNotNull() {
            addCriterion("CON_TEMP3 is not null");
            return (Criteria) this;
        }

        public Criteria andConTemp3EqualTo(BigDecimal value) {
            addCriterion("CON_TEMP3 =", value, "conTemp3");
            return (Criteria) this;
        }

        public Criteria andConTemp3NotEqualTo(BigDecimal value) {
            addCriterion("CON_TEMP3 <>", value, "conTemp3");
            return (Criteria) this;
        }

        public Criteria andConTemp3GreaterThan(BigDecimal value) {
            addCriterion("CON_TEMP3 >", value, "conTemp3");
            return (Criteria) this;
        }

        public Criteria andConTemp3GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CON_TEMP3 >=", value, "conTemp3");
            return (Criteria) this;
        }

        public Criteria andConTemp3LessThan(BigDecimal value) {
            addCriterion("CON_TEMP3 <", value, "conTemp3");
            return (Criteria) this;
        }

        public Criteria andConTemp3LessThanOrEqualTo(BigDecimal value) {
            addCriterion("CON_TEMP3 <=", value, "conTemp3");
            return (Criteria) this;
        }

        public Criteria andConTemp3In(List<BigDecimal> values) {
            addCriterion("CON_TEMP3 in", values, "conTemp3");
            return (Criteria) this;
        }

        public Criteria andConTemp3NotIn(List<BigDecimal> values) {
            addCriterion("CON_TEMP3 not in", values, "conTemp3");
            return (Criteria) this;
        }

        public Criteria andConTemp3Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("CON_TEMP3 between", value1, value2, "conTemp3");
            return (Criteria) this;
        }

        public Criteria andConTemp3NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CON_TEMP3 not between", value1, value2, "conTemp3");
            return (Criteria) this;
        }

        public Criteria andConTemp4IsNull() {
            addCriterion("CON_TEMP4 is null");
            return (Criteria) this;
        }

        public Criteria andConTemp4IsNotNull() {
            addCriterion("CON_TEMP4 is not null");
            return (Criteria) this;
        }

        public Criteria andConTemp4EqualTo(BigDecimal value) {
            addCriterion("CON_TEMP4 =", value, "conTemp4");
            return (Criteria) this;
        }

        public Criteria andConTemp4NotEqualTo(BigDecimal value) {
            addCriterion("CON_TEMP4 <>", value, "conTemp4");
            return (Criteria) this;
        }

        public Criteria andConTemp4GreaterThan(BigDecimal value) {
            addCriterion("CON_TEMP4 >", value, "conTemp4");
            return (Criteria) this;
        }

        public Criteria andConTemp4GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CON_TEMP4 >=", value, "conTemp4");
            return (Criteria) this;
        }

        public Criteria andConTemp4LessThan(BigDecimal value) {
            addCriterion("CON_TEMP4 <", value, "conTemp4");
            return (Criteria) this;
        }

        public Criteria andConTemp4LessThanOrEqualTo(BigDecimal value) {
            addCriterion("CON_TEMP4 <=", value, "conTemp4");
            return (Criteria) this;
        }

        public Criteria andConTemp4In(List<BigDecimal> values) {
            addCriterion("CON_TEMP4 in", values, "conTemp4");
            return (Criteria) this;
        }

        public Criteria andConTemp4NotIn(List<BigDecimal> values) {
            addCriterion("CON_TEMP4 not in", values, "conTemp4");
            return (Criteria) this;
        }

        public Criteria andConTemp4Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("CON_TEMP4 between", value1, value2, "conTemp4");
            return (Criteria) this;
        }

        public Criteria andConTemp4NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CON_TEMP4 not between", value1, value2, "conTemp4");
            return (Criteria) this;
        }

        public Criteria andConTemp5IsNull() {
            addCriterion("CON_TEMP5 is null");
            return (Criteria) this;
        }

        public Criteria andConTemp5IsNotNull() {
            addCriterion("CON_TEMP5 is not null");
            return (Criteria) this;
        }

        public Criteria andConTemp5EqualTo(BigDecimal value) {
            addCriterion("CON_TEMP5 =", value, "conTemp5");
            return (Criteria) this;
        }

        public Criteria andConTemp5NotEqualTo(BigDecimal value) {
            addCriterion("CON_TEMP5 <>", value, "conTemp5");
            return (Criteria) this;
        }

        public Criteria andConTemp5GreaterThan(BigDecimal value) {
            addCriterion("CON_TEMP5 >", value, "conTemp5");
            return (Criteria) this;
        }

        public Criteria andConTemp5GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CON_TEMP5 >=", value, "conTemp5");
            return (Criteria) this;
        }

        public Criteria andConTemp5LessThan(BigDecimal value) {
            addCriterion("CON_TEMP5 <", value, "conTemp5");
            return (Criteria) this;
        }

        public Criteria andConTemp5LessThanOrEqualTo(BigDecimal value) {
            addCriterion("CON_TEMP5 <=", value, "conTemp5");
            return (Criteria) this;
        }

        public Criteria andConTemp5In(List<BigDecimal> values) {
            addCriterion("CON_TEMP5 in", values, "conTemp5");
            return (Criteria) this;
        }

        public Criteria andConTemp5NotIn(List<BigDecimal> values) {
            addCriterion("CON_TEMP5 not in", values, "conTemp5");
            return (Criteria) this;
        }

        public Criteria andConTemp5Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("CON_TEMP5 between", value1, value2, "conTemp5");
            return (Criteria) this;
        }

        public Criteria andConTemp5NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CON_TEMP5 not between", value1, value2, "conTemp5");
            return (Criteria) this;
        }

        public Criteria andConTemp6IsNull() {
            addCriterion("CON_TEMP6 is null");
            return (Criteria) this;
        }

        public Criteria andConTemp6IsNotNull() {
            addCriterion("CON_TEMP6 is not null");
            return (Criteria) this;
        }

        public Criteria andConTemp6EqualTo(BigDecimal value) {
            addCriterion("CON_TEMP6 =", value, "conTemp6");
            return (Criteria) this;
        }

        public Criteria andConTemp6NotEqualTo(BigDecimal value) {
            addCriterion("CON_TEMP6 <>", value, "conTemp6");
            return (Criteria) this;
        }

        public Criteria andConTemp6GreaterThan(BigDecimal value) {
            addCriterion("CON_TEMP6 >", value, "conTemp6");
            return (Criteria) this;
        }

        public Criteria andConTemp6GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CON_TEMP6 >=", value, "conTemp6");
            return (Criteria) this;
        }

        public Criteria andConTemp6LessThan(BigDecimal value) {
            addCriterion("CON_TEMP6 <", value, "conTemp6");
            return (Criteria) this;
        }

        public Criteria andConTemp6LessThanOrEqualTo(BigDecimal value) {
            addCriterion("CON_TEMP6 <=", value, "conTemp6");
            return (Criteria) this;
        }

        public Criteria andConTemp6In(List<BigDecimal> values) {
            addCriterion("CON_TEMP6 in", values, "conTemp6");
            return (Criteria) this;
        }

        public Criteria andConTemp6NotIn(List<BigDecimal> values) {
            addCriterion("CON_TEMP6 not in", values, "conTemp6");
            return (Criteria) this;
        }

        public Criteria andConTemp6Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("CON_TEMP6 between", value1, value2, "conTemp6");
            return (Criteria) this;
        }

        public Criteria andConTemp6NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CON_TEMP6 not between", value1, value2, "conTemp6");
            return (Criteria) this;
        }

        public Criteria andConTemp7IsNull() {
            addCriterion("CON_TEMP7 is null");
            return (Criteria) this;
        }

        public Criteria andConTemp7IsNotNull() {
            addCriterion("CON_TEMP7 is not null");
            return (Criteria) this;
        }

        public Criteria andConTemp7EqualTo(BigDecimal value) {
            addCriterion("CON_TEMP7 =", value, "conTemp7");
            return (Criteria) this;
        }

        public Criteria andConTemp7NotEqualTo(BigDecimal value) {
            addCriterion("CON_TEMP7 <>", value, "conTemp7");
            return (Criteria) this;
        }

        public Criteria andConTemp7GreaterThan(BigDecimal value) {
            addCriterion("CON_TEMP7 >", value, "conTemp7");
            return (Criteria) this;
        }

        public Criteria andConTemp7GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CON_TEMP7 >=", value, "conTemp7");
            return (Criteria) this;
        }

        public Criteria andConTemp7LessThan(BigDecimal value) {
            addCriterion("CON_TEMP7 <", value, "conTemp7");
            return (Criteria) this;
        }

        public Criteria andConTemp7LessThanOrEqualTo(BigDecimal value) {
            addCriterion("CON_TEMP7 <=", value, "conTemp7");
            return (Criteria) this;
        }

        public Criteria andConTemp7In(List<BigDecimal> values) {
            addCriterion("CON_TEMP7 in", values, "conTemp7");
            return (Criteria) this;
        }

        public Criteria andConTemp7NotIn(List<BigDecimal> values) {
            addCriterion("CON_TEMP7 not in", values, "conTemp7");
            return (Criteria) this;
        }

        public Criteria andConTemp7Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("CON_TEMP7 between", value1, value2, "conTemp7");
            return (Criteria) this;
        }

        public Criteria andConTemp7NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CON_TEMP7 not between", value1, value2, "conTemp7");
            return (Criteria) this;
        }

        public Criteria andWaterinletIsNull() {
            addCriterion("WATERINLET is null");
            return (Criteria) this;
        }

        public Criteria andWaterinletIsNotNull() {
            addCriterion("WATERINLET is not null");
            return (Criteria) this;
        }

        public Criteria andWaterinletEqualTo(BigDecimal value) {
            addCriterion("WATERINLET =", value, "waterinlet");
            return (Criteria) this;
        }

        public Criteria andWaterinletNotEqualTo(BigDecimal value) {
            addCriterion("WATERINLET <>", value, "waterinlet");
            return (Criteria) this;
        }

        public Criteria andWaterinletGreaterThan(BigDecimal value) {
            addCriterion("WATERINLET >", value, "waterinlet");
            return (Criteria) this;
        }

        public Criteria andWaterinletGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WATERINLET >=", value, "waterinlet");
            return (Criteria) this;
        }

        public Criteria andWaterinletLessThan(BigDecimal value) {
            addCriterion("WATERINLET <", value, "waterinlet");
            return (Criteria) this;
        }

        public Criteria andWaterinletLessThanOrEqualTo(BigDecimal value) {
            addCriterion("WATERINLET <=", value, "waterinlet");
            return (Criteria) this;
        }

        public Criteria andWaterinletIn(List<BigDecimal> values) {
            addCriterion("WATERINLET in", values, "waterinlet");
            return (Criteria) this;
        }

        public Criteria andWaterinletNotIn(List<BigDecimal> values) {
            addCriterion("WATERINLET not in", values, "waterinlet");
            return (Criteria) this;
        }

        public Criteria andWaterinletBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WATERINLET between", value1, value2, "waterinlet");
            return (Criteria) this;
        }

        public Criteria andWaterinletNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WATERINLET not between", value1, value2, "waterinlet");
            return (Criteria) this;
        }

        public Criteria andWateroutlet1IsNull() {
            addCriterion("WATEROUTLET1 is null");
            return (Criteria) this;
        }

        public Criteria andWateroutlet1IsNotNull() {
            addCriterion("WATEROUTLET1 is not null");
            return (Criteria) this;
        }

        public Criteria andWateroutlet1EqualTo(BigDecimal value) {
            addCriterion("WATEROUTLET1 =", value, "wateroutlet1");
            return (Criteria) this;
        }

        public Criteria andWateroutlet1NotEqualTo(BigDecimal value) {
            addCriterion("WATEROUTLET1 <>", value, "wateroutlet1");
            return (Criteria) this;
        }

        public Criteria andWateroutlet1GreaterThan(BigDecimal value) {
            addCriterion("WATEROUTLET1 >", value, "wateroutlet1");
            return (Criteria) this;
        }

        public Criteria andWateroutlet1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WATEROUTLET1 >=", value, "wateroutlet1");
            return (Criteria) this;
        }

        public Criteria andWateroutlet1LessThan(BigDecimal value) {
            addCriterion("WATEROUTLET1 <", value, "wateroutlet1");
            return (Criteria) this;
        }

        public Criteria andWateroutlet1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("WATEROUTLET1 <=", value, "wateroutlet1");
            return (Criteria) this;
        }

        public Criteria andWateroutlet1In(List<BigDecimal> values) {
            addCriterion("WATEROUTLET1 in", values, "wateroutlet1");
            return (Criteria) this;
        }

        public Criteria andWateroutlet1NotIn(List<BigDecimal> values) {
            addCriterion("WATEROUTLET1 not in", values, "wateroutlet1");
            return (Criteria) this;
        }

        public Criteria andWateroutlet1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("WATEROUTLET1 between", value1, value2, "wateroutlet1");
            return (Criteria) this;
        }

        public Criteria andWateroutlet1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WATEROUTLET1 not between", value1, value2, "wateroutlet1");
            return (Criteria) this;
        }

        public Criteria andWateroutlet2IsNull() {
            addCriterion("WATEROUTLET2 is null");
            return (Criteria) this;
        }

        public Criteria andWateroutlet2IsNotNull() {
            addCriterion("WATEROUTLET2 is not null");
            return (Criteria) this;
        }

        public Criteria andWateroutlet2EqualTo(BigDecimal value) {
            addCriterion("WATEROUTLET2 =", value, "wateroutlet2");
            return (Criteria) this;
        }

        public Criteria andWateroutlet2NotEqualTo(BigDecimal value) {
            addCriterion("WATEROUTLET2 <>", value, "wateroutlet2");
            return (Criteria) this;
        }

        public Criteria andWateroutlet2GreaterThan(BigDecimal value) {
            addCriterion("WATEROUTLET2 >", value, "wateroutlet2");
            return (Criteria) this;
        }

        public Criteria andWateroutlet2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WATEROUTLET2 >=", value, "wateroutlet2");
            return (Criteria) this;
        }

        public Criteria andWateroutlet2LessThan(BigDecimal value) {
            addCriterion("WATEROUTLET2 <", value, "wateroutlet2");
            return (Criteria) this;
        }

        public Criteria andWateroutlet2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("WATEROUTLET2 <=", value, "wateroutlet2");
            return (Criteria) this;
        }

        public Criteria andWateroutlet2In(List<BigDecimal> values) {
            addCriterion("WATEROUTLET2 in", values, "wateroutlet2");
            return (Criteria) this;
        }

        public Criteria andWateroutlet2NotIn(List<BigDecimal> values) {
            addCriterion("WATEROUTLET2 not in", values, "wateroutlet2");
            return (Criteria) this;
        }

        public Criteria andWateroutlet2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("WATEROUTLET2 between", value1, value2, "wateroutlet2");
            return (Criteria) this;
        }

        public Criteria andWateroutlet2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WATEROUTLET2 not between", value1, value2, "wateroutlet2");
            return (Criteria) this;
        }

        public Criteria andColdwaterTemp1IsNull() {
            addCriterion("COLDWATER_TEMP1 is null");
            return (Criteria) this;
        }

        public Criteria andColdwaterTemp1IsNotNull() {
            addCriterion("COLDWATER_TEMP1 is not null");
            return (Criteria) this;
        }

        public Criteria andColdwaterTemp1EqualTo(BigDecimal value) {
            addCriterion("COLDWATER_TEMP1 =", value, "coldwaterTemp1");
            return (Criteria) this;
        }

        public Criteria andColdwaterTemp1NotEqualTo(BigDecimal value) {
            addCriterion("COLDWATER_TEMP1 <>", value, "coldwaterTemp1");
            return (Criteria) this;
        }

        public Criteria andColdwaterTemp1GreaterThan(BigDecimal value) {
            addCriterion("COLDWATER_TEMP1 >", value, "coldwaterTemp1");
            return (Criteria) this;
        }

        public Criteria andColdwaterTemp1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COLDWATER_TEMP1 >=", value, "coldwaterTemp1");
            return (Criteria) this;
        }

        public Criteria andColdwaterTemp1LessThan(BigDecimal value) {
            addCriterion("COLDWATER_TEMP1 <", value, "coldwaterTemp1");
            return (Criteria) this;
        }

        public Criteria andColdwaterTemp1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("COLDWATER_TEMP1 <=", value, "coldwaterTemp1");
            return (Criteria) this;
        }

        public Criteria andColdwaterTemp1In(List<BigDecimal> values) {
            addCriterion("COLDWATER_TEMP1 in", values, "coldwaterTemp1");
            return (Criteria) this;
        }

        public Criteria andColdwaterTemp1NotIn(List<BigDecimal> values) {
            addCriterion("COLDWATER_TEMP1 not in", values, "coldwaterTemp1");
            return (Criteria) this;
        }

        public Criteria andColdwaterTemp1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("COLDWATER_TEMP1 between", value1, value2, "coldwaterTemp1");
            return (Criteria) this;
        }

        public Criteria andColdwaterTemp1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COLDWATER_TEMP1 not between", value1, value2, "coldwaterTemp1");
            return (Criteria) this;
        }

        public Criteria andColdwaterTemp2IsNull() {
            addCriterion("COLDWATER_TEMP2 is null");
            return (Criteria) this;
        }

        public Criteria andColdwaterTemp2IsNotNull() {
            addCriterion("COLDWATER_TEMP2 is not null");
            return (Criteria) this;
        }

        public Criteria andColdwaterTemp2EqualTo(BigDecimal value) {
            addCriterion("COLDWATER_TEMP2 =", value, "coldwaterTemp2");
            return (Criteria) this;
        }

        public Criteria andColdwaterTemp2NotEqualTo(BigDecimal value) {
            addCriterion("COLDWATER_TEMP2 <>", value, "coldwaterTemp2");
            return (Criteria) this;
        }

        public Criteria andColdwaterTemp2GreaterThan(BigDecimal value) {
            addCriterion("COLDWATER_TEMP2 >", value, "coldwaterTemp2");
            return (Criteria) this;
        }

        public Criteria andColdwaterTemp2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COLDWATER_TEMP2 >=", value, "coldwaterTemp2");
            return (Criteria) this;
        }

        public Criteria andColdwaterTemp2LessThan(BigDecimal value) {
            addCriterion("COLDWATER_TEMP2 <", value, "coldwaterTemp2");
            return (Criteria) this;
        }

        public Criteria andColdwaterTemp2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("COLDWATER_TEMP2 <=", value, "coldwaterTemp2");
            return (Criteria) this;
        }

        public Criteria andColdwaterTemp2In(List<BigDecimal> values) {
            addCriterion("COLDWATER_TEMP2 in", values, "coldwaterTemp2");
            return (Criteria) this;
        }

        public Criteria andColdwaterTemp2NotIn(List<BigDecimal> values) {
            addCriterion("COLDWATER_TEMP2 not in", values, "coldwaterTemp2");
            return (Criteria) this;
        }

        public Criteria andColdwaterTemp2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("COLDWATER_TEMP2 between", value1, value2, "coldwaterTemp2");
            return (Criteria) this;
        }

        public Criteria andColdwaterTemp2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COLDWATER_TEMP2 not between", value1, value2, "coldwaterTemp2");
            return (Criteria) this;
        }

        public Criteria andHotwaterTemp1IsNull() {
            addCriterion("HOTWATER_TEMP1 is null");
            return (Criteria) this;
        }

        public Criteria andHotwaterTemp1IsNotNull() {
            addCriterion("HOTWATER_TEMP1 is not null");
            return (Criteria) this;
        }

        public Criteria andHotwaterTemp1EqualTo(BigDecimal value) {
            addCriterion("HOTWATER_TEMP1 =", value, "hotwaterTemp1");
            return (Criteria) this;
        }

        public Criteria andHotwaterTemp1NotEqualTo(BigDecimal value) {
            addCriterion("HOTWATER_TEMP1 <>", value, "hotwaterTemp1");
            return (Criteria) this;
        }

        public Criteria andHotwaterTemp1GreaterThan(BigDecimal value) {
            addCriterion("HOTWATER_TEMP1 >", value, "hotwaterTemp1");
            return (Criteria) this;
        }

        public Criteria andHotwaterTemp1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HOTWATER_TEMP1 >=", value, "hotwaterTemp1");
            return (Criteria) this;
        }

        public Criteria andHotwaterTemp1LessThan(BigDecimal value) {
            addCriterion("HOTWATER_TEMP1 <", value, "hotwaterTemp1");
            return (Criteria) this;
        }

        public Criteria andHotwaterTemp1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("HOTWATER_TEMP1 <=", value, "hotwaterTemp1");
            return (Criteria) this;
        }

        public Criteria andHotwaterTemp1In(List<BigDecimal> values) {
            addCriterion("HOTWATER_TEMP1 in", values, "hotwaterTemp1");
            return (Criteria) this;
        }

        public Criteria andHotwaterTemp1NotIn(List<BigDecimal> values) {
            addCriterion("HOTWATER_TEMP1 not in", values, "hotwaterTemp1");
            return (Criteria) this;
        }

        public Criteria andHotwaterTemp1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("HOTWATER_TEMP1 between", value1, value2, "hotwaterTemp1");
            return (Criteria) this;
        }

        public Criteria andHotwaterTemp1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HOTWATER_TEMP1 not between", value1, value2, "hotwaterTemp1");
            return (Criteria) this;
        }

        public Criteria andHotwaterTemp2IsNull() {
            addCriterion("HOTWATER_TEMP2 is null");
            return (Criteria) this;
        }

        public Criteria andHotwaterTemp2IsNotNull() {
            addCriterion("HOTWATER_TEMP2 is not null");
            return (Criteria) this;
        }

        public Criteria andHotwaterTemp2EqualTo(BigDecimal value) {
            addCriterion("HOTWATER_TEMP2 =", value, "hotwaterTemp2");
            return (Criteria) this;
        }

        public Criteria andHotwaterTemp2NotEqualTo(BigDecimal value) {
            addCriterion("HOTWATER_TEMP2 <>", value, "hotwaterTemp2");
            return (Criteria) this;
        }

        public Criteria andHotwaterTemp2GreaterThan(BigDecimal value) {
            addCriterion("HOTWATER_TEMP2 >", value, "hotwaterTemp2");
            return (Criteria) this;
        }

        public Criteria andHotwaterTemp2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HOTWATER_TEMP2 >=", value, "hotwaterTemp2");
            return (Criteria) this;
        }

        public Criteria andHotwaterTemp2LessThan(BigDecimal value) {
            addCriterion("HOTWATER_TEMP2 <", value, "hotwaterTemp2");
            return (Criteria) this;
        }

        public Criteria andHotwaterTemp2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("HOTWATER_TEMP2 <=", value, "hotwaterTemp2");
            return (Criteria) this;
        }

        public Criteria andHotwaterTemp2In(List<BigDecimal> values) {
            addCriterion("HOTWATER_TEMP2 in", values, "hotwaterTemp2");
            return (Criteria) this;
        }

        public Criteria andHotwaterTemp2NotIn(List<BigDecimal> values) {
            addCriterion("HOTWATER_TEMP2 not in", values, "hotwaterTemp2");
            return (Criteria) this;
        }

        public Criteria andHotwaterTemp2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("HOTWATER_TEMP2 between", value1, value2, "hotwaterTemp2");
            return (Criteria) this;
        }

        public Criteria andHotwaterTemp2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HOTWATER_TEMP2 not between", value1, value2, "hotwaterTemp2");
            return (Criteria) this;
        }

        public Criteria andEtIsNull() {
            addCriterion("ET is null");
            return (Criteria) this;
        }

        public Criteria andEtIsNotNull() {
            addCriterion("ET is not null");
            return (Criteria) this;
        }

        public Criteria andEtEqualTo(BigDecimal value) {
            addCriterion("ET =", value, "et");
            return (Criteria) this;
        }

        public Criteria andEtNotEqualTo(BigDecimal value) {
            addCriterion("ET <>", value, "et");
            return (Criteria) this;
        }

        public Criteria andEtGreaterThan(BigDecimal value) {
            addCriterion("ET >", value, "et");
            return (Criteria) this;
        }

        public Criteria andEtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ET >=", value, "et");
            return (Criteria) this;
        }

        public Criteria andEtLessThan(BigDecimal value) {
            addCriterion("ET <", value, "et");
            return (Criteria) this;
        }

        public Criteria andEtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ET <=", value, "et");
            return (Criteria) this;
        }

        public Criteria andEtIn(List<BigDecimal> values) {
            addCriterion("ET in", values, "et");
            return (Criteria) this;
        }

        public Criteria andEtNotIn(List<BigDecimal> values) {
            addCriterion("ET not in", values, "et");
            return (Criteria) this;
        }

        public Criteria andEtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ET between", value1, value2, "et");
            return (Criteria) this;
        }

        public Criteria andEtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ET not between", value1, value2, "et");
            return (Criteria) this;
        }

        public Criteria andFlowIsNull() {
            addCriterion("FLOW is null");
            return (Criteria) this;
        }

        public Criteria andFlowIsNotNull() {
            addCriterion("FLOW is not null");
            return (Criteria) this;
        }

        public Criteria andFlowEqualTo(BigDecimal value) {
            addCriterion("FLOW =", value, "flow");
            return (Criteria) this;
        }

        public Criteria andFlowNotEqualTo(BigDecimal value) {
            addCriterion("FLOW <>", value, "flow");
            return (Criteria) this;
        }

        public Criteria andFlowGreaterThan(BigDecimal value) {
            addCriterion("FLOW >", value, "flow");
            return (Criteria) this;
        }

        public Criteria andFlowGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FLOW >=", value, "flow");
            return (Criteria) this;
        }

        public Criteria andFlowLessThan(BigDecimal value) {
            addCriterion("FLOW <", value, "flow");
            return (Criteria) this;
        }

        public Criteria andFlowLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FLOW <=", value, "flow");
            return (Criteria) this;
        }

        public Criteria andFlowIn(List<BigDecimal> values) {
            addCriterion("FLOW in", values, "flow");
            return (Criteria) this;
        }

        public Criteria andFlowNotIn(List<BigDecimal> values) {
            addCriterion("FLOW not in", values, "flow");
            return (Criteria) this;
        }

        public Criteria andFlowBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FLOW between", value1, value2, "flow");
            return (Criteria) this;
        }

        public Criteria andFlowNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FLOW not between", value1, value2, "flow");
            return (Criteria) this;
        }

        public Criteria andGuidIsNull() {
            addCriterion("GUID is null");
            return (Criteria) this;
        }

        public Criteria andGuidIsNotNull() {
            addCriterion("GUID is not null");
            return (Criteria) this;
        }

        public Criteria andGuidEqualTo(String value) {
            addCriterion("GUID =", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidNotEqualTo(String value) {
            addCriterion("GUID <>", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidGreaterThan(String value) {
            addCriterion("GUID >", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidGreaterThanOrEqualTo(String value) {
            addCriterion("GUID >=", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidLessThan(String value) {
            addCriterion("GUID <", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidLessThanOrEqualTo(String value) {
            addCriterion("GUID <=", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidLike(String value) {
            addCriterion("GUID like", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidNotLike(String value) {
            addCriterion("GUID not like", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidIn(List<String> values) {
            addCriterion("GUID in", values, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidNotIn(List<String> values) {
            addCriterion("GUID not in", values, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidBetween(String value1, String value2) {
            addCriterion("GUID between", value1, value2, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidNotBetween(String value1, String value2) {
            addCriterion("GUID not between", value1, value2, "guid");
            return (Criteria) this;
        }

        public Criteria andCastingstateIsNull() {
            addCriterion("CASTINGSTATE is null");
            return (Criteria) this;
        }

        public Criteria andCastingstateIsNotNull() {
            addCriterion("CASTINGSTATE is not null");
            return (Criteria) this;
        }

        public Criteria andCastingstateEqualTo(String value) {
            addCriterion("CASTINGSTATE =", value, "castingstate");
            return (Criteria) this;
        }

        public Criteria andCastingstateNotEqualTo(String value) {
            addCriterion("CASTINGSTATE <>", value, "castingstate");
            return (Criteria) this;
        }

        public Criteria andCastingstateGreaterThan(String value) {
            addCriterion("CASTINGSTATE >", value, "castingstate");
            return (Criteria) this;
        }

        public Criteria andCastingstateGreaterThanOrEqualTo(String value) {
            addCriterion("CASTINGSTATE >=", value, "castingstate");
            return (Criteria) this;
        }

        public Criteria andCastingstateLessThan(String value) {
            addCriterion("CASTINGSTATE <", value, "castingstate");
            return (Criteria) this;
        }

        public Criteria andCastingstateLessThanOrEqualTo(String value) {
            addCriterion("CASTINGSTATE <=", value, "castingstate");
            return (Criteria) this;
        }

        public Criteria andCastingstateLike(String value) {
            addCriterion("CASTINGSTATE like", value, "castingstate");
            return (Criteria) this;
        }

        public Criteria andCastingstateNotLike(String value) {
            addCriterion("CASTINGSTATE not like", value, "castingstate");
            return (Criteria) this;
        }

        public Criteria andCastingstateIn(List<String> values) {
            addCriterion("CASTINGSTATE in", values, "castingstate");
            return (Criteria) this;
        }

        public Criteria andCastingstateNotIn(List<String> values) {
            addCriterion("CASTINGSTATE not in", values, "castingstate");
            return (Criteria) this;
        }

        public Criteria andCastingstateBetween(String value1, String value2) {
            addCriterion("CASTINGSTATE between", value1, value2, "castingstate");
            return (Criteria) this;
        }

        public Criteria andCastingstateNotBetween(String value1, String value2) {
            addCriterion("CASTINGSTATE not between", value1, value2, "castingstate");
            return (Criteria) this;
        }

        public Criteria andCtstatusIsNull() {
            addCriterion("CTSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andCtstatusIsNotNull() {
            addCriterion("CTSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andCtstatusEqualTo(String value) {
            addCriterion("CTSTATUS =", value, "ctstatus");
            return (Criteria) this;
        }

        public Criteria andCtstatusNotEqualTo(String value) {
            addCriterion("CTSTATUS <>", value, "ctstatus");
            return (Criteria) this;
        }

        public Criteria andCtstatusGreaterThan(String value) {
            addCriterion("CTSTATUS >", value, "ctstatus");
            return (Criteria) this;
        }

        public Criteria andCtstatusGreaterThanOrEqualTo(String value) {
            addCriterion("CTSTATUS >=", value, "ctstatus");
            return (Criteria) this;
        }

        public Criteria andCtstatusLessThan(String value) {
            addCriterion("CTSTATUS <", value, "ctstatus");
            return (Criteria) this;
        }

        public Criteria andCtstatusLessThanOrEqualTo(String value) {
            addCriterion("CTSTATUS <=", value, "ctstatus");
            return (Criteria) this;
        }

        public Criteria andCtstatusLike(String value) {
            addCriterion("CTSTATUS like", value, "ctstatus");
            return (Criteria) this;
        }

        public Criteria andCtstatusNotLike(String value) {
            addCriterion("CTSTATUS not like", value, "ctstatus");
            return (Criteria) this;
        }

        public Criteria andCtstatusIn(List<String> values) {
            addCriterion("CTSTATUS in", values, "ctstatus");
            return (Criteria) this;
        }

        public Criteria andCtstatusNotIn(List<String> values) {
            addCriterion("CTSTATUS not in", values, "ctstatus");
            return (Criteria) this;
        }

        public Criteria andCtstatusBetween(String value1, String value2) {
            addCriterion("CTSTATUS between", value1, value2, "ctstatus");
            return (Criteria) this;
        }

        public Criteria andCtstatusNotBetween(String value1, String value2) {
            addCriterion("CTSTATUS not between", value1, value2, "ctstatus");
            return (Criteria) this;
        }

        public Criteria andJwslIsNull() {
            addCriterion("JWSL is null");
            return (Criteria) this;
        }

        public Criteria andJwslIsNotNull() {
            addCriterion("JWSL is not null");
            return (Criteria) this;
        }

        public Criteria andJwslEqualTo(BigDecimal value) {
            addCriterion("JWSL =", value, "jwsl");
            return (Criteria) this;
        }

        public Criteria andJwslNotEqualTo(BigDecimal value) {
            addCriterion("JWSL <>", value, "jwsl");
            return (Criteria) this;
        }

        public Criteria andJwslGreaterThan(BigDecimal value) {
            addCriterion("JWSL >", value, "jwsl");
            return (Criteria) this;
        }

        public Criteria andJwslGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("JWSL >=", value, "jwsl");
            return (Criteria) this;
        }

        public Criteria andJwslLessThan(BigDecimal value) {
            addCriterion("JWSL <", value, "jwsl");
            return (Criteria) this;
        }

        public Criteria andJwslLessThanOrEqualTo(BigDecimal value) {
            addCriterion("JWSL <=", value, "jwsl");
            return (Criteria) this;
        }

        public Criteria andJwslIn(List<BigDecimal> values) {
            addCriterion("JWSL in", values, "jwsl");
            return (Criteria) this;
        }

        public Criteria andJwslNotIn(List<BigDecimal> values) {
            addCriterion("JWSL not in", values, "jwsl");
            return (Criteria) this;
        }

        public Criteria andJwslBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JWSL between", value1, value2, "jwsl");
            return (Criteria) this;
        }

        public Criteria andJwslNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JWSL not between", value1, value2, "jwsl");
            return (Criteria) this;
        }

        public Criteria andJwslbIsNull() {
            addCriterion("JWSLB is null");
            return (Criteria) this;
        }

        public Criteria andJwslbIsNotNull() {
            addCriterion("JWSLB is not null");
            return (Criteria) this;
        }

        public Criteria andJwslbEqualTo(String value) {
            addCriterion("JWSLB =", value, "jwslb");
            return (Criteria) this;
        }

        public Criteria andJwslbNotEqualTo(String value) {
            addCriterion("JWSLB <>", value, "jwslb");
            return (Criteria) this;
        }

        public Criteria andJwslbGreaterThan(String value) {
            addCriterion("JWSLB >", value, "jwslb");
            return (Criteria) this;
        }

        public Criteria andJwslbGreaterThanOrEqualTo(String value) {
            addCriterion("JWSLB >=", value, "jwslb");
            return (Criteria) this;
        }

        public Criteria andJwslbLessThan(String value) {
            addCriterion("JWSLB <", value, "jwslb");
            return (Criteria) this;
        }

        public Criteria andJwslbLessThanOrEqualTo(String value) {
            addCriterion("JWSLB <=", value, "jwslb");
            return (Criteria) this;
        }

        public Criteria andJwslbLike(String value) {
            addCriterion("JWSLB like", value, "jwslb");
            return (Criteria) this;
        }

        public Criteria andJwslbNotLike(String value) {
            addCriterion("JWSLB not like", value, "jwslb");
            return (Criteria) this;
        }

        public Criteria andJwslbIn(List<String> values) {
            addCriterion("JWSLB in", values, "jwslb");
            return (Criteria) this;
        }

        public Criteria andJwslbNotIn(List<String> values) {
            addCriterion("JWSLB not in", values, "jwslb");
            return (Criteria) this;
        }

        public Criteria andJwslbBetween(String value1, String value2) {
            addCriterion("JWSLB between", value1, value2, "jwslb");
            return (Criteria) this;
        }

        public Criteria andJwslbNotBetween(String value1, String value2) {
            addCriterion("JWSLB not between", value1, value2, "jwslb");
            return (Criteria) this;
        }

        public Criteria andSwwsIsNull() {
            addCriterion("SWWS is null");
            return (Criteria) this;
        }

        public Criteria andSwwsIsNotNull() {
            addCriterion("SWWS is not null");
            return (Criteria) this;
        }

        public Criteria andSwwsEqualTo(BigDecimal value) {
            addCriterion("SWWS =", value, "swws");
            return (Criteria) this;
        }

        public Criteria andSwwsNotEqualTo(BigDecimal value) {
            addCriterion("SWWS <>", value, "swws");
            return (Criteria) this;
        }

        public Criteria andSwwsGreaterThan(BigDecimal value) {
            addCriterion("SWWS >", value, "swws");
            return (Criteria) this;
        }

        public Criteria andSwwsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SWWS >=", value, "swws");
            return (Criteria) this;
        }

        public Criteria andSwwsLessThan(BigDecimal value) {
            addCriterion("SWWS <", value, "swws");
            return (Criteria) this;
        }

        public Criteria andSwwsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SWWS <=", value, "swws");
            return (Criteria) this;
        }

        public Criteria andSwwsIn(List<BigDecimal> values) {
            addCriterion("SWWS in", values, "swws");
            return (Criteria) this;
        }

        public Criteria andSwwsNotIn(List<BigDecimal> values) {
            addCriterion("SWWS not in", values, "swws");
            return (Criteria) this;
        }

        public Criteria andSwwsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SWWS between", value1, value2, "swws");
            return (Criteria) this;
        }

        public Criteria andSwwsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SWWS not between", value1, value2, "swws");
            return (Criteria) this;
        }

        public Criteria andSwwsbIsNull() {
            addCriterion("SWWSB is null");
            return (Criteria) this;
        }

        public Criteria andSwwsbIsNotNull() {
            addCriterion("SWWSB is not null");
            return (Criteria) this;
        }

        public Criteria andSwwsbEqualTo(String value) {
            addCriterion("SWWSB =", value, "swwsb");
            return (Criteria) this;
        }

        public Criteria andSwwsbNotEqualTo(String value) {
            addCriterion("SWWSB <>", value, "swwsb");
            return (Criteria) this;
        }

        public Criteria andSwwsbGreaterThan(String value) {
            addCriterion("SWWSB >", value, "swwsb");
            return (Criteria) this;
        }

        public Criteria andSwwsbGreaterThanOrEqualTo(String value) {
            addCriterion("SWWSB >=", value, "swwsb");
            return (Criteria) this;
        }

        public Criteria andSwwsbLessThan(String value) {
            addCriterion("SWWSB <", value, "swwsb");
            return (Criteria) this;
        }

        public Criteria andSwwsbLessThanOrEqualTo(String value) {
            addCriterion("SWWSB <=", value, "swwsb");
            return (Criteria) this;
        }

        public Criteria andSwwsbLike(String value) {
            addCriterion("SWWSB like", value, "swwsb");
            return (Criteria) this;
        }

        public Criteria andSwwsbNotLike(String value) {
            addCriterion("SWWSB not like", value, "swwsb");
            return (Criteria) this;
        }

        public Criteria andSwwsbIn(List<String> values) {
            addCriterion("SWWSB in", values, "swwsb");
            return (Criteria) this;
        }

        public Criteria andSwwsbNotIn(List<String> values) {
            addCriterion("SWWSB not in", values, "swwsb");
            return (Criteria) this;
        }

        public Criteria andSwwsbBetween(String value1, String value2) {
            addCriterion("SWWSB between", value1, value2, "swwsb");
            return (Criteria) this;
        }

        public Criteria andSwwsbNotBetween(String value1, String value2) {
            addCriterion("SWWSB not between", value1, value2, "swwsb");
            return (Criteria) this;
        }

        public Criteria andCjwcIsNull() {
            addCriterion("CJWC is null");
            return (Criteria) this;
        }

        public Criteria andCjwcIsNotNull() {
            addCriterion("CJWC is not null");
            return (Criteria) this;
        }

        public Criteria andCjwcEqualTo(BigDecimal value) {
            addCriterion("CJWC =", value, "cjwc");
            return (Criteria) this;
        }

        public Criteria andCjwcNotEqualTo(BigDecimal value) {
            addCriterion("CJWC <>", value, "cjwc");
            return (Criteria) this;
        }

        public Criteria andCjwcGreaterThan(BigDecimal value) {
            addCriterion("CJWC >", value, "cjwc");
            return (Criteria) this;
        }

        public Criteria andCjwcGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CJWC >=", value, "cjwc");
            return (Criteria) this;
        }

        public Criteria andCjwcLessThan(BigDecimal value) {
            addCriterion("CJWC <", value, "cjwc");
            return (Criteria) this;
        }

        public Criteria andCjwcLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CJWC <=", value, "cjwc");
            return (Criteria) this;
        }

        public Criteria andCjwcIn(List<BigDecimal> values) {
            addCriterion("CJWC in", values, "cjwc");
            return (Criteria) this;
        }

        public Criteria andCjwcNotIn(List<BigDecimal> values) {
            addCriterion("CJWC not in", values, "cjwc");
            return (Criteria) this;
        }

        public Criteria andCjwcBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CJWC between", value1, value2, "cjwc");
            return (Criteria) this;
        }

        public Criteria andCjwcNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CJWC not between", value1, value2, "cjwc");
            return (Criteria) this;
        }

        public Criteria andCjwcbIsNull() {
            addCriterion("CJWCB is null");
            return (Criteria) this;
        }

        public Criteria andCjwcbIsNotNull() {
            addCriterion("CJWCB is not null");
            return (Criteria) this;
        }

        public Criteria andCjwcbEqualTo(String value) {
            addCriterion("CJWCB =", value, "cjwcb");
            return (Criteria) this;
        }

        public Criteria andCjwcbNotEqualTo(String value) {
            addCriterion("CJWCB <>", value, "cjwcb");
            return (Criteria) this;
        }

        public Criteria andCjwcbGreaterThan(String value) {
            addCriterion("CJWCB >", value, "cjwcb");
            return (Criteria) this;
        }

        public Criteria andCjwcbGreaterThanOrEqualTo(String value) {
            addCriterion("CJWCB >=", value, "cjwcb");
            return (Criteria) this;
        }

        public Criteria andCjwcbLessThan(String value) {
            addCriterion("CJWCB <", value, "cjwcb");
            return (Criteria) this;
        }

        public Criteria andCjwcbLessThanOrEqualTo(String value) {
            addCriterion("CJWCB <=", value, "cjwcb");
            return (Criteria) this;
        }

        public Criteria andCjwcbLike(String value) {
            addCriterion("CJWCB like", value, "cjwcb");
            return (Criteria) this;
        }

        public Criteria andCjwcbNotLike(String value) {
            addCriterion("CJWCB not like", value, "cjwcb");
            return (Criteria) this;
        }

        public Criteria andCjwcbIn(List<String> values) {
            addCriterion("CJWCB in", values, "cjwcb");
            return (Criteria) this;
        }

        public Criteria andCjwcbNotIn(List<String> values) {
            addCriterion("CJWCB not in", values, "cjwcb");
            return (Criteria) this;
        }

        public Criteria andCjwcbBetween(String value1, String value2) {
            addCriterion("CJWCB between", value1, value2, "cjwcb");
            return (Criteria) this;
        }

        public Criteria andCjwcbNotBetween(String value1, String value2) {
            addCriterion("CJWCB not between", value1, value2, "cjwcb");
            return (Criteria) this;
        }

        public Criteria andLbwcIsNull() {
            addCriterion("LBWC is null");
            return (Criteria) this;
        }

        public Criteria andLbwcIsNotNull() {
            addCriterion("LBWC is not null");
            return (Criteria) this;
        }

        public Criteria andLbwcEqualTo(BigDecimal value) {
            addCriterion("LBWC =", value, "lbwc");
            return (Criteria) this;
        }

        public Criteria andLbwcNotEqualTo(BigDecimal value) {
            addCriterion("LBWC <>", value, "lbwc");
            return (Criteria) this;
        }

        public Criteria andLbwcGreaterThan(BigDecimal value) {
            addCriterion("LBWC >", value, "lbwc");
            return (Criteria) this;
        }

        public Criteria andLbwcGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LBWC >=", value, "lbwc");
            return (Criteria) this;
        }

        public Criteria andLbwcLessThan(BigDecimal value) {
            addCriterion("LBWC <", value, "lbwc");
            return (Criteria) this;
        }

        public Criteria andLbwcLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LBWC <=", value, "lbwc");
            return (Criteria) this;
        }

        public Criteria andLbwcIn(List<BigDecimal> values) {
            addCriterion("LBWC in", values, "lbwc");
            return (Criteria) this;
        }

        public Criteria andLbwcNotIn(List<BigDecimal> values) {
            addCriterion("LBWC not in", values, "lbwc");
            return (Criteria) this;
        }

        public Criteria andLbwcBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LBWC between", value1, value2, "lbwc");
            return (Criteria) this;
        }

        public Criteria andLbwcNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LBWC not between", value1, value2, "lbwc");
            return (Criteria) this;
        }

        public Criteria andLbwcbIsNull() {
            addCriterion("LBWCB is null");
            return (Criteria) this;
        }

        public Criteria andLbwcbIsNotNull() {
            addCriterion("LBWCB is not null");
            return (Criteria) this;
        }

        public Criteria andLbwcbEqualTo(String value) {
            addCriterion("LBWCB =", value, "lbwcb");
            return (Criteria) this;
        }

        public Criteria andLbwcbNotEqualTo(String value) {
            addCriterion("LBWCB <>", value, "lbwcb");
            return (Criteria) this;
        }

        public Criteria andLbwcbGreaterThan(String value) {
            addCriterion("LBWCB >", value, "lbwcb");
            return (Criteria) this;
        }

        public Criteria andLbwcbGreaterThanOrEqualTo(String value) {
            addCriterion("LBWCB >=", value, "lbwcb");
            return (Criteria) this;
        }

        public Criteria andLbwcbLessThan(String value) {
            addCriterion("LBWCB <", value, "lbwcb");
            return (Criteria) this;
        }

        public Criteria andLbwcbLessThanOrEqualTo(String value) {
            addCriterion("LBWCB <=", value, "lbwcb");
            return (Criteria) this;
        }

        public Criteria andLbwcbLike(String value) {
            addCriterion("LBWCB like", value, "lbwcb");
            return (Criteria) this;
        }

        public Criteria andLbwcbNotLike(String value) {
            addCriterion("LBWCB not like", value, "lbwcb");
            return (Criteria) this;
        }

        public Criteria andLbwcbIn(List<String> values) {
            addCriterion("LBWCB in", values, "lbwcb");
            return (Criteria) this;
        }

        public Criteria andLbwcbNotIn(List<String> values) {
            addCriterion("LBWCB not in", values, "lbwcb");
            return (Criteria) this;
        }

        public Criteria andLbwcbBetween(String value1, String value2) {
            addCriterion("LBWCB between", value1, value2, "lbwcb");
            return (Criteria) this;
        }

        public Criteria andLbwcbNotBetween(String value1, String value2) {
            addCriterion("LBWCB not between", value1, value2, "lbwcb");
            return (Criteria) this;
        }

        public Criteria andCtmaxIsNull() {
            addCriterion("CTMAX is null");
            return (Criteria) this;
        }

        public Criteria andCtmaxIsNotNull() {
            addCriterion("CTMAX is not null");
            return (Criteria) this;
        }

        public Criteria andCtmaxEqualTo(BigDecimal value) {
            addCriterion("CTMAX =", value, "ctmax");
            return (Criteria) this;
        }

        public Criteria andCtmaxNotEqualTo(BigDecimal value) {
            addCriterion("CTMAX <>", value, "ctmax");
            return (Criteria) this;
        }

        public Criteria andCtmaxGreaterThan(BigDecimal value) {
            addCriterion("CTMAX >", value, "ctmax");
            return (Criteria) this;
        }

        public Criteria andCtmaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CTMAX >=", value, "ctmax");
            return (Criteria) this;
        }

        public Criteria andCtmaxLessThan(BigDecimal value) {
            addCriterion("CTMAX <", value, "ctmax");
            return (Criteria) this;
        }

        public Criteria andCtmaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CTMAX <=", value, "ctmax");
            return (Criteria) this;
        }

        public Criteria andCtmaxIn(List<BigDecimal> values) {
            addCriterion("CTMAX in", values, "ctmax");
            return (Criteria) this;
        }

        public Criteria andCtmaxNotIn(List<BigDecimal> values) {
            addCriterion("CTMAX not in", values, "ctmax");
            return (Criteria) this;
        }

        public Criteria andCtmaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CTMAX between", value1, value2, "ctmax");
            return (Criteria) this;
        }

        public Criteria andCtmaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CTMAX not between", value1, value2, "ctmax");
            return (Criteria) this;
        }

        public Criteria andCtmaxbIsNull() {
            addCriterion("CTMAXB is null");
            return (Criteria) this;
        }

        public Criteria andCtmaxbIsNotNull() {
            addCriterion("CTMAXB is not null");
            return (Criteria) this;
        }

        public Criteria andCtmaxbEqualTo(String value) {
            addCriterion("CTMAXB =", value, "ctmaxb");
            return (Criteria) this;
        }

        public Criteria andCtmaxbNotEqualTo(String value) {
            addCriterion("CTMAXB <>", value, "ctmaxb");
            return (Criteria) this;
        }

        public Criteria andCtmaxbGreaterThan(String value) {
            addCriterion("CTMAXB >", value, "ctmaxb");
            return (Criteria) this;
        }

        public Criteria andCtmaxbGreaterThanOrEqualTo(String value) {
            addCriterion("CTMAXB >=", value, "ctmaxb");
            return (Criteria) this;
        }

        public Criteria andCtmaxbLessThan(String value) {
            addCriterion("CTMAXB <", value, "ctmaxb");
            return (Criteria) this;
        }

        public Criteria andCtmaxbLessThanOrEqualTo(String value) {
            addCriterion("CTMAXB <=", value, "ctmaxb");
            return (Criteria) this;
        }

        public Criteria andCtmaxbLike(String value) {
            addCriterion("CTMAXB like", value, "ctmaxb");
            return (Criteria) this;
        }

        public Criteria andCtmaxbNotLike(String value) {
            addCriterion("CTMAXB not like", value, "ctmaxb");
            return (Criteria) this;
        }

        public Criteria andCtmaxbIn(List<String> values) {
            addCriterion("CTMAXB in", values, "ctmaxb");
            return (Criteria) this;
        }

        public Criteria andCtmaxbNotIn(List<String> values) {
            addCriterion("CTMAXB not in", values, "ctmaxb");
            return (Criteria) this;
        }

        public Criteria andCtmaxbBetween(String value1, String value2) {
            addCriterion("CTMAXB between", value1, value2, "ctmaxb");
            return (Criteria) this;
        }

        public Criteria andCtmaxbNotBetween(String value1, String value2) {
            addCriterion("CTMAXB not between", value1, value2, "ctmaxb");
            return (Criteria) this;
        }

        public Criteria andInttCtmaxIsNull() {
            addCriterion("INTT_CTMAX is null");
            return (Criteria) this;
        }

        public Criteria andInttCtmaxIsNotNull() {
            addCriterion("INTT_CTMAX is not null");
            return (Criteria) this;
        }

        public Criteria andInttCtmaxEqualTo(BigDecimal value) {
            addCriterion("INTT_CTMAX =", value, "inttCtmax");
            return (Criteria) this;
        }

        public Criteria andInttCtmaxNotEqualTo(BigDecimal value) {
            addCriterion("INTT_CTMAX <>", value, "inttCtmax");
            return (Criteria) this;
        }

        public Criteria andInttCtmaxGreaterThan(BigDecimal value) {
            addCriterion("INTT_CTMAX >", value, "inttCtmax");
            return (Criteria) this;
        }

        public Criteria andInttCtmaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INTT_CTMAX >=", value, "inttCtmax");
            return (Criteria) this;
        }

        public Criteria andInttCtmaxLessThan(BigDecimal value) {
            addCriterion("INTT_CTMAX <", value, "inttCtmax");
            return (Criteria) this;
        }

        public Criteria andInttCtmaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INTT_CTMAX <=", value, "inttCtmax");
            return (Criteria) this;
        }

        public Criteria andInttCtmaxIn(List<BigDecimal> values) {
            addCriterion("INTT_CTMAX in", values, "inttCtmax");
            return (Criteria) this;
        }

        public Criteria andInttCtmaxNotIn(List<BigDecimal> values) {
            addCriterion("INTT_CTMAX not in", values, "inttCtmax");
            return (Criteria) this;
        }

        public Criteria andInttCtmaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INTT_CTMAX between", value1, value2, "inttCtmax");
            return (Criteria) this;
        }

        public Criteria andInttCtmaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INTT_CTMAX not between", value1, value2, "inttCtmax");
            return (Criteria) this;
        }

        public Criteria andInttCtmaxbIsNull() {
            addCriterion("INTT_CTMAXB is null");
            return (Criteria) this;
        }

        public Criteria andInttCtmaxbIsNotNull() {
            addCriterion("INTT_CTMAXB is not null");
            return (Criteria) this;
        }

        public Criteria andInttCtmaxbEqualTo(String value) {
            addCriterion("INTT_CTMAXB =", value, "inttCtmaxb");
            return (Criteria) this;
        }

        public Criteria andInttCtmaxbNotEqualTo(String value) {
            addCriterion("INTT_CTMAXB <>", value, "inttCtmaxb");
            return (Criteria) this;
        }

        public Criteria andInttCtmaxbGreaterThan(String value) {
            addCriterion("INTT_CTMAXB >", value, "inttCtmaxb");
            return (Criteria) this;
        }

        public Criteria andInttCtmaxbGreaterThanOrEqualTo(String value) {
            addCriterion("INTT_CTMAXB >=", value, "inttCtmaxb");
            return (Criteria) this;
        }

        public Criteria andInttCtmaxbLessThan(String value) {
            addCriterion("INTT_CTMAXB <", value, "inttCtmaxb");
            return (Criteria) this;
        }

        public Criteria andInttCtmaxbLessThanOrEqualTo(String value) {
            addCriterion("INTT_CTMAXB <=", value, "inttCtmaxb");
            return (Criteria) this;
        }

        public Criteria andInttCtmaxbLike(String value) {
            addCriterion("INTT_CTMAXB like", value, "inttCtmaxb");
            return (Criteria) this;
        }

        public Criteria andInttCtmaxbNotLike(String value) {
            addCriterion("INTT_CTMAXB not like", value, "inttCtmaxb");
            return (Criteria) this;
        }

        public Criteria andInttCtmaxbIn(List<String> values) {
            addCriterion("INTT_CTMAXB in", values, "inttCtmaxb");
            return (Criteria) this;
        }

        public Criteria andInttCtmaxbNotIn(List<String> values) {
            addCriterion("INTT_CTMAXB not in", values, "inttCtmaxb");
            return (Criteria) this;
        }

        public Criteria andInttCtmaxbBetween(String value1, String value2) {
            addCriterion("INTT_CTMAXB between", value1, value2, "inttCtmaxb");
            return (Criteria) this;
        }

        public Criteria andInttCtmaxbNotBetween(String value1, String value2) {
            addCriterion("INTT_CTMAXB not between", value1, value2, "inttCtmaxb");
            return (Criteria) this;
        }

        public Criteria andPartsIsNull() {
            addCriterion("PARTS is null");
            return (Criteria) this;
        }

        public Criteria andPartsIsNotNull() {
            addCriterion("PARTS is not null");
            return (Criteria) this;
        }

        public Criteria andPartsEqualTo(String value) {
            addCriterion("PARTS =", value, "parts");
            return (Criteria) this;
        }

        public Criteria andPartsNotEqualTo(String value) {
            addCriterion("PARTS <>", value, "parts");
            return (Criteria) this;
        }

        public Criteria andPartsGreaterThan(String value) {
            addCriterion("PARTS >", value, "parts");
            return (Criteria) this;
        }

        public Criteria andPartsGreaterThanOrEqualTo(String value) {
            addCriterion("PARTS >=", value, "parts");
            return (Criteria) this;
        }

        public Criteria andPartsLessThan(String value) {
            addCriterion("PARTS <", value, "parts");
            return (Criteria) this;
        }

        public Criteria andPartsLessThanOrEqualTo(String value) {
            addCriterion("PARTS <=", value, "parts");
            return (Criteria) this;
        }

        public Criteria andPartsLike(String value) {
            addCriterion("PARTS like", value, "parts");
            return (Criteria) this;
        }

        public Criteria andPartsNotLike(String value) {
            addCriterion("PARTS not like", value, "parts");
            return (Criteria) this;
        }

        public Criteria andPartsIn(List<String> values) {
            addCriterion("PARTS in", values, "parts");
            return (Criteria) this;
        }

        public Criteria andPartsNotIn(List<String> values) {
            addCriterion("PARTS not in", values, "parts");
            return (Criteria) this;
        }

        public Criteria andPartsBetween(String value1, String value2) {
            addCriterion("PARTS between", value1, value2, "parts");
            return (Criteria) this;
        }

        public Criteria andPartsNotBetween(String value1, String value2) {
            addCriterion("PARTS not between", value1, value2, "parts");
            return (Criteria) this;
        }

        public Criteria andTempccIsNull() {
            addCriterion("TEMPCC is null");
            return (Criteria) this;
        }

        public Criteria andTempccIsNotNull() {
            addCriterion("TEMPCC is not null");
            return (Criteria) this;
        }

        public Criteria andTempccEqualTo(BigDecimal value) {
            addCriterion("TEMPCC =", value, "tempcc");
            return (Criteria) this;
        }

        public Criteria andTempccNotEqualTo(BigDecimal value) {
            addCriterion("TEMPCC <>", value, "tempcc");
            return (Criteria) this;
        }

        public Criteria andTempccGreaterThan(BigDecimal value) {
            addCriterion("TEMPCC >", value, "tempcc");
            return (Criteria) this;
        }

        public Criteria andTempccGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TEMPCC >=", value, "tempcc");
            return (Criteria) this;
        }

        public Criteria andTempccLessThan(BigDecimal value) {
            addCriterion("TEMPCC <", value, "tempcc");
            return (Criteria) this;
        }

        public Criteria andTempccLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TEMPCC <=", value, "tempcc");
            return (Criteria) this;
        }

        public Criteria andTempccIn(List<BigDecimal> values) {
            addCriterion("TEMPCC in", values, "tempcc");
            return (Criteria) this;
        }

        public Criteria andTempccNotIn(List<BigDecimal> values) {
            addCriterion("TEMPCC not in", values, "tempcc");
            return (Criteria) this;
        }

        public Criteria andTempccBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TEMPCC between", value1, value2, "tempcc");
            return (Criteria) this;
        }

        public Criteria andTempccNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TEMPCC not between", value1, value2, "tempcc");
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