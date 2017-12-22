package com.helloword.service;

import com.helloword.entity.*;

import java.util.List;

public interface HomeService {
    /**
     * 查询所有的景区
     * @return
     */
    List<Scenic> findAllScenic();

    String getUploadToken();

    void saveScenic(Scenic scenic, ScenicAccount scenicAccount);

    Scenic findScenicById(int scenicId);

    List<Shop> findAllShop();

    void createShop(ShopAccount shopAccount, Shop shop);

    List<Account> findAllTravelAccount();

    Shop findShopByShopId(Integer shopId);

    Shop findShopByPhone(String shopPhone);

    /**
     * 张
     * @param phone
     * @return
     */
    Shop findBuPhone(Integer phone);
}
