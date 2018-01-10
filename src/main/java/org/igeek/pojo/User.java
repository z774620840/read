package org.igeek.pojo;

import java.util.Date;

public class User {
    private Integer user_Id;

    private String username;

    private String password;

    private Date create_Time;

    private Boolean user_Type;

    private Integer userinfo_Id;

    private Boolean isforbidden;

    public Integer getuser_Id() {
        return user_Id;
    }

    public void setuser_Id(Integer user_Id) {
        this.user_Id = user_Id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Date getcreate_Time() {
        return create_Time;
    }

    public void setcreate_Time(Date create_Time) {
        this.create_Time = create_Time;
    }

    public Boolean getuser_Type() {
        return user_Type;
    }

    public void setuser_Type(Boolean user_Type) {
        this.user_Type = user_Type;
    }

    public Integer getuserinfo_Id() {
        return userinfo_Id;
    }

    public void setuserinfo_Id(Integer userinfo_Id) {
        this.userinfo_Id = userinfo_Id;
    }

    public Boolean getIsforbidden() {
        return isforbidden;
    }

    public void setIsforbidden(Boolean isforbidden) {
        this.isforbidden = isforbidden;
    }
}