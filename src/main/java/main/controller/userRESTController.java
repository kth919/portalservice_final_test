package main.controller;

import main.model.Userinfo;
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
    public Userinfo add(Userinfo userinfo){
    Userinfo listData = userRepository.save(userinfo);

    return listData;
}

    @RequestMapping("/list")
    public List<Userinfo> list(Model model){

        return  userRepository.findAll();


    }

//
//    @RequestMapping("/user/{id}")
//    public Userinfo getUserinfo(@PathVariable String id) {
//
//        Userinfo userList = userRepository.findOne("{id}");
//
//        return userList;
//    }

}
