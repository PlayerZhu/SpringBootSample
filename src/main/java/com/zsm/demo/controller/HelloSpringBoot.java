package com.zsm.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: maker
 * @create: 2018/11/19
 */
@RestController
public class HelloSpringBoot {

    @RequestMapping("/hello")
    public String hello(){
        String str = "Hello SpringBoot";
        return str;
    }
}
