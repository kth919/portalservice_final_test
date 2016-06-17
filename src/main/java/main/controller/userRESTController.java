package main.controller;

import main.model.User;
import main.repository.UserRepository;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by admin on 2016-06-16.
 */
@RestController
@RequestMapping("/rest")
public class userRESTController {
    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(ViewController.class);

@Autowired
private UserRepository userRepository;

@RequestMapping("/add")
    public User add(User user){
    User listData = userRepository.save(user);

    return listData;
}

    @RequestMapping("/list")
    public List<User> list(Model model){

        return  userRepository.findAll();


    }

//
//    @RequestMapping("/user/{id}")
//    public User getUser(@PathVariable String id) {
//
//        User userList = userRepository.findOne("{id}");
//
//        return userList;
//    }

}
