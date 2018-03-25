package cn.lynu.model;

public class Teacher {
    private String teacherId;

    private String teacherDescribe;

    private String teacherProjectNum;

    private Integer teacherTypeId;

    private String userId;

    private Integer deptId;

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId == null ? null : teacherId.trim();
    }

    public String getTeacherDescribe() {
        return teacherDescribe;
    }

    public void setTeacherDescribe(String teacherDescribe) {
        this.teacherDescribe = teacherDescribe == null ? null : teacherDescribe.trim();
    }

    public String getTeacherProjectNum() {
        return teacherProjectNum;
    }

    public void setTeacherProjectNum(String teacherProjectNum) {
        this.teacherProjectNum = teacherProjectNum == null ? null : teacherProjectNum.trim();
    }

    public Integer getTeacherTypeId() {
        return teacherTypeId;
    }

    public void setTeacherTypeId(Integer teacherTypeId) {
        this.teacherTypeId = teacherTypeId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }
}