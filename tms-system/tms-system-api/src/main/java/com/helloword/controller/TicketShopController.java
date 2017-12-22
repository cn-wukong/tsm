package com.helloword.controller;

import com.helloword.entity.Shop;
import com.helloword.entity.ShopAccount;
import com.helloword.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;
@Controller
@RequestMapping("/system")
public class TicketShopController {

    @Autowired
    private HomeService homeService;

    /**
     * 跳转的所有售票点信息页
     * @param model
     * @return
     */
    @GetMapping("/ticket/shopList")
    public String ticketShopList(Model model){
        List<Shop> shopList = homeService.findAllShop();
        model.addAttribute("shopList",shopList);
        return "/ticketShop/ticketShopList";
    }

    /**
     * 跳转到添加售票点页面
     * @return
     */
    @GetMapping("/ticketShop/add")
    public String goToTicketShop(Model model,HttpSession httpSession){
        ShopAccount shopAccount = (ShopAccount) httpSession.getAttribute("shopAccount");
        if(shopAccount!=null){
            model.addAttribute("shopAccount",shopAccount);
        }
        String token = homeService.getUploadToken();
        model.addAttribute("token",token);
        return "/ticketShop/createTicket";
    }

    /**
     * 将shopAccount对象放入session
     * @param model
     * @param shopAccount
     * @param httpSession
     * @return
     */
    @PostMapping("/ticketShop/add")
    public String addTicketShopSession(Model model,
                                       ShopAccount shopAccount,
                                       HttpSession httpSession){
        //补充创建时间和修改时间
        shopAccount.setCreateTime(new Date());
        shopAccount.setUpdateTime(new Date());
        httpSession.setAttribute("shopAccount",shopAccount);
        return "redirect:/system/ticketShop/create";
    }

    /**
     * 跳转到填写售票点信息页
     * @param model
     * @return
     */
    @GetMapping("/ticketShop/create")
    public String createTicket(Model model,HttpSession httpSession,RedirectAttributes redirectAttributes){
        ShopAccount shopAccount = (ShopAccount) httpSession.getAttribute("shopAccount");
        String token = homeService.getUploadToken();
        model.addAttribute("token",token);
        if(shopAccount==null){
            redirectAttributes.addFlashAttribute("message","请先注册售票点用户信息!!");
            return "redirect:/system/ticketShop/add";
        }
        return "/ticketShop/addTicketShopMessage";
    }

    /**
     * 向数据库添加 shop 和 shopAccount 信息
     * @param shop
     * @param httpSession
     * @param redirectAttributes
     * @return
     */
    @PostMapping("/ticketShop/create")
    public String createTicketShop(Shop shop, HttpSession httpSession, RedirectAttributes redirectAttributes){
        //1. 获取session中的shopAccount数据
        ShopAccount shopAccount = (ShopAccount) httpSession.getAttribute("shopAccount");
        //3. 补充shop对象的信息
        shop.setCreateTime(new Date());
        homeService.createShop(shopAccount,shop);
        redirectAttributes.addFlashAttribute("message","添加成功!");

        httpSession.removeAttribute("shopAccount");
        return "redirect:/system/ticket/shopList";
    }
    @PostMapping("/ticket/kill/session")
    public void killSession(HttpSession httpSession){
        httpSession.removeAttribute("shopAccount");
    }

}
