package com.czj.modules.client.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author caizhijian
 * @create 2020/4/14
 */
@Controller
@RequestMapping("/menu")
public class MenuController {

    /**
     * 主页
     * @param map
     * @return
     */
    @RequestMapping("/index")
    public String index(ModelMap map) {
        map.addAttribute("name", "clien A");
        return "index";
    }

    /**
     * hello
     * @return
     */
    @RequestMapping("/hello")
    public String hello() {

        return "hello";
    }
}
