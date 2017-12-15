package com.helloword.controller;

import com.helloword.entity.Scenic;
import com.helloword.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
        return "Messagecenter";
    }
    @GetMapping("/scenic/1/message")
    public String scenicMessage(Model model){
        return "scenicmessage";
    }
}
