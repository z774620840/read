package org.igeek.pojo;

import java.util.Date;

public class WebUser {
    private Integer user_id;

    private String username;

    private String password;

    private Date create_time;
  

    public Integer getuser_id() {
        return user_id;
    }

    public void setuser_id(Integer user_id) {
        this.user_id = user_id;
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

    public Date getcreate_time() {
        return create_time;
    }

    public void setcreate_time(Date create_time) {
        this.create_time = create_time;
    }

}