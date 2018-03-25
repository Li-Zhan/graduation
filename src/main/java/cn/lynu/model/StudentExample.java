package cn.lynu.model;

import java.util.ArrayList;
import java.util.List;

public class StudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentExample() {
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

        public Criteria andProjectNumIsNull() {
            addCriterion("project_num is null");
            return (Criteria) this;
        }

        public Criteria andProjectNumIsNotNull() {
            addCriterion("project_num is not null");
            return (Criteria) this;
        }

        public Criteria andProjectNumEqualTo(Integer value) {
            addCriterion("project_num =", value, "projectNum");
            return (Criteria) this;
        }

        public Criteria andProjectNumNotEqualTo(Integer value) {
            addCriterion("project_num <>", value, "projectNum");
            return (Criteria) this;
        }

        public Criteria andProjectNumGreaterThan(Integer value) {
            addCriterion("project_num >", value, "projectNum");
            return (Criteria) this;
        }

        public Criteria andProjectNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_num >=", value, "projectNum");
            return (Criteria) this;
        }

        public Criteria andProjectNumLessThan(Integer value) {
            addCriterion("project_num <", value, "projectNum");
            return (Criteria) this;
        }

        public Criteria andProjectNumLessThanOrEqualTo(Integer value) {
            addCriterion("project_num <=", value, "projectNum");
            return (Criteria) this;
        }

        public Criteria andProjectNumIn(List<Integer> values) {
            addCriterion("project_num in", values, "projectNum");
            return (Criteria) this;
        }

        public Criteria andProjectNumNotIn(List<Integer> values) {
            addCriterion("project_num not in", values, "projectNum");
            return (Criteria) this;
        }

        public Criteria andProjectNumBetween(Integer value1, Integer value2) {
            addCriterion("project_num between", value1, value2, "projectNum");
            return (Criteria) this;
        }

        public Criteria andProjectNumNotBetween(Integer value1, Integer value2) {
            addCriterion("project_num not between", value1, value2, "projectNum");
            return (Criteria) this;
        }

        public Criteria andGoodBoyIsNull() {
            addCriterion("good_boy is null");
            return (Criteria) this;
        }

        public Criteria andGoodBoyIsNotNull() {
            addCriterion("good_boy is not null");
            return (Criteria) this;
        }

        public Criteria andGoodBoyEqualTo(Integer value) {
            addCriterion("good_boy =", value, "goodBoy");
            return (Criteria) this;
        }

        public Criteria andGoodBoyNotEqualTo(Integer value) {
            addCriterion("good_boy <>", value, "goodBoy");
            return (Criteria) this;
        }

        public Criteria andGoodBoyGreaterThan(Integer value) {
            addCriterion("good_boy >", value, "goodBoy");
            return (Criteria) this;
        }

        public Criteria andGoodBoyGreaterThanOrEqualTo(Integer value) {
            addCriterion("good_boy >=", value, "goodBoy");
            return (Criteria) this;
        }

        public Criteria andGoodBoyLessThan(Integer value) {
            addCriterion("good_boy <", value, "goodBoy");
            return (Criteria) this;
        }

        public Criteria andGoodBoyLessThanOrEqualTo(Integer value) {
            addCriterion("good_boy <=", value, "goodBoy");
            return (Criteria) this;
        }

        public Criteria andGoodBoyIn(List<Integer> values) {
            addCriterion("good_boy in", values, "goodBoy");
            return (Criteria) this;
        }

        public Criteria andGoodBoyNotIn(List<Integer> values) {
            addCriterion("good_boy not in", values, "goodBoy");
            return (Criteria) this;
        }

        public Criteria andGoodBoyBetween(Integer value1, Integer value2) {
            addCriterion("good_boy between", value1, value2, "goodBoy");
            return (Criteria) this;
        }

        public Criteria andGoodBoyNotBetween(Integer value1, Integer value2) {
            addCriterion("good_boy not between", value1, value2, "goodBoy");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNull() {
            addCriterion("project_id is null");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNotNull() {
            addCriterion("project_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjectIdEqualTo(Integer value) {
            addCriterion("project_id =", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotEqualTo(Integer value) {
            addCriterion("project_id <>", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThan(Integer value) {
            addCriterion("project_id >", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_id >=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThan(Integer value) {
            addCriterion("project_id <", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThanOrEqualTo(Integer value) {
            addCriterion("project_id <=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdIn(List<Integer> values) {
            addCriterion("project_id in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotIn(List<Integer> values) {
            addCriterion("project_id not in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdBetween(Integer value1, Integer value2) {
            addCriterion("project_id between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotBetween(Integer value1, Integer value2) {
            addCriterion("project_id not between", value1, value2, "projectId");
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

        public Criteria andClassIdIsNull() {
            addCriterion("class_id is null");
            return (Criteria) this;
        }

        public Criteria andClassIdIsNotNull() {
            addCriterion("class_id is not null");
            return (Criteria) this;
        }

        public Criteria andClassIdEqualTo(Integer value) {
            addCriterion("class_id =", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotEqualTo(Integer value) {
            addCriterion("class_id <>", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThan(Integer value) {
            addCriterion("class_id >", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("class_id >=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThan(Integer value) {
            addCriterion("class_id <", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThanOrEqualTo(Integer value) {
            addCriterion("class_id <=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdIn(List<Integer> values) {
            addCriterion("class_id in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotIn(List<Integer> values) {
            addCriterion("class_id not in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdBetween(Integer value1, Integer value2) {
            addCriterion("class_id between", value1, value2, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotBetween(Integer value1, Integer value2) {
            addCriterion("class_id not between", value1, value2, "classId");
            return (Criteria) this;
        }

        public Criteria andStudentSourceIsNull() {
            addCriterion("student_source is null");
            return (Criteria) this;
        }

        public Criteria andStudentSourceIsNotNull() {
            addCriterion("student_source is not null");
            return (Criteria) this;
        }

        public Criteria andStudentSourceEqualTo(Integer value) {
            addCriterion("student_source =", value, "studentSource");
            return (Criteria) this;
        }

        public Criteria andStudentSourceNotEqualTo(Integer value) {
            addCriterion("student_source <>", value, "studentSource");
            return (Criteria) this;
        }

        public Criteria andStudentSourceGreaterThan(Integer value) {
            addCriterion("student_source >", value, "studentSource");
            return (Criteria) this;
        }

        public Criteria andStudentSourceGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_source >=", value, "studentSource");
            return (Criteria) this;
        }

        public Criteria andStudentSourceLessThan(Integer value) {
            addCriterion("student_source <", value, "studentSource");
            return (Criteria) this;
        }

        public Criteria andStudentSourceLessThanOrEqualTo(Integer value) {
            addCriterion("student_source <=", value, "studentSource");
            return (Criteria) this;
        }

        public Criteria andStudentSourceIn(List<Integer> values) {
            addCriterion("student_source in", values, "studentSource");
            return (Criteria) this;
        }

        public Criteria andStudentSourceNotIn(List<Integer> values) {
            addCriterion("student_source not in", values, "studentSource");
            return (Criteria) this;
        }

        public Criteria andStudentSourceBetween(Integer value1, Integer value2) {
            addCriterion("student_source between", value1, value2, "studentSource");
            return (Criteria) this;
        }

        public Criteria andStudentSourceNotBetween(Integer value1, Integer value2) {
            addCriterion("student_source not between", value1, value2, "studentSource");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluateIsNull() {
            addCriterion("teacher_evaluate is null");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluateIsNotNull() {
            addCriterion("teacher_evaluate is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluateEqualTo(String value) {
            addCriterion("teacher_evaluate =", value, "teacherEvaluate");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluateNotEqualTo(String value) {
            addCriterion("teacher_evaluate <>", value, "teacherEvaluate");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluateGreaterThan(String value) {
            addCriterion("teacher_evaluate >", value, "teacherEvaluate");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluateGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_evaluate >=", value, "teacherEvaluate");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluateLessThan(String value) {
            addCriterion("teacher_evaluate <", value, "teacherEvaluate");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluateLessThanOrEqualTo(String value) {
            addCriterion("teacher_evaluate <=", value, "teacherEvaluate");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluateLike(String value) {
            addCriterion("teacher_evaluate like", value, "teacherEvaluate");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluateNotLike(String value) {
            addCriterion("teacher_evaluate not like", value, "teacherEvaluate");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluateIn(List<String> values) {
            addCriterion("teacher_evaluate in", values, "teacherEvaluate");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluateNotIn(List<String> values) {
            addCriterion("teacher_evaluate not in", values, "teacherEvaluate");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluateBetween(String value1, String value2) {
            addCriterion("teacher_evaluate between", value1, value2, "teacherEvaluate");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluateNotBetween(String value1, String value2) {
            addCriterion("teacher_evaluate not between", value1, value2, "teacherEvaluate");
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