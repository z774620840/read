package org.igeek.pojo;

import java.util.Date;

public class PersonalMatter {
    private Integer personal_Matter_Id;

    private String matter_Title;

    private String current;

    private String sender;

    private String type;

    private Date receipt_Time;

    private Integer employee_Id;

    private Boolean isdone;

    private Boolean isread;

    private String matter_Content;

    public Integer getpersonal_Matter_Id() {
        return personal_Matter_Id;
    }

    public void setpersonal_Matter_Id(Integer personal_Matter_Id) {
        this.personal_Matter_Id = personal_Matter_Id;
    }

    public String getmatter_Title() {
        return matter_Title;
    }

    public void setmatter_Title(String matter_Title) {
        this.matter_Title = matter_Title == null ? null : matter_Title.trim();
    }

    public String getCurrent() {
        return current;
    }

    public void setCurrent(String current) {
        this.current = current == null ? null : current.trim();
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender == null ? null : sender.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Date getreceipt_Time() {
        return receipt_Time;
    }

    public void setreceipt_Time(Date receipt_Time) {
        this.receipt_Time = receipt_Time;
    }

    public Integer getemployee_Id() {
        return employee_Id;
    }

    public void setemployee_Id(Integer employee_Id) {
        this.employee_Id = employee_Id;
    }

    public Boolean getIsdone() {
        return isdone;
    }

    public void setIsdone(Boolean isdone) {
        this.isdone = isdone;
    }

    public Boolean getIsread() {
        return isread;
    }

    public void setIsread(Boolean isread) {
        this.isread = isread;
    }

    public String getmatter_Content() {
        return matter_Content;
    }

    public void setmatter_Content(String matter_Content) {
        this.matter_Content = matter_Content == null ? null : matter_Content.trim();
    }
}