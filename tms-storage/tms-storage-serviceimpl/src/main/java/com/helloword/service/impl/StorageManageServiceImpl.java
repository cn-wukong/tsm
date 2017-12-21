package com.helloword.service.impl;

import com.helloword.entity.Card;
import com.helloword.entity.CardExample;
import com.helloword.exception.CardException;
import com.helloword.mapper.CardMapper;
import com.helloword.service.StorageManageService;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.jdbc.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Administrator on 2017/12/13 0013.
 */
@Service
public class StorageManageServiceImpl implements StorageManageService {

    @Autowired
    private CardMapper cardMapper;

    /**
     * 查询最后卡号
     * @return 返回起始卡号
     */
    @Override
    public String findLast() {
        Card card = cardMapper.findLast();
        if(card == null) {
            return "0000001";
        }else{

            int n = Integer.parseInt(card.getCardNum())+1;
            String value = Integer.toString(n);

            StringBuilder stringBuilder = new StringBuilder();
            for(int j = 0;j<(7-Integer.toString(n).length());j++) {
                stringBuilder.append("0");
            }
            value = stringBuilder+value;
            return value;
        }
    }

    /**
     * 年票入库
     * @param num 入库数量
     * @param errorNum 损坏卡号集合
     * @return 返回入库卡号段
     */
    @Override
    public String saveCard(String startNum, Integer num, List<String> errorNum) {

        int base = 0;
        List<Card> numList = new ArrayList<Card>();
        //startNum = 00002;
        int n = Integer.parseInt(startNum); //2
        for(int i = 0;i<num;i++) {
            base =1;
            Card card = new Card();
            String value = Integer.toString(n);
            StringBuilder stringBuilder = new StringBuilder();

            for(int j = 0;j<(7-Integer.toString(n).length());j++) {
                stringBuilder.append("0");
            }
            value = stringBuilder+value;
            if(errorNum!= null){
                for(int er = 0;er<errorNum.size();er++){
                    String erronums = errorNum.get(er);
                    if(erronums.equals(value)){

                        card.setCardNum(value);
                        card.setState("非正常");
                        base = 2;
                        break;
                    }

                }
            }

            if(base == 1){
                card.setCardNum(value);
                card.setState(null);
            }

            numList.add(card);
            n++;
        }

        //调用cardMapper中自定义多条插入
        cardMapper.saveMuch(numList);

//        if(errorNum != null) {
//            for(String str : errorNum) {
//                CardExample cardExample = new CardExample();
//                cardExample.createCriteria().andCardNumEqualTo(str);
//                List<Card> cardList = cardMapper.selectByExample(cardExample);
//                if(cardList == null) {
//                    throw new CardException("该卡不存在");
//                }else{
//                    Card card = cardList.get(0);
//                    card.setState("非正常");
//                    cardMapper.updateByPrimaryKey(card);
//                }
//            }
//        }
        //返回入库卡号段
        String round = startNum+"~"+cardMapper.findLast().getCardNum();
        return round;
    }

    /**
     * 年卡下发
     * @param num 下发数量
     * @param shopName 售票点名称
     * @return 领卡 id段
     */
    @Override
    public String takeCard(Integer num,String shopName) {
        //查询t_card下 takeBy 为null 的 order by id asc limit 1 的id
        Card card = cardMapper.getFirstNull();
        String beginId = card.getId().toString();

        String endId = beginId+(num - 1);

        cardMapper.updateTakeBy(shopName,beginId,endId);

        //下发卡号id段
        String round = beginId+"-"+endId;

        //添加一条card_order订单信息

        return round;
    }

    //作废年卡
    @Override
    public void destoryCard(String cardNum) {
        CardExample cardExample = new CardExample();
        cardExample.createCriteria().andCardNumEqualTo(cardNum);
        List<Card> cardList = cardMapper.selectByExample(cardExample);

        if(cardList == null) {
            throw new CardException("该卡号不存在");
        }

        Card card = cardList.get(0);

        if("非正常".equals(card.getState())) {
            throw new CardException("该卡属于作废状态");
        } else if(StringUtils.isNotEmpty(card.getState())) {
            throw new CardException("操作异常,该卡不能作废");
        }

        card.setState("非正常");
        cardMapper.updateByPrimaryKey(card);

    }

    /**
     * 把作废卡号的字符串以逗号分隔
     * @param storageNum
     * @return 返回集合
     */
    @Override
    public List<String> storageNumList(String storageNum) {
        List<String> stringList = new ArrayList<String>();
        if(!storageNum.isEmpty()&&storageNum!=null){

            String [] strings = storageNum.split(",");
            System.out.println(strings.toString());
            for(String cardNumFei : strings){
                stringList.add(cardNumFei);
            }
        }else{
            return null;
        }
        return stringList;
    }

    /**
     * 返回库存中的卡数量
     *
     * @return
     */
    @Override
    public Integer stockCard() {
        Integer invalidateCard = cardMapper.cardTotalNum();
        return invalidateCard;
    }

    /**
     * 作废卡号
     *
     * @return
     */
    @Override
    public List<Card> invalidateCardNum() {
        List<Card> invalidateList = cardMapper.cardInvalidateList();
        return invalidateList;
    }

    /**
     * 作废卡总数
     * @return
     */
    @Override
    public Integer invalidate(){
        return invalidateCardNum().size();
    }


}
