package org.igeek.pojo;

import java.sql.Date;

public class ViewAccountApply {
	private Integer user_Id;
	private String username;
	private Integer userType;
	private Integer client_Id;
	private String client_Name;
	private String client_Company;
	private String client_Email;
	private Integer pass_status;
	private String reason;
	private Boolean isForbidden;

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	private Date application_time;

	public Date getApplication_time() {
		return application_time;
	}

	public void setApplication_time(Date application_time) {
		this.application_time = application_time;
	}

	public Integer getUser_Id() {
		return user_Id;
	}

	public void setUser_Id(Integer user_Id) {
		this.user_Id = user_Id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getUserType() {
		return userType;
	}

	public void setUserType(Integer userType) {
		this.userType = userType;
	}

	public Integer getClient_Id() {
		return client_Id;
	}

	public void setClient_Id(Integer client_Id) {
		this.client_Id = client_Id;
	}

	public String getClient_Name() {
		return client_Name;
	}

	public void setClient_Name(String client_Name) {
		this.client_Name = client_Name;
	}

	public String getClient_Company() {
		return client_Company;
	}

	public void setClient_Company(String client_Company) {
		this.client_Company = client_Company;
	}

	public String getClient_Email() {
		return client_Email;
	}

	public void setClient_Email(String client_Email) {
		this.client_Email = client_Email;
	}

	public Integer getPass_status() {
		return pass_status;
	}

	public void setPass_status(Integer pass_status) {
		this.pass_status = pass_status;
	}

	public Boolean getIsForbidden() {
		return isForbidden;
	}

	public void setIsForbidden(Boolean isForbidden) {
		this.isForbidden = isForbidden;
	}

}
