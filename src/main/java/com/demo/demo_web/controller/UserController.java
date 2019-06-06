package com.demo.demo_web.controller;

import com.alibaba.fastjson.JSON;
import com.demo.demo_web.entity.User;
import com.demo.demo_web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("userController")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private RestTemplate template;
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

    @RequestMapping(value = "/test",method = RequestMethod.POST)
    @ResponseBody
    public String test(@RequestBody String param){
        System.out.println(param);
        return param+"?";
    }

    @RequestMapping(value = "/test1")
    public void test1(){
        String url = "http://localhost:8080/userController/test";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> entity = new HttpEntity<>("videoName", headers);

        try {
            ResponseEntity<String> responseEntity = template.postForEntity(url, entity, String.class);
            String rs = responseEntity.getBody();
            System.out.println("返回"+rs);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
