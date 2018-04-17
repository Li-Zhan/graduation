package cn.lynu.model;

import java.io.Serializable;

public class Admin implements Serializable{
	private static final long serialVersionUID = 81402464279278347L;

	private String adminId;

    private String userId;

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId == null ? null : adminId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }
}