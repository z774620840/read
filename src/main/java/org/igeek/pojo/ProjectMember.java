package org.igeek.pojo;

public class ProjectMember {
	private Integer project_Member_Id;
	private Integer user_Id;
	private Integer project_Id;
	private String duty;

	public Integer getProject_Member_Id() {
		return project_Member_Id;
	}

	public void setProject_Member_Id(Integer project_Member_Id) {
		this.project_Member_Id = project_Member_Id;
	}

	public Integer getUser_Id() {
		return user_Id;
	}

	public void setUser_Id(Integer user_Id) {
		this.user_Id = user_Id;
	}

	public Integer getProject_Id() {
		return project_Id;
	}

	public void setProject_Id(Integer project_Id) {
		this.project_Id = project_Id;
	}

	public String getDuty() {
		return duty;
	}

	public void setDuty(String duty) {
		this.duty = duty;
	}

}
