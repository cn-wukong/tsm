package com.helloword.service;

import java.util.List;

/**
 * Created by Ma on 2017/12/13 0013.
 */
public interface StorageManageService {

    /**
     * 年票入库
     * @param num 入库数量
     * @param errorNum 损坏卡号集合
     */
    void saveCard(Integer num,List<String> errorNum);

    /**
     * 年票下发
     * @param num 下发数量
     */
    String takeCard(Integer num,String name);

}
