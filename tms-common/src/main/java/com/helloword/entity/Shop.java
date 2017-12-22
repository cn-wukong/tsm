package com.helloword.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class Shop implements Serializable {
    private Integer id;

    private String name;

    private String photo;

    private Date createTime;

    private String address;

    private String idcard;

    private Integer shopAccountid;

    private static final long serialVersionUID = 1L;

    private ShopAccount shopAccount;

    public ShopAccount getShopAccount() {
        return shopAccount;
    }

    public void setShopAccount(ShopAccount shopAccount) {
        this.shopAccount = shopAccount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public Integer getShopAccountid() {
        return shopAccountid;
    }

    public void setShopAccountid(Integer shopAccountid) {
        this.shopAccountid = shopAccountid;
    }
}