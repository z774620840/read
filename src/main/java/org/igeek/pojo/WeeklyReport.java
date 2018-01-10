package org.igeek.pojo;

import java.util.Date;

public class WeeklyReport {
    private Integer weekly_Report_Id;

    private String weekly_Report_Name;

    private String week;

    private Integer progress;

    private Integer progress_Status;

    private String progress_Remark;

    private Integer milestone_Id;

    private String weekly_Report_Accessory;

    private Boolean issend_Email;

    private String project_Id;

    private Date plan_Time;

    private Date actual_Time;

    public Integer getweekly_Report_Id() {
        return weekly_Report_Id;
    }

    public void setweekly_Report_Id(Integer weekly_Report_Id) {
        this.weekly_Report_Id = weekly_Report_Id;
    }

    public String getweekly_Report_Name() {
        return weekly_Report_Name;
    }

    public void setweekly_Report_Name(String weekly_Report_Name) {
        this.weekly_Report_Name = weekly_Report_Name == null ? null : weekly_Report_Name.trim();
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week == null ? null : week.trim();
    }

    public Integer getProgress() {
        return progress;
    }

    public void setProgress(Integer progress) {
        this.progress = progress;
    }

    public Integer getprogress_Status() {
        return progress_Status;
    }

    public void setprogress_Status(Integer progress_Status) {
        this.progress_Status = progress_Status == null ? null : progress_Status;
    }

    public String getprogress_Remark() {
        return progress_Remark;
    }

    public void setprogress_Remark(String progress_Remark) {
        this.progress_Remark = progress_Remark == null ? null : progress_Remark.trim();
    }

    public Integer getmilestone_Id() {
        return milestone_Id;
    }

    public void setmilestone_Id(Integer milestone_Id) {
        this.milestone_Id = milestone_Id;
    }

    public String getweekly_Report_Accessory() {
        return weekly_Report_Accessory;
    }

    public void setweekly_Report_Accessory(String weekly_Report_Accessory) {
        this.weekly_Report_Accessory = weekly_Report_Accessory == null ? null : weekly_Report_Accessory.trim();
    }

    public Boolean getissend_Email() {
        return issend_Email;
    }

    public void setissend_Email(Boolean issend_Email) {
        this.issend_Email = issend_Email;
    }

    public String getproject_Id() {
        return project_Id;
    }

    public void setproject_Id(String project_Id) {
        this.project_Id = project_Id == null ? null : project_Id.trim();
    }

    public Date getplan_Time() {
        return plan_Time;
    }

    public void setplan_Time(Date plan_Time) {
        this.plan_Time = plan_Time;
    }

    public Date getactual_Time() {
        return actual_Time;
    }

    public void setactual_Time(Date actual_Time) {
        this.actual_Time = actual_Time;
    }
    
}