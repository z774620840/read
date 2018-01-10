package org.igeek.pojo;

public class ProjectWorkload {
    private Integer project_Workload_Id;

    private String project_Id;

    private Double assess_Workload;

    private Double actual_Workload;

    private Integer workload_Proportion;

    private Integer days;

    private Double weekly_Workload;

    public Integer getproject_Workload_Id() {
        return project_Workload_Id;
    }

    public void setproject_Workload_Id(Integer project_Workload_Id) {
        this.project_Workload_Id = project_Workload_Id;
    }

    public String getproject_Id() {
        return project_Id;
    }

    public void setproject_Id(String project_Id) {
        this.project_Id = project_Id == null ? null : project_Id.trim();
    }

    public Double getassess_Workload() {
        return assess_Workload;
    }

    public void setassess_Workload(Double assess_Workload) {
        this.assess_Workload = assess_Workload;
    }

    public Double getactual_Workload() {
        return actual_Workload;
    }

    public void setactual_Workload(Double actual_Workload) {
        this.actual_Workload = actual_Workload;
    }

    public Integer getworkload_Proportion() {
        return workload_Proportion;
    }

    public void setworkload_Proportion(Integer workload_Proportion) {
        this.workload_Proportion = workload_Proportion;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public Double getweekly_Workload() {
        return weekly_Workload;
    }

    public void setweekly_Workload(Double weekly_Workload) {
        this.weekly_Workload = weekly_Workload;
    }
}