package org.igeek.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Contract {
    private Integer contract_Id;

    private String contract_Name;

    private String contract_Accessory;

    private String project_Id;

    private BigDecimal money;

    private Date contract_Date;

    public Integer getcontract_Id() {
        return contract_Id;
    }

    public void setcontract_Id(Integer contract_Id) {
        this.contract_Id = contract_Id;
    }

    public String getcontract_Name() {
        return contract_Name;
    }

    public void setcontract_Name(String contract_Name) {
        this.contract_Name = contract_Name == null ? null : contract_Name.trim();
    }

    public String getcontract_Accessory() {
        return contract_Accessory;
    }

    public void setcontract_Accessory(String contract_Accessory) {
        this.contract_Accessory = contract_Accessory == null ? null : contract_Accessory.trim();
    }

    public String getproject_Id() {
        return project_Id;
    }

    public void setproject_Id(String project_Id) {
        this.project_Id = project_Id == null ? null : project_Id.trim();
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public Date getcontract_Date() {
        return contract_Date;
    }

    public void setcontract_Date(Date contract_Date) {
        this.contract_Date = contract_Date;
    }
}