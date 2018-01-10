package org.igeek.pojo;

public class Department {
    private Integer department_Id;

    private String department_Name;

    public Integer getdepartment_Id() {
        return department_Id;
    }

    public void setdepartment_Id(Integer department_Id) {
        this.department_Id = department_Id;
    }

    public String getdepartment_Name() {
        return department_Name;
    }

    public void setdepartment_Name(String department_Name) {
        this.department_Name = department_Name == null ? null : department_Name.trim();
    }
}