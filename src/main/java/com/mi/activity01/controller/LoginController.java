package com.mi.activity01.controller;

import com.mi.activity01.pojo.User;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/log/")
public class LoginController {
    @RequestMapping(value = "getValue", method = RequestMethod.POST)
    @ResponseBody
    public String getValue(HttpServletRequest request, User user){
        user.setUsername(request.getParameter("username"));
        user.setPassword(request.getParameter("password"));
        System.out.println("POJO: " +user.toString() );
        return "redirect:/";
    }
    @RequestMapping("login")
    public String login(){
        return "login";
    }
}
