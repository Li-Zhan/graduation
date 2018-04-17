package cn.lynu.model;

import java.io.Serializable;

public class Subject implements Serializable{
	private static final long serialVersionUID = -3649425445693175127L;

	private Integer subjectId;

    private String subjectName;

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName == null ? null : subjectName.trim();
    }
}