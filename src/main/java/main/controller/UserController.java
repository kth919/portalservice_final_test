package main.controller;

import main.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by admin on 2016-06-27.
 */
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value="/user/add" , method= RequestMethod.POST )
    public String addUser(HttpServletRequest request){
        userService.addUser(request);
        return "redirect:/";
    }

}
