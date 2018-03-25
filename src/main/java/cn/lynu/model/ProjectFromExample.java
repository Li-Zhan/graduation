package cn.lynu.model;

import java.util.ArrayList;
import java.util.List;

public class ProjectFromExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProjectFromExample() {
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

        public Criteria andProjectFromIdIsNull() {
            addCriterion("project_from_id is null");
            return (Criteria) this;
        }

        public Criteria andProjectFromIdIsNotNull() {
            addCriterion("project_from_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjectFromIdEqualTo(Integer value) {
            addCriterion("project_from_id =", value, "projectFromId");
            return (Criteria) this;
        }

        public Criteria andProjectFromIdNotEqualTo(Integer value) {
            addCriterion("project_from_id <>", value, "projectFromId");
            return (Criteria) this;
        }

        public Criteria andProjectFromIdGreaterThan(Integer value) {
            addCriterion("project_from_id >", value, "projectFromId");
            return (Criteria) this;
        }

        public Criteria andProjectFromIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_from_id >=", value, "projectFromId");
            return (Criteria) this;
        }

        public Criteria andProjectFromIdLessThan(Integer value) {
            addCriterion("project_from_id <", value, "projectFromId");
            return (Criteria) this;
        }

        public Criteria andProjectFromIdLessThanOrEqualTo(Integer value) {
            addCriterion("project_from_id <=", value, "projectFromId");
            return (Criteria) this;
        }

        public Criteria andProjectFromIdIn(List<Integer> values) {
            addCriterion("project_from_id in", values, "projectFromId");
            return (Criteria) this;
        }

        public Criteria andProjectFromIdNotIn(List<Integer> values) {
            addCriterion("project_from_id not in", values, "projectFromId");
            return (Criteria) this;
        }

        public Criteria andProjectFromIdBetween(Integer value1, Integer value2) {
            addCriterion("project_from_id between", value1, value2, "projectFromId");
            return (Criteria) this;
        }

        public Criteria andProjectFromIdNotBetween(Integer value1, Integer value2) {
            addCriterion("project_from_id not between", value1, value2, "projectFromId");
            return (Criteria) this;
        }

        public Criteria andProjectFromNameIsNull() {
            addCriterion("project_from_name is null");
            return (Criteria) this;
        }

        public Criteria andProjectFromNameIsNotNull() {
            addCriterion("project_from_name is not null");
            return (Criteria) this;
        }

        public Criteria andProjectFromNameEqualTo(String value) {
            addCriterion("project_from_name =", value, "projectFromName");
            return (Criteria) this;
        }

        public Criteria andProjectFromNameNotEqualTo(String value) {
            addCriterion("project_from_name <>", value, "projectFromName");
            return (Criteria) this;
        }

        public Criteria andProjectFromNameGreaterThan(String value) {
            addCriterion("project_from_name >", value, "projectFromName");
            return (Criteria) this;
        }

        public Criteria andProjectFromNameGreaterThanOrEqualTo(String value) {
            addCriterion("project_from_name >=", value, "projectFromName");
            return (Criteria) this;
        }

        public Criteria andProjectFromNameLessThan(String value) {
            addCriterion("project_from_name <", value, "projectFromName");
            return (Criteria) this;
        }

        public Criteria andProjectFromNameLessThanOrEqualTo(String value) {
            addCriterion("project_from_name <=", value, "projectFromName");
            return (Criteria) this;
        }

        public Criteria andProjectFromNameLike(String value) {
            addCriterion("project_from_name like", value, "projectFromName");
            return (Criteria) this;
        }

        public Criteria andProjectFromNameNotLike(String value) {
            addCriterion("project_from_name not like", value, "projectFromName");
            return (Criteria) this;
        }

        public Criteria andProjectFromNameIn(List<String> values) {
            addCriterion("project_from_name in", values, "projectFromName");
            return (Criteria) this;
        }

        public Criteria andProjectFromNameNotIn(List<String> values) {
            addCriterion("project_from_name not in", values, "projectFromName");
            return (Criteria) this;
        }

        public Criteria andProjectFromNameBetween(String value1, String value2) {
            addCriterion("project_from_name between", value1, value2, "projectFromName");
            return (Criteria) this;
        }

        public Criteria andProjectFromNameNotBetween(String value1, String value2) {
            addCriterion("project_from_name not between", value1, value2, "projectFromName");
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