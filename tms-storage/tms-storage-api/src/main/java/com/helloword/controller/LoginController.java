package com.helloword.controller;

import com.helloword.entity.Card;
import com.helloword.entity.Shop;
import com.helloword.service.HomeService;
import com.helloword.service.StorageManageService;
import com.helloword.service.TravelLoginService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.util.SavedRequest;
import org.apache.shiro.web.util.WebUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Administrator on 2017/12/13.
 */
@Controller
public class LoginController {

    @Autowired
    private TravelLoginService travelLoginService;

    @Autowired
    private StorageManageService storageManageService;

    @Autowired
    private HomeService homeService;


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
            return "redirect:/index";
        }
        return "login";
    }

    /**
     * 表单登录方法
     * @param account
     * @param password
     * @return
     */
    @PostMapping("/")
    public String login(String account, String password, boolean rememberMe,
                        RedirectAttributes redirectAttributes, HttpServletRequest request) {
        try {
            Subject subject = SecurityUtils.getSubject();
            UsernamePasswordToken usernamePasswordToken =
                    new UsernamePasswordToken(account,password,rememberMe);
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
            ex.printStackTrace();
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

    /**
     * 年票入库
     * @return
     */
    @GetMapping("/card/save")
    public String cardSave(Model model) {
        String cardLastNum = storageManageService.findLast();
        model.addAttribute("cardLastNum",cardLastNum);
        return "cardsave";
    }

    /**
     *
     * @param startNum 开始卡号
     * @param num  入库数量
     * @param storageNum 年卡报废卡号
     * @return
     */
    @PostMapping("/card/save/now")
    public String cardSavaStorage(String startNum,Integer num,String storageNum,Model model){
        List<String> stringList = storageManageService.storageNumList(storageNum);
        String cardNum = storageManageService.saveCard(startNum,num,stringList);

        //库存总数
        Integer total = storageManageService.stockCard();

        //作废卡集合
        List<Card> invalidateCard = storageManageService.invalidateCardNum();

        //作废卡总数
        String invalidate = storageManageService.invalidate().toString();
        //可用卡总数
        Integer invalidateInt = storageManageService.invalidate();
        Integer normalCard  = total - invalidateInt;
        model.addAttribute("total",total);
        model.addAttribute("invalidate",invalidate);
        model.addAttribute("invalidateCard",invalidateCard);
        model.addAttribute("normalCard",normalCard);
        return "/cardnotdown";
    }


    /**
     *未下发年票
     * @param model
     * @return 库存信息
     */
    @GetMapping("/card/not/down/")
    public String cardNotSell(Model model){
        //库存总数
        Integer total = storageManageService.stockCard();

        //作废卡集合
        List<Card> invalidateCardList = storageManageService.invalidateCardNum();

        //作废卡总数
        String invalidate = storageManageService.invalidate().toString();

        //Integer类型的作废卡总数
        Integer invalidateInt = storageManageService.invalidate();
        //可用卡总数
        Integer normalCard  = total - invalidateInt;
        model.addAttribute("total",total);
        model.addAttribute("invalidate",invalidate);
        model.addAttribute("invalidateCard",invalidateCardList);
        model.addAttribute("normalCard",normalCard);
        return "cardnotdown";
    }

    /**
     * 年票下发
     * @return
     */
    @GetMapping("/card/grant")
    public String cardGrant(Model model) {

       Integer stockTotal =  storageManageService.stockCard();
       Integer invalidateTotal = storageManageService.invalidate();
       Integer cardSell = stockTotal-invalidateTotal;
       model.addAttribute("cardSell",cardSell);
        return "cardgrant";
    }

    /**
     * 年票作废
     * @return
     */
    @GetMapping("/card/destory")
    public String cardDestory() {
        return "carddestory";
    }

    /**
     * 年票盘点统计
     * @return
     */
    @GetMapping("/card/count")
    public String cardCount() {
        return "cardcount";
    }

    /**
     * 下发年票
     * @return
     */
    @GetMapping("/card/sell")
    public String cardsell(Model model,String startNum){
        model.addAttribute("cardSell",startNum);
        return "/cardgrant";
    }

    @GetMapping("/card/person")
    public String cardSellPerson(Model model,String person){

       int phone =  person.indexOf(person);
       Integer p = phone;
        Shop shop =  homeService.findShopByShopId(1);
//       Shop shop = homeService.findShopByPhone(person);
//        Shop shop = homeService.findBuPhone(p);
//        System.out.println("-------"+shop.getAddress());
        model.addAttribute("shop",shop);
        return "/cardgrant";
    }
}