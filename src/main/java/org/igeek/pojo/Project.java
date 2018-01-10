package org.igeek.pojo;

public class Project {
    private String project_Id;

    private Integer project_Approval_Id;

    private String project_Name;

    private String company;

    private Integer project_Status;

    private Integer project_Progress;

    private Integer pm_Id;
    
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

    public Integer getproject_Approval_Id() {
        return project_Approval_Id;
    }

    public void setproject_Approval_Id(Integer project_Approval_Id) {
        this.project_Approval_Id = project_Approval_Id;
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
        this.project_Status = project_Status == null ? null : project_Status;
    }

    public Integer getproject_Progress() {
        return project_Progress;
    }

    public void setproject_Progress(Integer project_Progress) {
        this.project_Progress = project_Progress;
    }

    public Integer getPm() {
        return pm_Id;
    }

    public void setPm(Integer pm_Id) {
        this.pm_Id = pm_Id == null ? null : pm_Id;
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

	public String getConfig_server_path() {
		return config_server_path;
	}

	public void setConfig_server_path(String config_server_path) {
		this.config_server_path = config_server_path;
	}

	public String getConfig_server_type() {
		return config_server_type;
	}

	public void setConfig_server_type(String config_server_type) {
		this.config_server_type = config_server_type;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}