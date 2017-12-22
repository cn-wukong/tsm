package com.helloword.auth;

import com.helloword.entity.Account;
import com.helloword.entity.Role;
import com.helloword.service.TravelLoginService;
import com.sun.rowset.internal.Row;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ShiroRealm extends AuthorizingRealm {

    @Autowired
    TravelLoginService travelLoginService;

    /**
     * 角色或权限认证使用
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        //获取当前登录的对象
        Account account = (Account) principalCollection.getPrimaryPrincipal();
        //根据登录的对象获取该对象的所有角色
        List<Role> travelRows = travelLoginService.findRowByTravel(account);

        //获取Role集合中的名称，创建字符串列表
        List<String> roleNameList = new ArrayList<>();
        for(Role role : travelRows) {
            roleNameList.add(role.getRoleName());
        }
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();

        simpleAuthorizationInfo.addRoles(roleNameList);
        return simpleAuthorizationInfo;
    }


    /**
     * 登录认证使用
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken) authenticationToken;
        String account = usernamePasswordToken.getUsername();
        System.out.println(account);
        Account acc = travelLoginService.findTravelByAccount(account);
        if(account != null) {
            return new SimpleAuthenticationInfo(acc,acc.getAccountPassword(),getName());
        }
        return null;
    }
}