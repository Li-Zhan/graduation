package cn.lynu.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WorkTimeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WorkTimeExample() {
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

        public Criteria andWorkTimeIdIsNull() {
            addCriterion("work_time_id is null");
            return (Criteria) this;
        }

        public Criteria andWorkTimeIdIsNotNull() {
            addCriterion("work_time_id is not null");
            return (Criteria) this;
        }

        public Criteria andWorkTimeIdEqualTo(Integer value) {
            addCriterion("work_time_id =", value, "workTimeId");
            return (Criteria) this;
        }

        public Criteria andWorkTimeIdNotEqualTo(Integer value) {
            addCriterion("work_time_id <>", value, "workTimeId");
            return (Criteria) this;
        }

        public Criteria andWorkTimeIdGreaterThan(Integer value) {
            addCriterion("work_time_id >", value, "workTimeId");
            return (Criteria) this;
        }

        public Criteria andWorkTimeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("work_time_id >=", value, "workTimeId");
            return (Criteria) this;
        }

        public Criteria andWorkTimeIdLessThan(Integer value) {
            addCriterion("work_time_id <", value, "workTimeId");
            return (Criteria) this;
        }

        public Criteria andWorkTimeIdLessThanOrEqualTo(Integer value) {
            addCriterion("work_time_id <=", value, "workTimeId");
            return (Criteria) this;
        }

        public Criteria andWorkTimeIdIn(List<Integer> values) {
            addCriterion("work_time_id in", values, "workTimeId");
            return (Criteria) this;
        }

        public Criteria andWorkTimeIdNotIn(List<Integer> values) {
            addCriterion("work_time_id not in", values, "workTimeId");
            return (Criteria) this;
        }

        public Criteria andWorkTimeIdBetween(Integer value1, Integer value2) {
            addCriterion("work_time_id between", value1, value2, "workTimeId");
            return (Criteria) this;
        }

        public Criteria andWorkTimeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("work_time_id not between", value1, value2, "workTimeId");
            return (Criteria) this;
        }

        public Criteria andWorkTimeInfoIsNull() {
            addCriterion("work_time_info is null");
            return (Criteria) this;
        }

        public Criteria andWorkTimeInfoIsNotNull() {
            addCriterion("work_time_info is not null");
            return (Criteria) this;
        }

        public Criteria andWorkTimeInfoEqualTo(String value) {
            addCriterion("work_time_info =", value, "workTimeInfo");
            return (Criteria) this;
        }

        public Criteria andWorkTimeInfoNotEqualTo(String value) {
            addCriterion("work_time_info <>", value, "workTimeInfo");
            return (Criteria) this;
        }

        public Criteria andWorkTimeInfoGreaterThan(String value) {
            addCriterion("work_time_info >", value, "workTimeInfo");
            return (Criteria) this;
        }

        public Criteria andWorkTimeInfoGreaterThanOrEqualTo(String value) {
            addCriterion("work_time_info >=", value, "workTimeInfo");
            return (Criteria) this;
        }

        public Criteria andWorkTimeInfoLessThan(String value) {
            addCriterion("work_time_info <", value, "workTimeInfo");
            return (Criteria) this;
        }

        public Criteria andWorkTimeInfoLessThanOrEqualTo(String value) {
            addCriterion("work_time_info <=", value, "workTimeInfo");
            return (Criteria) this;
        }

        public Criteria andWorkTimeInfoLike(String value) {
            addCriterion("work_time_info like", value, "workTimeInfo");
            return (Criteria) this;
        }

        public Criteria andWorkTimeInfoNotLike(String value) {
            addCriterion("work_time_info not like", value, "workTimeInfo");
            return (Criteria) this;
        }

        public Criteria andWorkTimeInfoIn(List<String> values) {
            addCriterion("work_time_info in", values, "workTimeInfo");
            return (Criteria) this;
        }

        public Criteria andWorkTimeInfoNotIn(List<String> values) {
            addCriterion("work_time_info not in", values, "workTimeInfo");
            return (Criteria) this;
        }

        public Criteria andWorkTimeInfoBetween(String value1, String value2) {
            addCriterion("work_time_info between", value1, value2, "workTimeInfo");
            return (Criteria) this;
        }

        public Criteria andWorkTimeInfoNotBetween(String value1, String value2) {
            addCriterion("work_time_info not between", value1, value2, "workTimeInfo");
            return (Criteria) this;
        }

        public Criteria andWorkTimeStartIsNull() {
            addCriterion("work_time_start is null");
            return (Criteria) this;
        }

        public Criteria andWorkTimeStartIsNotNull() {
            addCriterion("work_time_start is not null");
            return (Criteria) this;
        }

        public Criteria andWorkTimeStartEqualTo(Date value) {
            addCriterion("work_time_start =", value, "workTimeStart");
            return (Criteria) this;
        }

        public Criteria andWorkTimeStartNotEqualTo(Date value) {
            addCriterion("work_time_start <>", value, "workTimeStart");
            return (Criteria) this;
        }

        public Criteria andWorkTimeStartGreaterThan(Date value) {
            addCriterion("work_time_start >", value, "workTimeStart");
            return (Criteria) this;
        }

        public Criteria andWorkTimeStartGreaterThanOrEqualTo(Date value) {
            addCriterion("work_time_start >=", value, "workTimeStart");
            return (Criteria) this;
        }

        public Criteria andWorkTimeStartLessThan(Date value) {
            addCriterion("work_time_start <", value, "workTimeStart");
            return (Criteria) this;
        }

        public Criteria andWorkTimeStartLessThanOrEqualTo(Date value) {
            addCriterion("work_time_start <=", value, "workTimeStart");
            return (Criteria) this;
        }

        public Criteria andWorkTimeStartIn(List<Date> values) {
            addCriterion("work_time_start in", values, "workTimeStart");
            return (Criteria) this;
        }

        public Criteria andWorkTimeStartNotIn(List<Date> values) {
            addCriterion("work_time_start not in", values, "workTimeStart");
            return (Criteria) this;
        }

        public Criteria andWorkTimeStartBetween(Date value1, Date value2) {
            addCriterion("work_time_start between", value1, value2, "workTimeStart");
            return (Criteria) this;
        }

        public Criteria andWorkTimeStartNotBetween(Date value1, Date value2) {
            addCriterion("work_time_start not between", value1, value2, "workTimeStart");
            return (Criteria) this;
        }

        public Criteria andWorkTimeEndIsNull() {
            addCriterion("work_time_end is null");
            return (Criteria) this;
        }

        public Criteria andWorkTimeEndIsNotNull() {
            addCriterion("work_time_end is not null");
            return (Criteria) this;
        }

        public Criteria andWorkTimeEndEqualTo(Date value) {
            addCriterion("work_time_end =", value, "workTimeEnd");
            return (Criteria) this;
        }

        public Criteria andWorkTimeEndNotEqualTo(Date value) {
            addCriterion("work_time_end <>", value, "workTimeEnd");
            return (Criteria) this;
        }

        public Criteria andWorkTimeEndGreaterThan(Date value) {
            addCriterion("work_time_end >", value, "workTimeEnd");
            return (Criteria) this;
        }

        public Criteria andWorkTimeEndGreaterThanOrEqualTo(Date value) {
            addCriterion("work_time_end >=", value, "workTimeEnd");
            return (Criteria) this;
        }

        public Criteria andWorkTimeEndLessThan(Date value) {
            addCriterion("work_time_end <", value, "workTimeEnd");
            return (Criteria) this;
        }

        public Criteria andWorkTimeEndLessThanOrEqualTo(Date value) {
            addCriterion("work_time_end <=", value, "workTimeEnd");
            return (Criteria) this;
        }

        public Criteria andWorkTimeEndIn(List<Date> values) {
            addCriterion("work_time_end in", values, "workTimeEnd");
            return (Criteria) this;
        }

        public Criteria andWorkTimeEndNotIn(List<Date> values) {
            addCriterion("work_time_end not in", values, "workTimeEnd");
            return (Criteria) this;
        }

        public Criteria andWorkTimeEndBetween(Date value1, Date value2) {
            addCriterion("work_time_end between", value1, value2, "workTimeEnd");
            return (Criteria) this;
        }

        public Criteria andWorkTimeEndNotBetween(Date value1, Date value2) {
            addCriterion("work_time_end not between", value1, value2, "workTimeEnd");
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