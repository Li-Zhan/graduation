package cn.lynu.model;

import java.io.Serializable;

public class YansouTeacher implements Serializable{
	private static final long serialVersionUID = 3228891451232583789L;

	private Integer id;

    private Integer yansouTeamId;

    private String teacherId;

    private Integer isLeader;
    
    //级联属性
    private Teacher teacher;
    

    public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getYansouTeamId() {
        return yansouTeamId;
    }

    public void setYansouTeamId(Integer yansouTeamId) {
        this.yansouTeamId = yansouTeamId;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId == null ? null : teacherId.trim();
    }

    public Integer getIsLeader() {
        return isLeader;
    }

    public void setIsLeader(Integer isLeader) {
        this.isLeader = isLeader;
    }
}