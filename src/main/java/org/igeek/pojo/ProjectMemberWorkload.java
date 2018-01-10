package org.igeek.pojo;

public class ProjectMemberWorkload {
    private Integer project_Member_WorkloadId;

    private Integer employee_Id;

    private String project_Id;

    private Double peoject_Member_Workload;

    public Integer getproject_Member_WorkloadId() {
        return project_Member_WorkloadId;
    }

    public void setproject_Member_WorkloadId(Integer project_Member_WorkloadId) {
        this.project_Member_WorkloadId = project_Member_WorkloadId;
    }

    public Integer getemployee_Id() {
        return employee_Id;
    }

    public void setemployee_Id(Integer employee_Id) {
        this.employee_Id = employee_Id;
    }

    public String getproject_Id() {
        return project_Id;
    }

    public void setproject_Id(String project_Id) {
        this.project_Id = project_Id == null ? null : project_Id.trim();
    }

    public Double getpeoject_Member_Workload() {
        return peoject_Member_Workload;
    }

    public void setpeoject_Member_Workload(Double peoject_Member_Workload) {
        this.peoject_Member_Workload = peoject_Member_Workload;
    }
}