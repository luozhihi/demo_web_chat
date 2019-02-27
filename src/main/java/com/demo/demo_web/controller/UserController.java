package com.demo.demo_web.controller;

import com.alibaba.fastjson.JSON;
import com.demo.demo_web.entity.User;
import com.demo.demo_web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("userController")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String login(HttpServletRequest request, HttpServletResponse response, HttpSession session, User user, Boolean rememberMe){
        User userQuery = userService.login(user);
        if(userQuery != null){
            if(rememberMe){
                Cookie cookie = new Cookie("loginMsg", JSON.toJSONString(user));
                cookie.setMaxAge(60*60*24*30);
                response.addCookie(cookie);
            }
            session.setAttribute("user",userQuery);
            return "/html/index";
        }
        return null;
    }


}
