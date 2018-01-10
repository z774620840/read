package org.igeek.pojo;

public class UserRole {
    private Integer id;

    private Integer user_Id;

    private Integer role_Id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getuser_Id() {
        return user_Id;
    }

    public void setuser_Id(Integer user_Id) {
        this.user_Id = user_Id;
    }

    public Integer getrole_Id() {
        return role_Id;
    }

    public void setrole_Id(Integer role_Id) {
        this.role_Id = role_Id;
    }
}