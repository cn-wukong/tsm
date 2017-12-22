package com.helloword.controller;

import com.helloword.service.TravelLoginService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.util.SavedRequest;
import org.apache.shiro.web.util.WebUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2017/12/13 0013.
 */
@Controller
public class LoginController {

    /**
     * 去登录页面
     * @return
     */
    @GetMapping("/")
    public String index() {
        Subject subject = SecurityUtils.getSubject();
        if(subject.isAuthenticated()) {
            //认为用户是要切换账号
            subject.logout();
        }
        if(!subject.isAuthenticated() && subject.isRemembered()) {
            //被记住的用户直接去登录成功页面
            return "redirect:/home";
        }
        return "login";
    }

    /**
     * 表单登录方法
     * @param mobile
     * @param password
     * @return
     */
    @PostMapping("/")
    public String login(String mobile, String password, boolean rememberMe,
                        RedirectAttributes redirectAttributes, HttpServletRequest request) {
        try {
            Subject subject = SecurityUtils.getSubject();
            UsernamePasswordToken usernamePasswordToken =
                    new UsernamePasswordToken(mobile,password,rememberMe);
            subject.login(usernamePasswordToken);

            //跳转到登录前访问的URL
            String url = "/home";
            SavedRequest savedRequest = WebUtils.getSavedRequest(request);
            if(savedRequest != null) {
                //获取登录前访问的URL
                url = savedRequest.getRequestUrl();
            }
            //登录成功，记录日志

            return "redirect:"+url;
        } catch (AuthenticationException ex) {
            redirectAttributes.addFlashAttribute("message","账号或密码错误");
            return "redirect:/";
        }
    }

    /**
     * 去登录后的页面
     * @return
     */
    @GetMapping("/home")
    public String home() {
        return "home";
    }

}
