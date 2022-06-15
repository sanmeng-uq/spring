package com.ch10;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstController {
    @RequestMapping("/hello")
    public String sayHello(){
        System.out.println("欢迎访问第一个springmvc页面");
        return "success";
    }

    @RequestMapping("/happy")
    public ModelAndView sayHappy(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("happy","I'm happy!");
        modelAndView.setViewName("happy");
        return modelAndView;
    }

}
