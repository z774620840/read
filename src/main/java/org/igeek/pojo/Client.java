package org.igeek.pojo;

public class Client {
	private Integer client_Id;

	private String client_Name;

	private String client_Gender;

	private String client_Phone;

	private String client_Telephone;

	private String client_Qq;

	private String client_Company;

	private String client_Email;

	public Integer getclient_Id() {
		return client_Id;
	}

	public void setclient_Id(Integer client_Id) {
		this.client_Id = client_Id;
	}

	public String getclient_Name() {
		return client_Name;
	}

	public void setclient_Name(String client_Name) {
		this.client_Name = client_Name == null ? null : client_Name.trim();
	}

	public String getclient_Gender() {
		return client_Gender;
	}

	public void setclient_Gender(String client_Gender) {
		this.client_Gender = client_Gender == null ? null : client_Gender.trim();
	}

	public String getclient_Phone() {
		return client_Phone;
	}

	public void setclient_Phone(String client_Phone) {
		this.client_Phone = client_Phone == null ? null : client_Phone.trim();
	}

	public String getclient_Telephone() {
		return client_Telephone;
	}

	public void setclient_Telephone(String client_Telephone) {
		this.client_Telephone = client_Telephone == null ? null : client_Telephone.trim();
	}

	public String getclient_Qq() {
		return client_Qq;
	}

	public void setclient_Qq(String client_Qq) {
		this.client_Qq = client_Qq == null ? null : client_Qq.trim();
	}

	public String getclient_Company() {
		return client_Company;
	}

	public void setclient_Company(String client_Company) {
		this.client_Company = client_Company == null ? null : client_Company.trim();
	}

	public String getclient_Email() {
		return client_Email;
	}

	public void setclient_Email(String client_Email) {
		this.client_Email = client_Email == null ? null : client_Email.trim();
	}
}