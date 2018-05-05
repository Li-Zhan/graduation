package cn.lynu.model;

import java.io.Serializable;
import java.util.Date;

public class Lunwen implements Serializable{
	private static final long serialVersionUID = 8314940987124771477L;
	
	private Integer lunwenId;

    private String lunwenName;

    private String lunwenPath;

    private Date lunwenDate;

    private String studentId;

    private Integer lunwenStatus;
    

	public Integer getLunwenId() {
        return lunwenId;
    }

    public void setLunwenId(Integer lunwenId) {
        this.lunwenId = lunwenId;
    }

    public String getLunwenName() {
        return lunwenName;
    }

    public void setLunwenName(String lunwenName) {
        this.lunwenName = lunwenName == null ? null : lunwenName.trim();
    }

    public String getLunwenPath() {
        return lunwenPath;
    }

    public void setLunwenPath(String lunwenPath) {
        this.lunwenPath = lunwenPath == null ? null : lunwenPath.trim();
    }

    public Date getLunwenDate() {
        return lunwenDate;
    }

    public void setLunwenDate(Date lunwenDate) {
        this.lunwenDate = lunwenDate;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId == null ? null : studentId.trim();
    }

    public Integer getLunwenStatus() {
        return lunwenStatus;
    }

    public void setLunwenStatus(Integer lunwenStatus) {
        this.lunwenStatus = lunwenStatus;
    }
}