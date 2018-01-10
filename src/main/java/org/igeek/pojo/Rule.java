package org.igeek.pojo;

import java.io.Serializable;

public class Rule implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -4653821160600126196L;

	private Integer rule_Id;

    private String rule_Name;

    private String url;

    private String category;

    public Integer getRule_Id() {
        return rule_Id;
    }

    public void setRule_Id(Integer rule_Id) {
        this.rule_Id = rule_Id;
    }

    public String getrule_Name() {
        return rule_Name;
    }

    public void setrule_Name(String rule_Name) {
        this.rule_Name = rule_Name == null ? null : rule_Name.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }
}