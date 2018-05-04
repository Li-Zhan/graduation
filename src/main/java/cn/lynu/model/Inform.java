package cn.lynu.model;

import java.util.Date;

public class Informimplements Serializable{

	private static final long serialVersionUID = 6362674348755025887L;

	private Integer informId;

    private String informTitle;

    private String informBody;

    private Integer isAttachment;

    private String attachmentPath;

    private Date createDate;

    private String adminId;

    public Integer getInformId() {
        return informId;
    }

    public void setInformId(Integer informId) {
        this.informId = informId;
    }

    public String getInformTitle() {
        return informTitle;
    }

    public void setInformTitle(String informTitle) {
        this.informTitle = informTitle == null ? null : informTitle.trim();
    }

    public String getInformBody() {
        return informBody;
    }

    public void setInformBody(String informBody) {
        this.informBody = informBody == null ? null : informBody.trim();
    }

    public Integer getIsAttachment() {
        return isAttachment;
    }

    public void setIsAttachment(Integer isAttachment) {
        this.isAttachment = isAttachment;
    }

    public String getAttachmentPath() {
        return attachmentPath;
    }

    public void setAttachmentPath(String attachmentPath) {
        this.attachmentPath = attachmentPath == null ? null : attachmentPath.trim();
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