package cn.lynu.model;

public class Project {
    private Integer projectId;

    private String projectName;

    private String projectDescribe;

    private Integer projectFromId;

    private String teacherId;

    private String studentId;
    
    private Teacher teacher;
    private ProjectFrom projectFrom;

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    public String getProjectDescribe() {
        return projectDescribe;
    }

    public void setProjectDescribe(String projectDescribe) {
        this.projectDescribe = projectDescribe == null ? null : projectDescribe.trim();
    }

    public Integer getProjectFromId() {
        return projectFromId;
    }

    public void setProjectFromId(Integer projectFromId) {
        this.projectFromId = projectFromId;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId == null ? null : teacherId.trim();
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId == null ? null : studentId.trim();
    }

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public ProjectFrom getProjectFrom() {
		return projectFrom;
	}

	public void setProjectFrom(ProjectFrom projectFrom) {
		this.projectFrom = projectFrom;
	}
    
}