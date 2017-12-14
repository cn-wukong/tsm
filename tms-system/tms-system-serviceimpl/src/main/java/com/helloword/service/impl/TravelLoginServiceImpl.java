package com.helloword.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.helloword.entity.Travel;
import com.helloword.entity.TravelExample;
import com.helloword.entity.TravelRow;
import com.helloword.mapper.TravelMapper;
import com.helloword.mapper.TravelRowMapper;
import com.helloword.service.TravelLoginService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


/**
 * lijing
 */
@Service
public class TravelLoginServiceImpl implements TravelLoginService{

    @Autowired
    TravelMapper travelMapper;
    @Autowired
    TravelRowMapper travelRowMapper;



    /**
     * 根据登录对象来查找 该对象的所有角色
     * @param travel 登录对象
     * @return 角色集合
     */
    @Override
    public List<TravelRow> findRowByTravel(Travel travel) {
        //1.根据登录对象来查找对应的角色
        return travelRowMapper.selectRowByTravelKey(travel.getId());
    }

    /**
     * 根据登录账户来查找具体的对象
     * @param account 输入的账号名
     * @return 对象
     */
    @Override
    public Travel findTravelByAccount(String account) {
        TravelExample travelExample = new TravelExample();
        travelExample.createCriteria().andAccountEqualTo(account);
        List<Travel> travelList = travelMapper.selectByExample(travelExample);
        System.out.println(">>>>>>>>>>>>>>>>"+travelList);
        return travelList.get(0);
    }
}
