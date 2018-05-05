package cn.lynu.model;

import java.io.Serializable;

public class Ktbg  implements Serializable{
	private static final long serialVersionUID = 5666133656817701116L;
	
	private Integer ktbgId;

    private String column1;

    private String column2;

    private String studentId;

    private Integer ktbgStatus;

    public Integer getKtbgId() {
        return ktbgId;
    }

    public void setKtbgId(Integer ktbgId) {
        this.ktbgId = ktbgId;
    }

    public String getColumn1() {
        return column1;
    }

    public void setColumn1(String column1) {
        this.column1 = column1 == null ? null : column1.trim();
    }

    public String getColumn2() {
        return column2;
    }

    public void setColumn2(String column2) {
        this.column2 = column2 == null ? null : column2.trim();
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId == null ? null : studentId.trim();
    }

    public Integer getKtbgStatus() {
        return ktbgStatus;
    }

    public void setKtbgStatus(Integer ktbgStatus) {
        this.ktbgStatus = ktbgStatus;
    }
}