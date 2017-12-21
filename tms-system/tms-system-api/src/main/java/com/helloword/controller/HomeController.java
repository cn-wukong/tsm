package com.helloword.controller;

import com.helloword.entity.Scenic;
import com.helloword.entity.ScenicAccount;
import com.helloword.service.HomeService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpSession;
import java.io.FileInputStream;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/system")
public class HomeController {

    @Autowired
    private HomeService homeService;


    /**
     * 获取所有的景区信息
     * @return
     */
    @GetMapping("/scenic")
    public String scenic(Model model){
        //查询所有景区的信息  以及负责人信息
        List<Scenic> scenicList = homeService.findAllScenic();
        model.addAttribute("scenicList",scenicList);
        return "scenicList";
    }

    /**
     * 跳转到景区账户注册页面
     * @param model
     * @return
     */
    @GetMapping("/scenic/account/add")
    public String addScenicAccountPage(Model model,HttpSession httpSession){
        //情况一 当注册过景区用户但是在填写景区用户时中途退出了
        //情况二 未进行过景区注册
        ScenicAccount scenicAccount = (ScenicAccount) httpSession.getAttribute("scenicAccount");
        //判断是否进行过注册景区注册
        if(scenicAccount!=null) {
            model.addAttribute("scenicAccount",scenicAccount);
        }
        return "createScenicAccount";
    }

    /**
     * 新建景区信息 而后跳转到景区详细信息添加的页面
     * @return
     */
    @PostMapping("/scenic/account/add")
    public String createScenicAccount(ScenicAccount scenicAccount,HttpSession session){
        //封装景区信息对象
        scenicAccount.setCreateTime(new Date());
        scenicAccount.setUpdateTime(new Date());
        //将对象添加到session中暂时存储
        session.setAttribute("scenicAccount",scenicAccount);
        return "redirect:/system/scenic/add";
    }

    /**
     * 跳转到景区详细信息添加页面
     * @return
     */
    @GetMapping("/scenic/add")
    public String addScenic(HttpSession sessoion, RedirectAttributes redirectAttributes,Model model){
        ScenicAccount scenicAccount = (ScenicAccount) sessoion.getAttribute("scenicAccount");
        if(scenicAccount==null){
            redirectAttributes.addFlashAttribute("message","请先注册景区账户!!");
            return "redirect:/system/scenic/account/add";
        }else{
            //获取上传凭证
            String token = homeService.getUploadToken();
            model.addAttribute("token",token);
            return "scenicmessage";
        }
    }

    /**
     * 景区详细信息表单提交
     * @return
     */
    @PostMapping("/scenic/add")
    public String createScenic(Scenic scenic,HttpSession httpSession,RedirectAttributes redirectAttributes){
        //1.获取session中的对象
        ScenicAccount scenicAccount = (ScenicAccount) httpSession.getAttribute("scenicAccount");

        //2.补全scenic scenicAccount对象
        homeService.saveScenic(scenic,scenicAccount);
        redirectAttributes.addFlashAttribute("message","创建景区信息完毕!!");
        httpSession.removeAttribute("scenicAccount");
        return "redirect:/system/scenic";
    }
    @PostMapping("/scenic/photo")
    @ResponseBody
    public String uploadPhoto(){

        return "";
    }

    /**
     * 删除session中的scenic半成品
     * @param httpSession
     */
    @PostMapping("/kill/session")
    @ResponseBody
    public void killSession(HttpSession httpSession){
        httpSession.removeAttribute("scenicAccount");
    }
    @GetMapping("/scenic/allMessage/{scenicId}")
    public String scenicAllMessage(@PathVariable int scenicId, Model model){
        //查询详细景区信息
        Scenic scenic = homeService.findScenicById(scenicId);
        model.addAttribute("scenic",scenic);
        return "scenicAllMessage";
    }
}
