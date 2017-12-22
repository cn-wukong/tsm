package com.helloword.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/system")
public class UserAdminController {
    @GetMapping("/user/admin")
    public String gotoUserAdmin(){
        //获得所有的用户信息
        //1.旅游局管理用户
        //2.综合管理用户
        //3.结算管理用户
        //4.售票用户
        return "/userAdmin/userAdmin";
    }
}
