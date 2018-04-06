package cn.lynu.model;

import java.util.List;

public class YansouTeam {
    private Integer yansouTeamId;

    private String yansouTeamName;
    
    //级联属性
    private List<YansouTeacher> yansouTeachers;
    

	public List<YansouTeacher> getYansouTeachers() {
		return yansouTeachers;
	}

	public void setYansouTeachers(List<YansouTeacher> yansouTeachers) {
		this.yansouTeachers = yansouTeachers;
	}

	public Integer getYansouTeamId() {
        return yansouTeamId;
    }

    public void setYansouTeamId(Integer yansouTeamId) {
        this.yansouTeamId = yansouTeamId;
    }

    public String getYansouTeamName() {
        return yansouTeamName;
    }

    public void setYansouTeamName(String yansouTeamName) {
        this.yansouTeamName = yansouTeamName == null ? null : yansouTeamName.trim();
    }
}