package main.controller;

import main.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by admin on 2016-06-27.
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value="/user/add" )
    public String addUser(HttpServletRequest request){
        userService.addUser(request);
        return "redirect:/main";
    }

    @RequestMapping(value = "/signin/auth")
    public String signintest(HttpSecurity http){
        return "join";
    }


    @RequestMapping(value = "/signin")
    public String signinStart(HttpSession session){
        return "signin";
    }



}
