package cn.lynu.model;

import java.io.Serializable;

public class Roles implements Serializable{
	private static final long serialVersionUID = 5994994988422788236L;

	private Integer rolesId;

    private String rolesName;

    public Integer getRolesId() {
        return rolesId;
    }

    public void setRolesId(Integer rolesId) {
        this.rolesId = rolesId;
    }

    public String getRolesName() {
        return rolesName;
    }

    public void setRolesName(String rolesName) {
        this.rolesName = rolesName == null ? null : rolesName.trim();
    }
}