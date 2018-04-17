package cn.lynu.model;

import java.io.Serializable;

public class Grade implements Serializable{
	private static final long serialVersionUID = -7986245317958849894L;

	private Integer gradeId;

    private String gradeName;

    public Integer getGradeId() {
        return gradeId;
    }

    public void setGradeId(Integer gradeId) {
        this.gradeId = gradeId;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName == null ? null : gradeName.trim();
    }
}