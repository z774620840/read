package org.igeek.pojo;

import java.util.Date;

public class Milestone {
    private Integer milestone_Id;

    private String milestone_Name;

    private Date plan_Delivery_Time;

    private Date actual_Delivery_Time;

    private Integer milestone_Status;

    private String project_Id;

    public Integer getmilestone_Id() {
        return milestone_Id;
    }

    public void setmilestone_Id(Integer milestone_Id) {
        this.milestone_Id = milestone_Id;
    }

    public String getmilestone_Name() {
        return milestone_Name;
    }

    public void setmilestone_Name(String milestone_Name) {
        this.milestone_Name = milestone_Name == null ? null : milestone_Name.trim();
    }

    public Date getplan_Delivery_Time() {
        return plan_Delivery_Time;
    }

    public void setplan_Delivery_Time(Date plan_Delivery_Time) {
        this.plan_Delivery_Time = plan_Delivery_Time;
    }

    public Date getactual_Delivery_Time() {
        return actual_Delivery_Time;
    }

    public void setactual_Delivery_Time(Date actual_Delivery_Time) {
        this.actual_Delivery_Time = actual_Delivery_Time;
    }

    public Integer getmilestone_Status() {
        return milestone_Status;
    }

    public void setmilestone_Status(Integer milestone_Status) {
        this.milestone_Status = milestone_Status == null ? null : milestone_Status;
    }

    public String getproject_Id() {
        return project_Id;
    }

    public void setproject_Id(String project_Id) {
        this.project_Id = project_Id == null ? null : project_Id.trim();
    }
}