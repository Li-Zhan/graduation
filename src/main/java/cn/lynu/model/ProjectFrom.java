package cn.lynu.model;

import java.io.Serializable;

public class ProjectFrom implements Serializable{
	private static final long serialVersionUID = 9078243478511649037L;

	private Integer projectFromId;

    private String projectFromName;

    public Integer getProjectFromId() {
        return projectFromId;
    }

    public void setProjectFromId(Integer projectFromId) {
        this.projectFromId = projectFromId;
    }

    public String getProjectFromName() {
        return projectFromName;
    }

    public void setProjectFromName(String projectFromName) {
        this.projectFromName = projectFromName == null ? null : projectFromName.trim();
    }
}