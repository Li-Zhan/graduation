package cn.lynu.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LunwenExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LunwenExample() {
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

        public Criteria andLunwenIdIsNull() {
            addCriterion("lunwen_id is null");
            return (Criteria) this;
        }

        public Criteria andLunwenIdIsNotNull() {
            addCriterion("lunwen_id is not null");
            return (Criteria) this;
        }

        public Criteria andLunwenIdEqualTo(Integer value) {
            addCriterion("lunwen_id =", value, "lunwenId");
            return (Criteria) this;
        }

        public Criteria andLunwenIdNotEqualTo(Integer value) {
            addCriterion("lunwen_id <>", value, "lunwenId");
            return (Criteria) this;
        }

        public Criteria andLunwenIdGreaterThan(Integer value) {
            addCriterion("lunwen_id >", value, "lunwenId");
            return (Criteria) this;
        }

        public Criteria andLunwenIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("lunwen_id >=", value, "lunwenId");
            return (Criteria) this;
        }

        public Criteria andLunwenIdLessThan(Integer value) {
            addCriterion("lunwen_id <", value, "lunwenId");
            return (Criteria) this;
        }

        public Criteria andLunwenIdLessThanOrEqualTo(Integer value) {
            addCriterion("lunwen_id <=", value, "lunwenId");
            return (Criteria) this;
        }

        public Criteria andLunwenIdIn(List<Integer> values) {
            addCriterion("lunwen_id in", values, "lunwenId");
            return (Criteria) this;
        }

        public Criteria andLunwenIdNotIn(List<Integer> values) {
            addCriterion("lunwen_id not in", values, "lunwenId");
            return (Criteria) this;
        }

        public Criteria andLunwenIdBetween(Integer value1, Integer value2) {
            addCriterion("lunwen_id between", value1, value2, "lunwenId");
            return (Criteria) this;
        }

        public Criteria andLunwenIdNotBetween(Integer value1, Integer value2) {
            addCriterion("lunwen_id not between", value1, value2, "lunwenId");
            return (Criteria) this;
        }

        public Criteria andLunwenNameIsNull() {
            addCriterion("lunwen_name is null");
            return (Criteria) this;
        }

        public Criteria andLunwenNameIsNotNull() {
            addCriterion("lunwen_name is not null");
            return (Criteria) this;
        }

        public Criteria andLunwenNameEqualTo(String value) {
            addCriterion("lunwen_name =", value, "lunwenName");
            return (Criteria) this;
        }

        public Criteria andLunwenNameNotEqualTo(String value) {
            addCriterion("lunwen_name <>", value, "lunwenName");
            return (Criteria) this;
        }

        public Criteria andLunwenNameGreaterThan(String value) {
            addCriterion("lunwen_name >", value, "lunwenName");
            return (Criteria) this;
        }

        public Criteria andLunwenNameGreaterThanOrEqualTo(String value) {
            addCriterion("lunwen_name >=", value, "lunwenName");
            return (Criteria) this;
        }

        public Criteria andLunwenNameLessThan(String value) {
            addCriterion("lunwen_name <", value, "lunwenName");
            return (Criteria) this;
        }

        public Criteria andLunwenNameLessThanOrEqualTo(String value) {
            addCriterion("lunwen_name <=", value, "lunwenName");
            return (Criteria) this;
        }

        public Criteria andLunwenNameLike(String value) {
            addCriterion("lunwen_name like", value, "lunwenName");
            return (Criteria) this;
        }

        public Criteria andLunwenNameNotLike(String value) {
            addCriterion("lunwen_name not like", value, "lunwenName");
            return (Criteria) this;
        }

        public Criteria andLunwenNameIn(List<String> values) {
            addCriterion("lunwen_name in", values, "lunwenName");
            return (Criteria) this;
        }

        public Criteria andLunwenNameNotIn(List<String> values) {
            addCriterion("lunwen_name not in", values, "lunwenName");
            return (Criteria) this;
        }

        public Criteria andLunwenNameBetween(String value1, String value2) {
            addCriterion("lunwen_name between", value1, value2, "lunwenName");
            return (Criteria) this;
        }

        public Criteria andLunwenNameNotBetween(String value1, String value2) {
            addCriterion("lunwen_name not between", value1, value2, "lunwenName");
            return (Criteria) this;
        }

        public Criteria andLunwenPathIsNull() {
            addCriterion("lunwen_path is null");
            return (Criteria) this;
        }

        public Criteria andLunwenPathIsNotNull() {
            addCriterion("lunwen_path is not null");
            return (Criteria) this;
        }

        public Criteria andLunwenPathEqualTo(String value) {
            addCriterion("lunwen_path =", value, "lunwenPath");
            return (Criteria) this;
        }

        public Criteria andLunwenPathNotEqualTo(String value) {
            addCriterion("lunwen_path <>", value, "lunwenPath");
            return (Criteria) this;
        }

        public Criteria andLunwenPathGreaterThan(String value) {
            addCriterion("lunwen_path >", value, "lunwenPath");
            return (Criteria) this;
        }

        public Criteria andLunwenPathGreaterThanOrEqualTo(String value) {
            addCriterion("lunwen_path >=", value, "lunwenPath");
            return (Criteria) this;
        }

        public Criteria andLunwenPathLessThan(String value) {
            addCriterion("lunwen_path <", value, "lunwenPath");
            return (Criteria) this;
        }

        public Criteria andLunwenPathLessThanOrEqualTo(String value) {
            addCriterion("lunwen_path <=", value, "lunwenPath");
            return (Criteria) this;
        }

        public Criteria andLunwenPathLike(String value) {
            addCriterion("lunwen_path like", value, "lunwenPath");
            return (Criteria) this;
        }

        public Criteria andLunwenPathNotLike(String value) {
            addCriterion("lunwen_path not like", value, "lunwenPath");
            return (Criteria) this;
        }

        public Criteria andLunwenPathIn(List<String> values) {
            addCriterion("lunwen_path in", values, "lunwenPath");
            return (Criteria) this;
        }

        public Criteria andLunwenPathNotIn(List<String> values) {
            addCriterion("lunwen_path not in", values, "lunwenPath");
            return (Criteria) this;
        }

        public Criteria andLunwenPathBetween(String value1, String value2) {
            addCriterion("lunwen_path between", value1, value2, "lunwenPath");
            return (Criteria) this;
        }

        public Criteria andLunwenPathNotBetween(String value1, String value2) {
            addCriterion("lunwen_path not between", value1, value2, "lunwenPath");
            return (Criteria) this;
        }

        public Criteria andLunwenDateIsNull() {
            addCriterion("lunwen_date is null");
            return (Criteria) this;
        }

        public Criteria andLunwenDateIsNotNull() {
            addCriterion("lunwen_date is not null");
            return (Criteria) this;
        }

        public Criteria andLunwenDateEqualTo(Date value) {
            addCriterion("lunwen_date =", value, "lunwenDate");
            return (Criteria) this;
        }

        public Criteria andLunwenDateNotEqualTo(Date value) {
            addCriterion("lunwen_date <>", value, "lunwenDate");
            return (Criteria) this;
        }

        public Criteria andLunwenDateGreaterThan(Date value) {
            addCriterion("lunwen_date >", value, "lunwenDate");
            return (Criteria) this;
        }

        public Criteria andLunwenDateGreaterThanOrEqualTo(Date value) {
            addCriterion("lunwen_date >=", value, "lunwenDate");
            return (Criteria) this;
        }

        public Criteria andLunwenDateLessThan(Date value) {
            addCriterion("lunwen_date <", value, "lunwenDate");
            return (Criteria) this;
        }

        public Criteria andLunwenDateLessThanOrEqualTo(Date value) {
            addCriterion("lunwen_date <=", value, "lunwenDate");
            return (Criteria) this;
        }

        public Criteria andLunwenDateIn(List<Date> values) {
            addCriterion("lunwen_date in", values, "lunwenDate");
            return (Criteria) this;
        }

        public Criteria andLunwenDateNotIn(List<Date> values) {
            addCriterion("lunwen_date not in", values, "lunwenDate");
            return (Criteria) this;
        }

        public Criteria andLunwenDateBetween(Date value1, Date value2) {
            addCriterion("lunwen_date between", value1, value2, "lunwenDate");
            return (Criteria) this;
        }

        public Criteria andLunwenDateNotBetween(Date value1, Date value2) {
            addCriterion("lunwen_date not between", value1, value2, "lunwenDate");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNull() {
            addCriterion("student_id is null");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNotNull() {
            addCriterion("student_id is not null");
            return (Criteria) this;
        }

        public Criteria andStudentIdEqualTo(String value) {
            addCriterion("student_id =", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotEqualTo(String value) {
            addCriterion("student_id <>", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThan(String value) {
            addCriterion("student_id >", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThanOrEqualTo(String value) {
            addCriterion("student_id >=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThan(String value) {
            addCriterion("student_id <", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThanOrEqualTo(String value) {
            addCriterion("student_id <=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLike(String value) {
            addCriterion("student_id like", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotLike(String value) {
            addCriterion("student_id not like", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdIn(List<String> values) {
            addCriterion("student_id in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotIn(List<String> values) {
            addCriterion("student_id not in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdBetween(String value1, String value2) {
            addCriterion("student_id between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotBetween(String value1, String value2) {
            addCriterion("student_id not between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andLunwenStatusIsNull() {
            addCriterion("lunwen_status is null");
            return (Criteria) this;
        }

        public Criteria andLunwenStatusIsNotNull() {
            addCriterion("lunwen_status is not null");
            return (Criteria) this;
        }

        public Criteria andLunwenStatusEqualTo(Integer value) {
            addCriterion("lunwen_status =", value, "lunwenStatus");
            return (Criteria) this;
        }

        public Criteria andLunwenStatusNotEqualTo(Integer value) {
            addCriterion("lunwen_status <>", value, "lunwenStatus");
            return (Criteria) this;
        }

        public Criteria andLunwenStatusGreaterThan(Integer value) {
            addCriterion("lunwen_status >", value, "lunwenStatus");
            return (Criteria) this;
        }

        public Criteria andLunwenStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("lunwen_status >=", value, "lunwenStatus");
            return (Criteria) this;
        }

        public Criteria andLunwenStatusLessThan(Integer value) {
            addCriterion("lunwen_status <", value, "lunwenStatus");
            return (Criteria) this;
        }

        public Criteria andLunwenStatusLessThanOrEqualTo(Integer value) {
            addCriterion("lunwen_status <=", value, "lunwenStatus");
            return (Criteria) this;
        }

        public Criteria andLunwenStatusIn(List<Integer> values) {
            addCriterion("lunwen_status in", values, "lunwenStatus");
            return (Criteria) this;
        }

        public Criteria andLunwenStatusNotIn(List<Integer> values) {
            addCriterion("lunwen_status not in", values, "lunwenStatus");
            return (Criteria) this;
        }

        public Criteria andLunwenStatusBetween(Integer value1, Integer value2) {
            addCriterion("lunwen_status between", value1, value2, "lunwenStatus");
            return (Criteria) this;
        }

        public Criteria andLunwenStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("lunwen_status not between", value1, value2, "lunwenStatus");
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