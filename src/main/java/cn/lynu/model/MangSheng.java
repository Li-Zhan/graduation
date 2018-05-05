package cn.lynu.model;

import java.io.Serializable;

public class MangSheng implements Serializable{
	private static final long serialVersionUID = 3851149247942903537L;
	
	private Integer id;

    private String studentId;

    private String mangshengEvaluate;

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

    public String getMangshengEvaluate() {
        return mangshengEvaluate;
    }

    public void setMangshengEvaluate(String mangshengEvaluate) {
        this.mangshengEvaluate = mangshengEvaluate == null ? null : mangshengEvaluate.trim();
    }
}