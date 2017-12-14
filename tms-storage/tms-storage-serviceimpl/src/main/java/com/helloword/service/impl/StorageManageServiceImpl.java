package com.helloword.service.impl;

import com.github.pagehelper.PageHelper;
import com.helloword.entity.Card;
import com.helloword.entity.CardExample;
import com.helloword.mapper.CardMapper;
import com.helloword.service.StorageManageService;
import org.apache.commons.lang3.StringUtils;
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

    public void saveCard(Integer num,List<String> errorNum) {

        List<String> numList = new ArrayList<String>();
        //从数据库中获取最后一条数据
        Card card = cardMapper.findLast();

        if(card == null) {
            int n = 0;
            //0000001
            for(int i = 0;i<num;i++) {
                n++;
                String value = Integer.toString(n);
                StringBuilder stringBuilder = new StringBuilder();
                for(int j = 0;j<(7-Integer.toString(n).length());j++) {
                    stringBuilder.append("0");
                }
                value = stringBuilder+value;
                numList.add(value);

            }
        }else{
            int n = Integer.parseInt(card.getCardNum());
            for(int i = 0;i<num;i++) {
                n++;
                String value = Integer.toString(n);
                StringBuilder stringBuilder = new StringBuilder();
                for(int j = 0;j<(7-Integer.toString(n).length());j++) {
                    stringBuilder.append("0");
                }
                value = stringBuilder+value;
                numList.add(value);
            }
        }
        //调用cardMapper中自定义多条插入
        cardMapper.saveMuch(numList);

        if(errorNum != null) {
            for(String str : numList) {
                int n = Integer.parseInt(str);
                for(int i = 0;i<num;i++) {
                    n++;
                    String value = Integer.toString(n);
                    StringBuilder stringBuilder = new StringBuilder();
                    for(int j = 0;j<(7-Integer.toString(n).length());j++) {
                        stringBuilder.append("0");
                    }
                    value = stringBuilder+value;
                    CardExample cardExample = new CardExample();
                    cardExample.createCriteria().andCardNumEqualTo(value);
                    Card card1 = (Card) cardMapper.selectByExample(cardExample);
                    //损坏卡
                    card1.setState("非正常");
                }

            }
        }

    }


}
