package com.helloword.service;

import com.helloword.entity.Scenic;
import com.helloword.entity.ScenicAccount;

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
}
