package com.helloword.controller;

import com.helloword.entity.Account;
import com.helloword.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/system")
public class UserAdminController {

    @Autowired
    HomeService homeService;

    @GetMapping("/user/admin")
    public String gotoUserAdmin(Model model){
        //获得所有的用户信息
        //1.旅游局管理用户
        List<Account> accountList = homeService.findAllTravelAccount();
        model.addAttribute("accountList",accountList);
        //2.综合管理用户
        //3.结算管理用户
        //4.售票用户
        return "/userAdmin/userAdmin";
    }
}
