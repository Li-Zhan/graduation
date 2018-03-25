package cn.lynu.model;

import java.util.ArrayList;
import java.util.List;

public class TeacherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeacherExample() {
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

        public Criteria andTeacherDescribeIsNull() {
            addCriterion("teacher_describe is null");
            return (Criteria) this;
        }

        public Criteria andTeacherDescribeIsNotNull() {
            addCriterion("teacher_describe is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherDescribeEqualTo(String value) {
            addCriterion("teacher_describe =", value, "teacherDescribe");
            return (Criteria) this;
        }

        public Criteria andTeacherDescribeNotEqualTo(String value) {
            addCriterion("teacher_describe <>", value, "teacherDescribe");
            return (Criteria) this;
        }

        public Criteria andTeacherDescribeGreaterThan(String value) {
            addCriterion("teacher_describe >", value, "teacherDescribe");
            return (Criteria) this;
        }

        public Criteria andTeacherDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_describe >=", value, "teacherDescribe");
            return (Criteria) this;
        }

        public Criteria andTeacherDescribeLessThan(String value) {
            addCriterion("teacher_describe <", value, "teacherDescribe");
            return (Criteria) this;
        }

        public Criteria andTeacherDescribeLessThanOrEqualTo(String value) {
            addCriterion("teacher_describe <=", value, "teacherDescribe");
            return (Criteria) this;
        }

        public Criteria andTeacherDescribeLike(String value) {
            addCriterion("teacher_describe like", value, "teacherDescribe");
            return (Criteria) this;
        }

        public Criteria andTeacherDescribeNotLike(String value) {
            addCriterion("teacher_describe not like", value, "teacherDescribe");
            return (Criteria) this;
        }

        public Criteria andTeacherDescribeIn(List<String> values) {
            addCriterion("teacher_describe in", values, "teacherDescribe");
            return (Criteria) this;
        }

        public Criteria andTeacherDescribeNotIn(List<String> values) {
            addCriterion("teacher_describe not in", values, "teacherDescribe");
            return (Criteria) this;
        }

        public Criteria andTeacherDescribeBetween(String value1, String value2) {
            addCriterion("teacher_describe between", value1, value2, "teacherDescribe");
            return (Criteria) this;
        }

        public Criteria andTeacherDescribeNotBetween(String value1, String value2) {
            addCriterion("teacher_describe not between", value1, value2, "teacherDescribe");
            return (Criteria) this;
        }

        public Criteria andTeacherProjectNumIsNull() {
            addCriterion("teacher_project_num is null");
            return (Criteria) this;
        }

        public Criteria andTeacherProjectNumIsNotNull() {
            addCriterion("teacher_project_num is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherProjectNumEqualTo(String value) {
            addCriterion("teacher_project_num =", value, "teacherProjectNum");
            return (Criteria) this;
        }

        public Criteria andTeacherProjectNumNotEqualTo(String value) {
            addCriterion("teacher_project_num <>", value, "teacherProjectNum");
            return (Criteria) this;
        }

        public Criteria andTeacherProjectNumGreaterThan(String value) {
            addCriterion("teacher_project_num >", value, "teacherProjectNum");
            return (Criteria) this;
        }

        public Criteria andTeacherProjectNumGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_project_num >=", value, "teacherProjectNum");
            return (Criteria) this;
        }

        public Criteria andTeacherProjectNumLessThan(String value) {
            addCriterion("teacher_project_num <", value, "teacherProjectNum");
            return (Criteria) this;
        }

        public Criteria andTeacherProjectNumLessThanOrEqualTo(String value) {
            addCriterion("teacher_project_num <=", value, "teacherProjectNum");
            return (Criteria) this;
        }

        public Criteria andTeacherProjectNumLike(String value) {
            addCriterion("teacher_project_num like", value, "teacherProjectNum");
            return (Criteria) this;
        }

        public Criteria andTeacherProjectNumNotLike(String value) {
            addCriterion("teacher_project_num not like", value, "teacherProjectNum");
            return (Criteria) this;
        }

        public Criteria andTeacherProjectNumIn(List<String> values) {
            addCriterion("teacher_project_num in", values, "teacherProjectNum");
            return (Criteria) this;
        }

        public Criteria andTeacherProjectNumNotIn(List<String> values) {
            addCriterion("teacher_project_num not in", values, "teacherProjectNum");
            return (Criteria) this;
        }

        public Criteria andTeacherProjectNumBetween(String value1, String value2) {
            addCriterion("teacher_project_num between", value1, value2, "teacherProjectNum");
            return (Criteria) this;
        }

        public Criteria andTeacherProjectNumNotBetween(String value1, String value2) {
            addCriterion("teacher_project_num not between", value1, value2, "teacherProjectNum");
            return (Criteria) this;
        }

        public Criteria andTeacherTypeIdIsNull() {
            addCriterion("teacher_type_id is null");
            return (Criteria) this;
        }

        public Criteria andTeacherTypeIdIsNotNull() {
            addCriterion("teacher_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherTypeIdEqualTo(Integer value) {
            addCriterion("teacher_type_id =", value, "teacherTypeId");
            return (Criteria) this;
        }

        public Criteria andTeacherTypeIdNotEqualTo(Integer value) {
            addCriterion("teacher_type_id <>", value, "teacherTypeId");
            return (Criteria) this;
        }

        public Criteria andTeacherTypeIdGreaterThan(Integer value) {
            addCriterion("teacher_type_id >", value, "teacherTypeId");
            return (Criteria) this;
        }

        public Criteria andTeacherTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("teacher_type_id >=", value, "teacherTypeId");
            return (Criteria) this;
        }

        public Criteria andTeacherTypeIdLessThan(Integer value) {
            addCriterion("teacher_type_id <", value, "teacherTypeId");
            return (Criteria) this;
        }

        public Criteria andTeacherTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("teacher_type_id <=", value, "teacherTypeId");
            return (Criteria) this;
        }

        public Criteria andTeacherTypeIdIn(List<Integer> values) {
            addCriterion("teacher_type_id in", values, "teacherTypeId");
            return (Criteria) this;
        }

        public Criteria andTeacherTypeIdNotIn(List<Integer> values) {
            addCriterion("teacher_type_id not in", values, "teacherTypeId");
            return (Criteria) this;
        }

        public Criteria andTeacherTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("teacher_type_id between", value1, value2, "teacherTypeId");
            return (Criteria) this;
        }

        public Criteria andTeacherTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("teacher_type_id not between", value1, value2, "teacherTypeId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andDeptIdIsNull() {
            addCriterion("dept_id is null");
            return (Criteria) this;
        }

        public Criteria andDeptIdIsNotNull() {
            addCriterion("dept_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeptIdEqualTo(Integer value) {
            addCriterion("dept_id =", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotEqualTo(Integer value) {
            addCriterion("dept_id <>", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThan(Integer value) {
            addCriterion("dept_id >", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dept_id >=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThan(Integer value) {
            addCriterion("dept_id <", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThanOrEqualTo(Integer value) {
            addCriterion("dept_id <=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdIn(List<Integer> values) {
            addCriterion("dept_id in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotIn(List<Integer> values) {
            addCriterion("dept_id not in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdBetween(Integer value1, Integer value2) {
            addCriterion("dept_id between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dept_id not between", value1, value2, "deptId");
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