package com.helloword.entity;

import java.io.Serializable;

/**
 * @author 
 */
public class TravelRow implements Serializable {
    private Integer id;

    private String roleName;

    private static final long serialVersionUID = 1L;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}