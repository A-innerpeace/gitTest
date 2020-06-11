package com.dyc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description:
 * @Author: dyc
 * @Time: 2020/6/11 9:38
 */
@Controller
public class HelloController {
    @RequestMapping
    @ResponseBody
    public String hello() {
        return "凡是过往，皆为序章。剑之所向，心之所往。";
    }
}
