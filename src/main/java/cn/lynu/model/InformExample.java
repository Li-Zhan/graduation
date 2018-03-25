package cn.lynu.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InformExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InformExample() {
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

        public Criteria andInformIdIsNull() {
            addCriterion("inform_id is null");
            return (Criteria) this;
        }

        public Criteria andInformIdIsNotNull() {
            addCriterion("inform_id is not null");
            return (Criteria) this;
        }

        public Criteria andInformIdEqualTo(Integer value) {
            addCriterion("inform_id =", value, "informId");
            return (Criteria) this;
        }

        public Criteria andInformIdNotEqualTo(Integer value) {
            addCriterion("inform_id <>", value, "informId");
            return (Criteria) this;
        }

        public Criteria andInformIdGreaterThan(Integer value) {
            addCriterion("inform_id >", value, "informId");
            return (Criteria) this;
        }

        public Criteria andInformIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("inform_id >=", value, "informId");
            return (Criteria) this;
        }

        public Criteria andInformIdLessThan(Integer value) {
            addCriterion("inform_id <", value, "informId");
            return (Criteria) this;
        }

        public Criteria andInformIdLessThanOrEqualTo(Integer value) {
            addCriterion("inform_id <=", value, "informId");
            return (Criteria) this;
        }

        public Criteria andInformIdIn(List<Integer> values) {
            addCriterion("inform_id in", values, "informId");
            return (Criteria) this;
        }

        public Criteria andInformIdNotIn(List<Integer> values) {
            addCriterion("inform_id not in", values, "informId");
            return (Criteria) this;
        }

        public Criteria andInformIdBetween(Integer value1, Integer value2) {
            addCriterion("inform_id between", value1, value2, "informId");
            return (Criteria) this;
        }

        public Criteria andInformIdNotBetween(Integer value1, Integer value2) {
            addCriterion("inform_id not between", value1, value2, "informId");
            return (Criteria) this;
        }

        public Criteria andInformTitleIsNull() {
            addCriterion("inform_title is null");
            return (Criteria) this;
        }

        public Criteria andInformTitleIsNotNull() {
            addCriterion("inform_title is not null");
            return (Criteria) this;
        }

        public Criteria andInformTitleEqualTo(String value) {
            addCriterion("inform_title =", value, "informTitle");
            return (Criteria) this;
        }

        public Criteria andInformTitleNotEqualTo(String value) {
            addCriterion("inform_title <>", value, "informTitle");
            return (Criteria) this;
        }

        public Criteria andInformTitleGreaterThan(String value) {
            addCriterion("inform_title >", value, "informTitle");
            return (Criteria) this;
        }

        public Criteria andInformTitleGreaterThanOrEqualTo(String value) {
            addCriterion("inform_title >=", value, "informTitle");
            return (Criteria) this;
        }

        public Criteria andInformTitleLessThan(String value) {
            addCriterion("inform_title <", value, "informTitle");
            return (Criteria) this;
        }

        public Criteria andInformTitleLessThanOrEqualTo(String value) {
            addCriterion("inform_title <=", value, "informTitle");
            return (Criteria) this;
        }

        public Criteria andInformTitleLike(String value) {
            addCriterion("inform_title like", value, "informTitle");
            return (Criteria) this;
        }

        public Criteria andInformTitleNotLike(String value) {
            addCriterion("inform_title not like", value, "informTitle");
            return (Criteria) this;
        }

        public Criteria andInformTitleIn(List<String> values) {
            addCriterion("inform_title in", values, "informTitle");
            return (Criteria) this;
        }

        public Criteria andInformTitleNotIn(List<String> values) {
            addCriterion("inform_title not in", values, "informTitle");
            return (Criteria) this;
        }

        public Criteria andInformTitleBetween(String value1, String value2) {
            addCriterion("inform_title between", value1, value2, "informTitle");
            return (Criteria) this;
        }

        public Criteria andInformTitleNotBetween(String value1, String value2) {
            addCriterion("inform_title not between", value1, value2, "informTitle");
            return (Criteria) this;
        }

        public Criteria andInformBodyIsNull() {
            addCriterion("inform_body is null");
            return (Criteria) this;
        }

        public Criteria andInformBodyIsNotNull() {
            addCriterion("inform_body is not null");
            return (Criteria) this;
        }

        public Criteria andInformBodyEqualTo(String value) {
            addCriterion("inform_body =", value, "informBody");
            return (Criteria) this;
        }

        public Criteria andInformBodyNotEqualTo(String value) {
            addCriterion("inform_body <>", value, "informBody");
            return (Criteria) this;
        }

        public Criteria andInformBodyGreaterThan(String value) {
            addCriterion("inform_body >", value, "informBody");
            return (Criteria) this;
        }

        public Criteria andInformBodyGreaterThanOrEqualTo(String value) {
            addCriterion("inform_body >=", value, "informBody");
            return (Criteria) this;
        }

        public Criteria andInformBodyLessThan(String value) {
            addCriterion("inform_body <", value, "informBody");
            return (Criteria) this;
        }

        public Criteria andInformBodyLessThanOrEqualTo(String value) {
            addCriterion("inform_body <=", value, "informBody");
            return (Criteria) this;
        }

        public Criteria andInformBodyLike(String value) {
            addCriterion("inform_body like", value, "informBody");
            return (Criteria) this;
        }

        public Criteria andInformBodyNotLike(String value) {
            addCriterion("inform_body not like", value, "informBody");
            return (Criteria) this;
        }

        public Criteria andInformBodyIn(List<String> values) {
            addCriterion("inform_body in", values, "informBody");
            return (Criteria) this;
        }

        public Criteria andInformBodyNotIn(List<String> values) {
            addCriterion("inform_body not in", values, "informBody");
            return (Criteria) this;
        }

        public Criteria andInformBodyBetween(String value1, String value2) {
            addCriterion("inform_body between", value1, value2, "informBody");
            return (Criteria) this;
        }

        public Criteria andInformBodyNotBetween(String value1, String value2) {
            addCriterion("inform_body not between", value1, value2, "informBody");
            return (Criteria) this;
        }

        public Criteria andIsAttachmentIsNull() {
            addCriterion("is_attachment is null");
            return (Criteria) this;
        }

        public Criteria andIsAttachmentIsNotNull() {
            addCriterion("is_attachment is not null");
            return (Criteria) this;
        }

        public Criteria andIsAttachmentEqualTo(Integer value) {
            addCriterion("is_attachment =", value, "isAttachment");
            return (Criteria) this;
        }

        public Criteria andIsAttachmentNotEqualTo(Integer value) {
            addCriterion("is_attachment <>", value, "isAttachment");
            return (Criteria) this;
        }

        public Criteria andIsAttachmentGreaterThan(Integer value) {
            addCriterion("is_attachment >", value, "isAttachment");
            return (Criteria) this;
        }

        public Criteria andIsAttachmentGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_attachment >=", value, "isAttachment");
            return (Criteria) this;
        }

        public Criteria andIsAttachmentLessThan(Integer value) {
            addCriterion("is_attachment <", value, "isAttachment");
            return (Criteria) this;
        }

        public Criteria andIsAttachmentLessThanOrEqualTo(Integer value) {
            addCriterion("is_attachment <=", value, "isAttachment");
            return (Criteria) this;
        }

        public Criteria andIsAttachmentIn(List<Integer> values) {
            addCriterion("is_attachment in", values, "isAttachment");
            return (Criteria) this;
        }

        public Criteria andIsAttachmentNotIn(List<Integer> values) {
            addCriterion("is_attachment not in", values, "isAttachment");
            return (Criteria) this;
        }

        public Criteria andIsAttachmentBetween(Integer value1, Integer value2) {
            addCriterion("is_attachment between", value1, value2, "isAttachment");
            return (Criteria) this;
        }

        public Criteria andIsAttachmentNotBetween(Integer value1, Integer value2) {
            addCriterion("is_attachment not between", value1, value2, "isAttachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentPathIsNull() {
            addCriterion("attachment-path is null");
            return (Criteria) this;
        }

        public Criteria andAttachmentPathIsNotNull() {
            addCriterion("attachment-path is not null");
            return (Criteria) this;
        }

        public Criteria andAttachmentPathEqualTo(String value) {
            addCriterion("attachment-path =", value, "attachmentPath");
            return (Criteria) this;
        }

        public Criteria andAttachmentPathNotEqualTo(String value) {
            addCriterion("attachment-path <>", value, "attachmentPath");
            return (Criteria) this;
        }

        public Criteria andAttachmentPathGreaterThan(String value) {
            addCriterion("attachment-path >", value, "attachmentPath");
            return (Criteria) this;
        }

        public Criteria andAttachmentPathGreaterThanOrEqualTo(String value) {
            addCriterion("attachment-path >=", value, "attachmentPath");
            return (Criteria) this;
        }

        public Criteria andAttachmentPathLessThan(String value) {
            addCriterion("attachment-path <", value, "attachmentPath");
            return (Criteria) this;
        }

        public Criteria andAttachmentPathLessThanOrEqualTo(String value) {
            addCriterion("attachment-path <=", value, "attachmentPath");
            return (Criteria) this;
        }

        public Criteria andAttachmentPathLike(String value) {
            addCriterion("attachment-path like", value, "attachmentPath");
            return (Criteria) this;
        }

        public Criteria andAttachmentPathNotLike(String value) {
            addCriterion("attachment-path not like", value, "attachmentPath");
            return (Criteria) this;
        }

        public Criteria andAttachmentPathIn(List<String> values) {
            addCriterion("attachment-path in", values, "attachmentPath");
            return (Criteria) this;
        }

        public Criteria andAttachmentPathNotIn(List<String> values) {
            addCriterion("attachment-path not in", values, "attachmentPath");
            return (Criteria) this;
        }

        public Criteria andAttachmentPathBetween(String value1, String value2) {
            addCriterion("attachment-path between", value1, value2, "attachmentPath");
            return (Criteria) this;
        }

        public Criteria andAttachmentPathNotBetween(String value1, String value2) {
            addCriterion("attachment-path not between", value1, value2, "attachmentPath");
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