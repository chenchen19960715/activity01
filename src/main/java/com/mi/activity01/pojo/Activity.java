package com.mi.activity01.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Activity {
    private Long id;
    private String title;
    private String category;
    private String remark;
    @DateTimeFormat(pattern = "yyyy/MM/dd HH:mm")
    private Date startTime;
    @DateTimeFormat(pattern = "yyyy/MM/dd HH:mm")
    private Date endTime;
    private Integer state;
    private Date createdTime;
    private String createdUser;

    public Activity() {
    }

    public Activity(Long id, String title, String category, String remark, Date startTime, Date endTime, Integer state, Date createdTime, String createdUser) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.remark = remark;
        this.startTime = startTime;
        this.endTime = endTime;
        this.state = state;
        this.createdTime = createdTime;
        this.createdUser = createdUser;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getRemark() {
        return remark;
    }

    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public Integer getState() {
        return state;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public String getCreatedUser() {
        return createdUser;
    }

    @Override
    public String toString() {
        return "Activity{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", remark='" + remark + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", state=" + state +
                ", createdTime=" + createdTime +
                ", createdUser='" + createdUser + '\'' +
                '}';
    }
}
