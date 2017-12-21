package com.helloword.service;

import com.helloword.entity.Card;

import java.util.List;

/**
 * Created by Ma on 2017/12/13 0013.
 */
public interface StorageManageService {


    /**
     * 查询最后卡号
     * @return 返回起始卡号
     */
    String findLast();

    /**
     * 年票入库
     * @param num 入库数量
     * @param errorNum 损坏卡号集合
     */
    String saveCard(String startNum, Integer num,List<String> errorNum);

    /**
     * 年票下发
     * @param num 下发数量
     */
    String takeCard(Integer num,String name);

    /**
     * 年票摧毀
     * @param cardNum 作废卡号
     */
    void destoryCard(String cardNum);

    /**
     * 把作废卡号的字符串以逗号分隔
     * @param storageNum
     * @return 返回集合
     */
    List<String> storageNumList(String storageNum);

    /**
     * 返回库存中的卡数量
     * @return
     */
    Integer stockCard();

    /**
     * 作废卡号
     * @return
     */
    List<Card> invalidateCardNum();

    /**
     * 作废卡总数
     * @return
     */
    Integer invalidate();



}
