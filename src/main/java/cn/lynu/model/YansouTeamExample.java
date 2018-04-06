package cn.lynu.model;

import java.util.ArrayList;
import java.util.List;

public class YansouTeamExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YansouTeamExample() {
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

        public Criteria andYansouTeamIdIsNull() {
            addCriterion("yansou_team_id is null");
            return (Criteria) this;
        }

        public Criteria andYansouTeamIdIsNotNull() {
            addCriterion("yansou_team_id is not null");
            return (Criteria) this;
        }

        public Criteria andYansouTeamIdEqualTo(Integer value) {
            addCriterion("yansou_team_id =", value, "yansouTeamId");
            return (Criteria) this;
        }

        public Criteria andYansouTeamIdNotEqualTo(Integer value) {
            addCriterion("yansou_team_id <>", value, "yansouTeamId");
            return (Criteria) this;
        }

        public Criteria andYansouTeamIdGreaterThan(Integer value) {
            addCriterion("yansou_team_id >", value, "yansouTeamId");
            return (Criteria) this;
        }

        public Criteria andYansouTeamIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("yansou_team_id >=", value, "yansouTeamId");
            return (Criteria) this;
        }

        public Criteria andYansouTeamIdLessThan(Integer value) {
            addCriterion("yansou_team_id <", value, "yansouTeamId");
            return (Criteria) this;
        }

        public Criteria andYansouTeamIdLessThanOrEqualTo(Integer value) {
            addCriterion("yansou_team_id <=", value, "yansouTeamId");
            return (Criteria) this;
        }

        public Criteria andYansouTeamIdIn(List<Integer> values) {
            addCriterion("yansou_team_id in", values, "yansouTeamId");
            return (Criteria) this;
        }

        public Criteria andYansouTeamIdNotIn(List<Integer> values) {
            addCriterion("yansou_team_id not in", values, "yansouTeamId");
            return (Criteria) this;
        }

        public Criteria andYansouTeamIdBetween(Integer value1, Integer value2) {
            addCriterion("yansou_team_id between", value1, value2, "yansouTeamId");
            return (Criteria) this;
        }

        public Criteria andYansouTeamIdNotBetween(Integer value1, Integer value2) {
            addCriterion("yansou_team_id not between", value1, value2, "yansouTeamId");
            return (Criteria) this;
        }

        public Criteria andYansouTeamNameIsNull() {
            addCriterion("yansou_team_name is null");
            return (Criteria) this;
        }

        public Criteria andYansouTeamNameIsNotNull() {
            addCriterion("yansou_team_name is not null");
            return (Criteria) this;
        }

        public Criteria andYansouTeamNameEqualTo(String value) {
            addCriterion("yansou_team_name =", value, "yansouTeamName");
            return (Criteria) this;
        }

        public Criteria andYansouTeamNameNotEqualTo(String value) {
            addCriterion("yansou_team_name <>", value, "yansouTeamName");
            return (Criteria) this;
        }

        public Criteria andYansouTeamNameGreaterThan(String value) {
            addCriterion("yansou_team_name >", value, "yansouTeamName");
            return (Criteria) this;
        }

        public Criteria andYansouTeamNameGreaterThanOrEqualTo(String value) {
            addCriterion("yansou_team_name >=", value, "yansouTeamName");
            return (Criteria) this;
        }

        public Criteria andYansouTeamNameLessThan(String value) {
            addCriterion("yansou_team_name <", value, "yansouTeamName");
            return (Criteria) this;
        }

        public Criteria andYansouTeamNameLessThanOrEqualTo(String value) {
            addCriterion("yansou_team_name <=", value, "yansouTeamName");
            return (Criteria) this;
        }

        public Criteria andYansouTeamNameLike(String value) {
            addCriterion("yansou_team_name like", value, "yansouTeamName");
            return (Criteria) this;
        }

        public Criteria andYansouTeamNameNotLike(String value) {
            addCriterion("yansou_team_name not like", value, "yansouTeamName");
            return (Criteria) this;
        }

        public Criteria andYansouTeamNameIn(List<String> values) {
            addCriterion("yansou_team_name in", values, "yansouTeamName");
            return (Criteria) this;
        }

        public Criteria andYansouTeamNameNotIn(List<String> values) {
            addCriterion("yansou_team_name not in", values, "yansouTeamName");
            return (Criteria) this;
        }

        public Criteria andYansouTeamNameBetween(String value1, String value2) {
            addCriterion("yansou_team_name between", value1, value2, "yansouTeamName");
            return (Criteria) this;
        }

        public Criteria andYansouTeamNameNotBetween(String value1, String value2) {
            addCriterion("yansou_team_name not between", value1, value2, "yansouTeamName");
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