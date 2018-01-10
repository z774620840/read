package org.igeek.pojo;

public class Employee {
	private Integer employee_Id;

	private String employee_Name;

	private String employee_Gender;

	private String employee_Phone;

	private String employee_Telephone;

	private String employee_Qq;

	private String employee_Email;

	private Integer department_Id;

	public Integer getemployee_Id() {
		return employee_Id;
	}

	public void setemployee_Id(Integer employee_Id) {
		this.employee_Id = employee_Id;
	}

	public String getemployee_Name() {
		return employee_Name;
	}

	public void setemployee_Name(String employee_Name) {
		this.employee_Name = employee_Name == null ? null : employee_Name.trim();
	}

	public String getemployee_Gender() {
		return employee_Gender;
	}

	public void setemployee_Gender(String employee_Gender) {
		this.employee_Gender = employee_Gender == null ? null : employee_Gender.trim();
	}

	public String getemployee_Phone() {
		return employee_Phone;
	}

	public void setemployee_Phone(String employee_Phone) {
		this.employee_Phone = employee_Phone == null ? null : employee_Phone.trim();
	}

	public String getemployee_Telephone() {
		return employee_Telephone;
	}

	public void setemployee_Telephone(String employee_Telephone) {
		this.employee_Telephone = employee_Telephone == null ? null : employee_Telephone.trim();
	}

	public String getemployee_Qq() {
		return employee_Qq;
	}

	public void setemployee_Qq(String employee_Qq) {
		this.employee_Qq = employee_Qq == null ? null : employee_Qq.trim();
	}

	public String getemployee_Email() {
		return employee_Email;
	}

	public void setemployee_Email(String employee_Email) {
		this.employee_Email = employee_Email == null ? null : employee_Email.trim();
	}

	public Integer getdepartment_Id() {
		return department_Id;
	}

	public void setdepartment_Id(Integer department_Id) {
		this.department_Id = department_Id;
	}
}