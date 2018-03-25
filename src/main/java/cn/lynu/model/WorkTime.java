package cn.lynu.model;

import java.util.Date;

public class WorkTime {
    private Integer workTimeId;

    private String workTimeInfo;

    private Date workTimeStart;

    private Date workTimeEnd;

    public Integer getWorkTimeId() {
        return workTimeId;
    }

    public void setWorkTimeId(Integer workTimeId) {
        this.workTimeId = workTimeId;
    }

    public String getWorkTimeInfo() {
        return workTimeInfo;
    }

    public void setWorkTimeInfo(String workTimeInfo) {
        this.workTimeInfo = workTimeInfo == null ? null : workTimeInfo.trim();
    }

    public Date getWorkTimeStart() {
        return workTimeStart;
    }

    public void setWorkTimeStart(Date workTimeStart) {
        this.workTimeStart = workTimeStart;
    }

    public Date getWorkTimeEnd() {
        return workTimeEnd;
    }

    public void setWorkTimeEnd(Date workTimeEnd) {
        this.workTimeEnd = workTimeEnd;
    }
}