package com.ch12.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.awt.print.Book;

@Controller
public class AjaxController {
    @RequestMapping("/addBook")
    public String addUser(@RequestBody Book book){
        System.out.println(book);
        return "success";
    }
}
