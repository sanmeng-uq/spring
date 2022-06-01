package com.ch10;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstController {
    @RequestMapping("/hello")
    public String sayHello(){
        System.out.println("欢迎访问第一个springmvc页面");
        return "success";
    }
}
