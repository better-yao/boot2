package com.yao.boot2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/User")
public class UserController {



    @RequestMapping(value = "/login", method = RequestMethod.POST )
    @ResponseBody
    public String findUser(String username, String password ,HttpServletRequest request){


        return null;
    }
    @RequestMapping(value = "/logout",method = RequestMethod.POST)
    public String logout(HttpServletRequest request){
        request.getSession().removeAttribute("userMessage");
        return "login";
    }

}
