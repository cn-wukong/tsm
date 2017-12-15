package com.helloword.service;

import com.helloword.entity.Scenic;

import java.util.List;

public interface HomeService {
    /**
     * 查询所有的景区
     * @return
     */
    List<Scenic> findAllScenic();
}
