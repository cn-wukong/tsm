package com.helloword.entity;

import java.util.Date;

public class LogShop {
    private Integer id;

    private String logIp;

    private Date logTime;

    private Integer shopAccountid;

    private String spare;

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

    public Integer getShopAccountid() {
        return shopAccountid;
    }

    public void setShopAccountid(Integer shopAccountid) {
        this.shopAccountid = shopAccountid;
    }

    public String getSpare() {
        return spare;
    }

    public void setSpare(String spare) {
        this.spare = spare;
    }
}