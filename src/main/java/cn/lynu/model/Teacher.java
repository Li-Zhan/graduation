package cn.lynu.model;

import java.io.Serializable;
import java.util.List;

public class Teacher implements Serializable{
	private static final long serialVersionUID = -7142905687688445947L;
	
	private String teacherId;

    private String teacherDescribe;

    private String teacherProjectNum;

    private String userId;

    private Integer deptId;
    
    private String zhicheng;
    
    //级联属性
    private User user;
    
    private Integer noChooseProject;
    
    private List<Project> projectList;
    
    private Dept dept;
    

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

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

	public List<Project> getProjectList() {
		return projectList;
	}

	public void setProjectList(List<Project> projectList) {
		this.projectList = projectList;
	}

	public String getZhicheng() {
		return zhicheng;
	}

	public void setZhicheng(String zhicheng) {
		this.zhicheng = zhicheng;
	}
    
}