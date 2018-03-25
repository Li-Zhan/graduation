package cn.lynu.model;

public class Roles {
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