package main.controller;

import main.model.User;
import main.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by admin on 2016-06-16.
 */
@RestController
@RequestMapping("/rest")
public class userRESTController {

@Autowired
private UserRepository userRepository;

    @RequestMapping(value = "/users",  method = RequestMethod.GET)
    public @ResponseBody
    List<User> getUserList(Model model) {

        return userRepository.findAll();
    }

}
