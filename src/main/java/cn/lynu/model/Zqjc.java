package cn.lynu.model;

import java.io.Serializable;

public class Zqjc implements Serializable{
	private static final long serialVersionUID = 2234223632477485386L;
	
	private Integer zqjcId;

    private String column1;

    private String column2;

    private String column3;

    private String column4;

    private String studentId;

    public Integer getZqjcId() {
        return zqjcId;
    }

    public void setZqjcId(Integer zqjcId) {
        this.zqjcId = zqjcId;
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

    public String getColumn3() {
        return column3;
    }

    public void setColumn3(String column3) {
        this.column3 = column3 == null ? null : column3.trim();
    }

    public String getColumn4() {
        return column4;
    }

    public void setColumn4(String column4) {
        this.column4 = column4 == null ? null : column4.trim();
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId == null ? null : studentId.trim();
    }
}