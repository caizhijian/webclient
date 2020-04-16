package com.czj.modules.cas.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @Author caizhijian
 * @create 2020/4/14
 */
@Controller
@RequestMapping("/cas")
public class CASController {


    /**
     * 退出
     * @param session
     * @return
     */
    @RequestMapping("/logout")
    public String logout(HttpSession session) {
        //销毁session
        session.invalidate();
        //使用cas退出成功后,跳转到http://cas.client1.com:9001/logout/success
        return "redirect:http://cas.example.org:8080/cas/logout?service=http://myweb.example.org:8998/webclient/cas/logout/success";
    }

    /**
     * 退出成功页
     * @param session
     * @return
     */
    @RequestMapping("/logout/success")
    public String logoutsuccess(HttpSession session) {
        
        System.out.println("退出");
        return "logout";
    }

}
