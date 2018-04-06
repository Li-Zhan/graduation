package cn.lynu.model;

import java.util.ArrayList;
import java.util.List;

public class YansouTeacherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YansouTeacherExample() {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
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

        public Criteria andTeacherIdIsNull() {
            addCriterion("teacher_id is null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIsNotNull() {
            addCriterion("teacher_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdEqualTo(String value) {
            addCriterion("teacher_id =", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotEqualTo(String value) {
            addCriterion("teacher_id <>", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThan(String value) {
            addCriterion("teacher_id >", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_id >=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThan(String value) {
            addCriterion("teacher_id <", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThanOrEqualTo(String value) {
            addCriterion("teacher_id <=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLike(String value) {
            addCriterion("teacher_id like", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotLike(String value) {
            addCriterion("teacher_id not like", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIn(List<String> values) {
            addCriterion("teacher_id in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotIn(List<String> values) {
            addCriterion("teacher_id not in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdBetween(String value1, String value2) {
            addCriterion("teacher_id between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotBetween(String value1, String value2) {
            addCriterion("teacher_id not between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andIsLeaderIsNull() {
            addCriterion("is_leader is null");
            return (Criteria) this;
        }

        public Criteria andIsLeaderIsNotNull() {
            addCriterion("is_leader is not null");
            return (Criteria) this;
        }

        public Criteria andIsLeaderEqualTo(Integer value) {
            addCriterion("is_leader =", value, "isLeader");
            return (Criteria) this;
        }

        public Criteria andIsLeaderNotEqualTo(Integer value) {
            addCriterion("is_leader <>", value, "isLeader");
            return (Criteria) this;
        }

        public Criteria andIsLeaderGreaterThan(Integer value) {
            addCriterion("is_leader >", value, "isLeader");
            return (Criteria) this;
        }

        public Criteria andIsLeaderGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_leader >=", value, "isLeader");
            return (Criteria) this;
        }

        public Criteria andIsLeaderLessThan(Integer value) {
            addCriterion("is_leader <", value, "isLeader");
            return (Criteria) this;
        }

        public Criteria andIsLeaderLessThanOrEqualTo(Integer value) {
            addCriterion("is_leader <=", value, "isLeader");
            return (Criteria) this;
        }

        public Criteria andIsLeaderIn(List<Integer> values) {
            addCriterion("is_leader in", values, "isLeader");
            return (Criteria) this;
        }

        public Criteria andIsLeaderNotIn(List<Integer> values) {
            addCriterion("is_leader not in", values, "isLeader");
            return (Criteria) this;
        }

        public Criteria andIsLeaderBetween(Integer value1, Integer value2) {
            addCriterion("is_leader between", value1, value2, "isLeader");
            return (Criteria) this;
        }

        public Criteria andIsLeaderNotBetween(Integer value1, Integer value2) {
            addCriterion("is_leader not between", value1, value2, "isLeader");
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