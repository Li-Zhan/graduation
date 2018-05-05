package cn.lynu.model;

import java.io.Serializable;

public class Mdb implements Serializable{
	private static final long serialVersionUID = -6217898367611951524L;
	
	private Integer mdbId;

    private String column1;

    private String column2;

    private String column3;

    private String studentId;
    
    private Integer mdbStatus;
    

    public Integer getMdbStatus() {
		return mdbStatus;
	}

	public void setMdbStatus(Integer mdbStatus) {
		this.mdbStatus = mdbStatus;
	}

	public Integer getMdbId() {
        return mdbId;
    }

    public void setMdbId(Integer mdbId) {
        this.mdbId = mdbId;
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

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId == null ? null : studentId.trim();
    }
}