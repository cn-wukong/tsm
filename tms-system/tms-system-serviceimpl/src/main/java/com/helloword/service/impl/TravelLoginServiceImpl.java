package com.helloword.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.helloword.entity.Account;
import com.helloword.entity.AccountExample;
import com.helloword.entity.Role;
import com.helloword.mapper.AccountMapper;
import com.helloword.mapper.RoleMapper;
import com.helloword.service.TravelLoginService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


/**
 * lijing
 */
@Service
public class TravelLoginServiceImpl implements TravelLoginService{
    @Autowired
    AccountMapper accountMapper;
    @Autowired
    RoleMapper roleMapper;
    /**
     * 根据登录对象来查找 该对象的所有角色
     * @param account 登录对象
     * @return 角色集合
     */
    @Override
    public List<Role> findRowByTravel(Account account) {
        //根据Account的ID来查找对应的所有对象
        List<Role> roleList = roleMapper.findAllRoleByAccountId(account.getId());
        return roleList;
    }
    /**
     * 根据登录账户来查找具体的对象
     * @param mobile
     * @return 对象
     */
    @Override
    public Account findTravelByAccount(String mobile) {
        AccountExample accountExample = new AccountExample();
        accountExample.createCriteria().andAccountMobileEqualTo(mobile);
        List<Account> accountList = accountMapper.selectByExample(accountExample);
        if(accountList!=null&&!accountList.isEmpty()){
            return accountList.get(0);
        }
        return null;
    }
}
