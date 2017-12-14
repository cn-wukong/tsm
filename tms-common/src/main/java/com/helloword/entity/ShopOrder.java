package com.helloword.entity;

import java.io.Serializable;

/**
 * @author 
 */
public class ShopOrder implements Serializable {
    private Integer id;

    private String shopName;

    /**
     * 领卡数量
     */
    private Integer cardNum;

    /**
     * 缴费状态(no,yes)
     */
    private String state;

    private static final long serialVersionUID = 1L;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public Integer getCardNum() {
        return cardNum;
    }

    public void setCardNum(Integer cardNum) {
        this.cardNum = cardNum;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}