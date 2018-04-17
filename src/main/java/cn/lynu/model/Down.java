package cn.lynu.model;

import java.io.Serializable;
import java.util.Date;

public class Down implements Serializable{
	private static final long serialVersionUID = -3835701865423130130L;

	private Integer downId;

    private String downTitle;

    private String downPath;

    private Date createDate;

    private String adminId;

    public Integer getDownId() {
        return downId;
    }

    public void setDownId(Integer downId) {
        this.downId = downId;
    }

    public String getDownTitle() {
        return downTitle;
    }

    public void setDownTitle(String downTitle) {
        this.downTitle = downTitle == null ? null : downTitle.trim();
    }

    public String getDownPath() {
        return downPath;
    }

    public void setDownPath(String downPath) {
        this.downPath = downPath == null ? null : downPath.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId == null ? null : adminId.trim();
    }
}