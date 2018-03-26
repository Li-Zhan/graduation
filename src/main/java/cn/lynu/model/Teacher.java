package cn.lynu.model;

public class Teacher {
    private String teacherId;

    private String teacherDescribe;

    private String teacherProjectNum;

    private Integer teacherTypeId;

    private String userId;

    private Integer deptId;
    
    //级联属性
    private User user;
    
    private Integer noChooseProject;

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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Integer getNoChooseProject() {
		return noChooseProject;
	}

	public void setNoChooseProject(Integer noChooseProject) {
		this.noChooseProject = noChooseProject;
	}
    
}