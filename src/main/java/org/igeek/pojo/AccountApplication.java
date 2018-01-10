package org.igeek.pojo;

import java.util.Date;

public class AccountApplication {
    private Integer account_Application_Id;

    private Integer client_Id;

    private Integer proposer_Id;

    private String reason;

    private String pass_Status;

    private Date application_Time;

    public Integer getaccount_Application_Id() {
        return account_Application_Id;
    }

    public void setaccount_Application_Id(Integer account_Application_Id) {
        this.account_Application_Id = account_Application_Id;
    }

    public Integer getclient_Id() {
        return client_Id;
    }

    public void setclient_Id(Integer client_Id) {
        this.client_Id = client_Id;
    }

    public Integer getproposer_Id() {
        return proposer_Id;
    }

    public void setproposer_Id(Integer proposer_Id) {
        this.proposer_Id = proposer_Id;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public String getpass_Status() {
        return pass_Status;
    }

    public void setpass_Status(String pass_Status) {
        this.pass_Status = pass_Status == null ? null : pass_Status.trim();
    }

    public Date getapplication_Time() {
        return application_Time;
    }

    public void setapplication_Time(Date application_Time) {
        this.application_Time = application_Time;
    }
}