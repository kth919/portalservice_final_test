package main.controller;

import main.model.UserList;
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
    public UserList add(UserList userList){
    UserList listData = userRepository.save(userList);

    return listData;
}

    @RequestMapping("/list")
    public List<UserList> list(Model model){

        List<UserList> ListAll = userRepository.findAll();

        return ListAll;
    }

//
//    @RequestMapping("/user/{id}")
//    public UserList getUserList(@PathVariable String id) {
//
//        UserList userList = userRepository.findOne("{id}");
//
//        return userList;
//    }

}
