package org.igeek.pojo;

import java.io.Serializable;

public class Role implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 8271029761260165880L;

	private Integer role_Id;

    private String role_Name;

    private String rule_Ids;

    public Integer getRole_Id() {
        return role_Id;
    }

    public void setRole_Id(Integer role_Id) {
        this.role_Id = role_Id;
    }

    public String getrole_Name() {
        return role_Name;
    }

    public void setrole_Name(String role_Name) {
        this.role_Name = role_Name == null ? null : role_Name.trim();
    }

    public String getrule_Ids() {
        return rule_Ids;
    }

    public void setrule_Ids(String rule_Ids) {
        this.rule_Ids = rule_Ids == null ? null : rule_Ids.trim();
    }
}