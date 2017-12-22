package com.helloword.service;

import com.helloword.entity.Account;
import com.helloword.entity.Role;

import java.util.List;

/**
 * Created by Administrator on 2017/12/13 0013.
 */
public interface TravelLoginService {


    /**
     * 根据登录对象来查找 该对象的所有角色
     * @param account 登录对象
     * @return 角色集合
     */
    List<Role> findRowByTravel(Account account);

    /**
     * 根据登录账户来查找具体的对象
     * @param mobile
     * @return 对象
     */
    Account findTravelByAccount(String mobile);

}
