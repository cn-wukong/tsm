package com.helloword.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class LogScenic implements Serializable {
    private Integer id;

    private String logIp;

    private Date logTime;

    private Integer scenicAccountid;

    private String spare;

    private static final long serialVersionUID = 1L;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogIp() {
        return logIp;
    }

    public void setLogIp(String logIp) {
        this.logIp = logIp;
    }

    public Date getLogTime() {
        return logTime;
    }

    public void setLogTime(Date logTime) {
        this.logTime = logTime;
    }

    public Integer getScenicAccountid() {
        return scenicAccountid;
    }

    public void setScenicAccountid(Integer scenicAccountid) {
        this.scenicAccountid = scenicAccountid;
    }

    public String getSpare() {
        return spare;
    }

    public void setSpare(String spare) {
        this.spare = spare;
    }
}