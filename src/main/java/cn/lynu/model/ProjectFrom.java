package cn.lynu.model;

public class ProjectFrom {
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