package cn.lynu.model;

import java.io.Serializable;

public class DaBian implements Serializable{
	private static final long serialVersionUID = -9000649275655068218L;
	
	private Integer id;

    private String studentId;

    private Integer dabianScore;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId == null ? null : studentId.trim();
    }

    public Integer getDabianScore() {
        return dabianScore;
    }

    public void setDabianScore(Integer dabianScore) {
        this.dabianScore = dabianScore;
    }
}