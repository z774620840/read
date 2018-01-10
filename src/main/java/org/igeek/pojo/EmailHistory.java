package org.igeek.pojo;
import java.util.Date;

public class EmailHistory {
    private Integer email_Id;

    private Integer sender_Id;

    private Integer receiver_Id;

    private String title;

    private String email_Accessory;

    private Date send_Date;

    private String content;

    public Integer getemail_Id() {
        return email_Id;
    }

    public void setemail_Id(Integer email_Id) {
        this.email_Id = email_Id;
    }

    public Integer getsender_Id() {
        return sender_Id;
    }

    public void setsender_Id(Integer sender_Id) {
        this.sender_Id = sender_Id;
    }

    public Integer getreceiver_Id() {
        return receiver_Id;
    }

    public void setreceiver_Id(Integer receiver_Id) {
        this.receiver_Id = receiver_Id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getemail_Accessory() {
        return email_Accessory;
    }

    public void setemail_Accessory(String email_Accessory) {
        this.email_Accessory = email_Accessory == null ? null : email_Accessory.trim();
    }

    public Date getsend_Date() {
        return send_Date;
    }

    public void setsend_Date(Date send_Date) {
        this.send_Date = send_Date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}