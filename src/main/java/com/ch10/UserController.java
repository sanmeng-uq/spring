package com.ch10;

import com.ch10.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.sql.rowset.spi.SyncResolver;

@Controller
public class UserController {
    @RequestMapping("/getid")
    public void getUserId(HttpServletRequest request){
        String userId=request.getParameter("id");
        System.out.println("userId="+userId);
    }

    @RequestMapping("login")
    public void login(String username, @RequestParam("password") String pwd){
        System.out.println("用户名："+username);
        System.out.println("密码："+pwd);
    }

    @RequestMapping("/register")
    public void register(User user){
        System.out.println("用户名:"+user.getUsername());
        System.out.println("密码:"+user.getPassword());
    }
}
