package com.helloword.entity;

import java.io.Serializable;

/**
 * @author 
 */
public class TravelRowRelationshipKey implements Serializable {
    private Integer tid;

    private Integer rid;

    private static final long serialVersionUID = 1L;


    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }
}