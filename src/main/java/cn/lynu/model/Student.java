package cn.lynu.model;

public class Student {
    private String studentId;

    private Integer projectNum;

    private Integer goodBoy;

    private Integer projectId;

    private String teacherId;

    private String userId;

    private Integer classId;

    private Integer studentSource;

    private String teacherEvaluate;
    
    //级联属性
    private User user;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId == null ? null : studentId.trim();
    }

    public Integer getProjectNum() {
        return projectNum;
    }

    public void setProjectNum(Integer projectNum) {
        this.projectNum = projectNum;
    }

    public Integer getGoodBoy() {
        return goodBoy;
    }

    public void setGoodBoy(Integer goodBoy) {
        this.goodBoy = goodBoy;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId == null ? null : teacherId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public Integer getStudentSource() {
        return studentSource;
    }

    public void setStudentSource(Integer studentSource) {
        this.studentSource = studentSource;
    }

    public String getTeacherEvaluate() {
        return teacherEvaluate;
    }

    public void setTeacherEvaluate(String teacherEvaluate) {
        this.teacherEvaluate = teacherEvaluate == null ? null : teacherEvaluate.trim();
    }

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
    
    
}