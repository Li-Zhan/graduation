package cn.lynu.model;

import java.io.Serializable;

public class Student implements Serializable{
	private static final long serialVersionUID = 6462341393652342296L;
	
	private String studentId;

    private Integer projectNum;

    private Integer goodBoy;

    private Integer projectId;

    private String teacherId;

    private String userId;

    private Integer classId;

    private Integer studentScore;

    private String teacherEvaluate;
    
    private String yansouTeamId;
    
    //级联属性
    private User user;
    private Project project;
    private ClassInfo classInfo;
    private Teacher teacher;
    private Ktbg ktbg;
    private Zqjc zqjc;
    private Mdb mdb;
    private Lunwen lunwen;
    private DaBian daBian;
    

	public DaBian getDaBian() {
		return daBian;
	}

	public void setDaBian(DaBian daBian) {
		this.daBian = daBian;
	}

	public Lunwen getLunwen() {
		return lunwen;
	}

	public void setLunwen(Lunwen lunwen) {
		this.lunwen = lunwen;
	}

	public Mdb getMdb() {
		return mdb;
	}

	public void setMdb(Mdb mdb) {
		this.mdb = mdb;
	}

	public String getYansouTeamId() {
		return yansouTeamId;
	}

	public void setYansouTeamId(String yansouTeamId) {
		this.yansouTeamId = yansouTeamId;
	}

	public Zqjc getZqjc() {
		return zqjc;
	}

	public void setZqjc(Zqjc zqjc) {
		this.zqjc = zqjc;
	}

	public Ktbg getKtbg() {
		return ktbg;
	}

	public void setKtbg(Ktbg ktbg) {
		this.ktbg = ktbg;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public ClassInfo getClassInfo() {
		return classInfo;
	}

	public void setClassInfo(ClassInfo classInfo) {
		this.classInfo = classInfo;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

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

    
    public Integer getStudentScore() {
        return studentScore;
    }

    public void setStudentScore(Integer studentScore) {
        this.studentScore = studentScore;
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