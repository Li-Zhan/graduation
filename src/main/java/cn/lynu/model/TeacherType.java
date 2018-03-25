package cn.lynu.model;

public class TeacherType {
    private Integer teacherTypeId;

    private String teacherTypeName;

    public Integer getTeacherTypeId() {
        return teacherTypeId;
    }

    public void setTeacherTypeId(Integer teacherTypeId) {
        this.teacherTypeId = teacherTypeId;
    }

    public String getTeacherTypeName() {
        return teacherTypeName;
    }

    public void setTeacherTypeName(String teacherTypeName) {
        this.teacherTypeName = teacherTypeName == null ? null : teacherTypeName.trim();
    }
}