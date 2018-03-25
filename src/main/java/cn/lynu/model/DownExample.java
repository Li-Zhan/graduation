package cn.lynu.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DownExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DownExample() {
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

        public Criteria andDownIdIsNull() {
            addCriterion("down_id is null");
            return (Criteria) this;
        }

        public Criteria andDownIdIsNotNull() {
            addCriterion("down_id is not null");
            return (Criteria) this;
        }

        public Criteria andDownIdEqualTo(Integer value) {
            addCriterion("down_id =", value, "downId");
            return (Criteria) this;
        }

        public Criteria andDownIdNotEqualTo(Integer value) {
            addCriterion("down_id <>", value, "downId");
            return (Criteria) this;
        }

        public Criteria andDownIdGreaterThan(Integer value) {
            addCriterion("down_id >", value, "downId");
            return (Criteria) this;
        }

        public Criteria andDownIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("down_id >=", value, "downId");
            return (Criteria) this;
        }

        public Criteria andDownIdLessThan(Integer value) {
            addCriterion("down_id <", value, "downId");
            return (Criteria) this;
        }

        public Criteria andDownIdLessThanOrEqualTo(Integer value) {
            addCriterion("down_id <=", value, "downId");
            return (Criteria) this;
        }

        public Criteria andDownIdIn(List<Integer> values) {
            addCriterion("down_id in", values, "downId");
            return (Criteria) this;
        }

        public Criteria andDownIdNotIn(List<Integer> values) {
            addCriterion("down_id not in", values, "downId");
            return (Criteria) this;
        }

        public Criteria andDownIdBetween(Integer value1, Integer value2) {
            addCriterion("down_id between", value1, value2, "downId");
            return (Criteria) this;
        }

        public Criteria andDownIdNotBetween(Integer value1, Integer value2) {
            addCriterion("down_id not between", value1, value2, "downId");
            return (Criteria) this;
        }

        public Criteria andDownTitleIsNull() {
            addCriterion("down_title is null");
            return (Criteria) this;
        }

        public Criteria andDownTitleIsNotNull() {
            addCriterion("down_title is not null");
            return (Criteria) this;
        }

        public Criteria andDownTitleEqualTo(String value) {
            addCriterion("down_title =", value, "downTitle");
            return (Criteria) this;
        }

        public Criteria andDownTitleNotEqualTo(String value) {
            addCriterion("down_title <>", value, "downTitle");
            return (Criteria) this;
        }

        public Criteria andDownTitleGreaterThan(String value) {
            addCriterion("down_title >", value, "downTitle");
            return (Criteria) this;
        }

        public Criteria andDownTitleGreaterThanOrEqualTo(String value) {
            addCriterion("down_title >=", value, "downTitle");
            return (Criteria) this;
        }

        public Criteria andDownTitleLessThan(String value) {
            addCriterion("down_title <", value, "downTitle");
            return (Criteria) this;
        }

        public Criteria andDownTitleLessThanOrEqualTo(String value) {
            addCriterion("down_title <=", value, "downTitle");
            return (Criteria) this;
        }

        public Criteria andDownTitleLike(String value) {
            addCriterion("down_title like", value, "downTitle");
            return (Criteria) this;
        }

        public Criteria andDownTitleNotLike(String value) {
            addCriterion("down_title not like", value, "downTitle");
            return (Criteria) this;
        }

        public Criteria andDownTitleIn(List<String> values) {
            addCriterion("down_title in", values, "downTitle");
            return (Criteria) this;
        }

        public Criteria andDownTitleNotIn(List<String> values) {
            addCriterion("down_title not in", values, "downTitle");
            return (Criteria) this;
        }

        public Criteria andDownTitleBetween(String value1, String value2) {
            addCriterion("down_title between", value1, value2, "downTitle");
            return (Criteria) this;
        }

        public Criteria andDownTitleNotBetween(String value1, String value2) {
            addCriterion("down_title not between", value1, value2, "downTitle");
            return (Criteria) this;
        }

        public Criteria andDownPathIsNull() {
            addCriterion("down_path is null");
            return (Criteria) this;
        }

        public Criteria andDownPathIsNotNull() {
            addCriterion("down_path is not null");
            return (Criteria) this;
        }

        public Criteria andDownPathEqualTo(String value) {
            addCriterion("down_path =", value, "downPath");
            return (Criteria) this;
        }

        public Criteria andDownPathNotEqualTo(String value) {
            addCriterion("down_path <>", value, "downPath");
            return (Criteria) this;
        }

        public Criteria andDownPathGreaterThan(String value) {
            addCriterion("down_path >", value, "downPath");
            return (Criteria) this;
        }

        public Criteria andDownPathGreaterThanOrEqualTo(String value) {
            addCriterion("down_path >=", value, "downPath");
            return (Criteria) this;
        }

        public Criteria andDownPathLessThan(String value) {
            addCriterion("down_path <", value, "downPath");
            return (Criteria) this;
        }

        public Criteria andDownPathLessThanOrEqualTo(String value) {
            addCriterion("down_path <=", value, "downPath");
            return (Criteria) this;
        }

        public Criteria andDownPathLike(String value) {
            addCriterion("down_path like", value, "downPath");
            return (Criteria) this;
        }

        public Criteria andDownPathNotLike(String value) {
            addCriterion("down_path not like", value, "downPath");
            return (Criteria) this;
        }

        public Criteria andDownPathIn(List<String> values) {
            addCriterion("down_path in", values, "downPath");
            return (Criteria) this;
        }

        public Criteria andDownPathNotIn(List<String> values) {
            addCriterion("down_path not in", values, "downPath");
            return (Criteria) this;
        }

        public Criteria andDownPathBetween(String value1, String value2) {
            addCriterion("down_path between", value1, value2, "downPath");
            return (Criteria) this;
        }

        public Criteria andDownPathNotBetween(String value1, String value2) {
            addCriterion("down_path not between", value1, value2, "downPath");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andAdminIdIsNull() {
            addCriterion("admin_id is null");
            return (Criteria) this;
        }

        public Criteria andAdminIdIsNotNull() {
            addCriterion("admin_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdminIdEqualTo(String value) {
            addCriterion("admin_id =", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotEqualTo(String value) {
            addCriterion("admin_id <>", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThan(String value) {
            addCriterion("admin_id >", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThanOrEqualTo(String value) {
            addCriterion("admin_id >=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThan(String value) {
            addCriterion("admin_id <", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThanOrEqualTo(String value) {
            addCriterion("admin_id <=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLike(String value) {
            addCriterion("admin_id like", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotLike(String value) {
            addCriterion("admin_id not like", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdIn(List<String> values) {
            addCriterion("admin_id in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotIn(List<String> values) {
            addCriterion("admin_id not in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdBetween(String value1, String value2) {
            addCriterion("admin_id between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotBetween(String value1, String value2) {
            addCriterion("admin_id not between", value1, value2, "adminId");
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