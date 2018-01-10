package org.igeek.pojo;

public class ViewProjectCollect {
    private String project_Id;

    private String project_Name;

    private String company;

    private Integer project_Status;

    private Integer project_Progress;

    private String department;

    private Integer progress_Status;

    private Integer weekly_Report_Id;

    private Integer progress;

    private String business;

    private String pm;
    
    private String value;//业务价值
    
    private String technology;//重点技术
    
    private String mode;//开发模式
    
    private String learning_Opportunity;//学习机会

    private String difficulty;//开发难度

	private String difficulty_remark;//难度说明
    
    private String config_server_type;//配置服务器类型
    
    private String config_server_path;//配置服务器映射
    
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

    public Integer getproject_Status() {
        return project_Status;
    }

    public void setproject_Status(Integer project_Status) {
        this.project_Status = project_Status;
    }

    public Integer getproject_Progress() {
        return project_Progress;
    }

    public void setproject_Progress(Integer project_Progress) {
        this.project_Progress = project_Progress;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public Integer getprogress_Status() {
        return progress_Status;
    }

    public void setprogress_Status(Integer progress_Status) {
        this.progress_Status = progress_Status;
    }

    public Integer getweekly_Report_Id() {
        return weekly_Report_Id;
    }

    public void setweekly_Report_Id(Integer weekly_Report_Id) {
        this.weekly_Report_Id = weekly_Report_Id;
    }

    public Integer getProgress() {
        return progress;
    }

    public void setProgress(Integer progress) {
        this.progress = progress;
    }

    public String getBusiness() {
        return business;
    }

    public void setBusiness(String business) {
        this.business = business == null ? null : business.trim();
    }

    public String getPm() {
        return pm;
    }

    public void setPm(String pm) {
        this.pm = pm == null ? null : pm.trim();
    }

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getLearning_Opportunity() {
		return learning_Opportunity;
	}

	public void setLearning_Opportunity(String learning_Opportunity) {
		this.learning_Opportunity = learning_Opportunity;
	}
	public String getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
	}

	public String getDifficulty_remark() {
		return difficulty_remark;
	}

	public void setDifficulty_remark(String difficulty_remark) {
		this.difficulty_remark = difficulty_remark;
	}

	public String getConfig_server_type() {
		return config_server_type;
	}

	public void setConfig_server_type(String config_server_type) {
		this.config_server_type = config_server_type;
	}

	public String getConfig_server_path() {
		return config_server_path;
	}

	public void setConfig_server_path(String config_server_path) {
		this.config_server_path = config_server_path;
	}
}