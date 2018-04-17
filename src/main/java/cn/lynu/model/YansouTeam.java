package cn.lynu.model;

import java.io.Serializable;
import java.util.List;

public class YansouTeam implements Serializable{
	private static final long serialVersionUID = 1735629356395690707L;

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