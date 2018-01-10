package org.igeek.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class ProjectApproval {
    private Integer project_Approval_Id;

    private String project_Id;

    private String project_Name;

    private String company;

    private String vacation;

    private String solution;

    private Integer business_Id;
    
    private String business;

    private String presettime;

    private String starting_Time;

    private String online_Time;

    private String initial_Test_Time;

    private String final_Test_Time;

    private Integer pm_Id;
    
    private String pm;

    private String department;

    private String workingload_Computing;

    private String implement_Site;

    private Double assess_Workload;

    private Double report_Workload;

    private String workload_Assessor;

    private String workload_Verifier;

    private BigDecimal income;

    private String income_Remark;

    private BigDecimal expend;

    private String expend_Remark;

    private BigDecimal sales_Amount;

    private String sales_Amount_Remark;

    private BigDecimal margin;

    private Boolean isloss;

    private String commitment;

    private String remark;

    private String status;

    private BigDecimal project_Budget;

    public Integer getproject_Approval_Id() {
        return project_Approval_Id;
    }

    public void setproject_Approval_Id(Integer project_Approval_Id) {
        this.project_Approval_Id = project_Approval_Id;
    }

    public String getproject_Id() {
        return project_Id;
    }

    public void setproject_Id(String project_Id) {
        this.project_Id = project_Id == null ? null : project_Id.trim();
    }

    public String getproject_Name() {
        return project_Name;
    }

    public void setproject_Name(String project_Name) {
        this.project_Name = project_Name == null ? null : project_Name.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getVacation() {
        return vacation;
    }

    public void setVacation(String vacation) {
        this.vacation = vacation == null ? null : vacation.trim();
    }

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution == null ? null : solution.trim();
    }

    public String getbusiness() {
        return business;
    }

    public void setbusiness(String business) {
        this.business = business == null ? null : business.trim();
    }

    public String getPresettime() {
        return presettime;
    }

    public void setPresettime(String presettime) {
        this.presettime = presettime;
    }

    public String getstarting_Time() {
        return starting_Time;
    }

    public void setstarting_Time(String starting_Time) {
        this.starting_Time = starting_Time;
    }

    public String getonline_Time() {
        return online_Time;
    }

    public void setonline_Time(String online_Time) {
        this.online_Time = online_Time;
    }

    public String getinitial_Test_Time() {
        return initial_Test_Time;
    }

    public void setinitial_Test_Time(String initial_Test_Time) {
        this.initial_Test_Time = initial_Test_Time;
    }

    public String getfinal_Test_Time() {
        return final_Test_Time;
    }

    public void setfinal_Test_Time(String final_Test_Time) {
        this.final_Test_Time = final_Test_Time;
    }

    public String getPm() {
        return pm;
    }

    public void setPm(String pm) {
        this.pm = pm == null ? null : pm.trim();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getworkingload_Computing() {
        return workingload_Computing;
    }

    public void setworkingload_Computing(String workingload_Computing) {
        this.workingload_Computing = workingload_Computing == null ? null : workingload_Computing.trim();
    }

    public String getimplement_Site() {
        return implement_Site;
    }

    public void setimplement_Site(String implement_Site) {
        this.implement_Site = implement_Site == null ? null : implement_Site.trim();
    }

    public Double getassess_Workload() {
        return assess_Workload;
    }

    public void setassess_Workload(Double assess_Workload) {
        this.assess_Workload = assess_Workload;
    }

    public Double getreport_Workload() {
        return report_Workload;
    }

    public void setreport_Workload(Double report_Workload) {
        this.report_Workload = report_Workload;
    }

    public String getworkload_Assessor() {
        return workload_Assessor;
    }

    public void setworkload_Assessor(String workload_Assessor) {
        this.workload_Assessor = workload_Assessor == null ? null : workload_Assessor.trim();
    }

    public String getworkload_Verifier() {
        return workload_Verifier;
    }

    public void setworkload_Verifier(String workload_Verifier) {
        this.workload_Verifier = workload_Verifier == null ? null : workload_Verifier.trim();
    }

    public BigDecimal getIncome() {
        return income;
    }

    public void setIncome(BigDecimal income) {
        this.income = income;
    }

    public String getincome_Remark() {
        return income_Remark;
    }

    public void setincome_Remark(String income_Remark) {
        this.income_Remark = income_Remark == null ? null : income_Remark.trim();
    }

    public BigDecimal getExpend() {
        return expend;
    }

    public void setExpend(BigDecimal expend) {
        this.expend = expend;
    }

    public String getexpend_Remark() {
        return expend_Remark;
    }

    public void setexpend_Remark(String expend_Remark) {
        this.expend_Remark = expend_Remark == null ? null : expend_Remark.trim();
    }

    public BigDecimal getsales_Amount() {
        return sales_Amount;
    }

    public void setsales_Amount(BigDecimal sales_Amount) {
        this.sales_Amount = sales_Amount;
    }

    public String getsales_Amount_Remark() {
        return sales_Amount_Remark;
    }

    public void setsales_Amount_Remark(String sales_Amount_Remark) {
        this.sales_Amount_Remark = sales_Amount_Remark == null ? null : sales_Amount_Remark.trim();
    }

    public BigDecimal getMargin() {
        return margin;
    }

    public void setMargin(BigDecimal margin) {
        this.margin = margin;
    }

    public Boolean getIsloss() {
        return isloss;
    }

    public void setIsloss(Boolean isloss) {
        this.isloss = isloss;
    }

    public String getCommitment() {
        return commitment;
    }

    public void setCommitment(String commitment) {
        this.commitment = commitment == null ? null : commitment.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
    public BigDecimal getproject_Budget() {
        return project_Budget;
    }

    public void setproject_Budget(BigDecimal project_Budget) {
        this.project_Budget = project_Budget;
    }

	public Integer getBusiness_Id() {
		return business_Id;
	}

	public void setBusiness_Id(Integer business_Id) {
		this.business_Id = business_Id;
	}

	public Integer getPm_Id() {
		return pm_Id;
	}

	public void setPm_Id(Integer pm_Id) {
		this.pm_Id = pm_Id;
	}

	
}