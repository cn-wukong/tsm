package com.helloword.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Administrator on 2017/12/13.
 */
@Controller
public class LoginController {
    @GetMapping("/")
    public String logIn(){
        return "login";
    }
}