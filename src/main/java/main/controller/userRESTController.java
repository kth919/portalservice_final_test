package main.controller;

import main.model.User;
import main.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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

    @RequestMapping(value = "add",  method = RequestMethod.GET)
    public User addUser(User user) {

        User userData = new User();

        user.setId("kth919");
        user.setName("나다");
        user.setPassword("1234");

        userData = userRepository.save(user);

        return userData;
    }

    @RequestMapping(value = "users",  method = RequestMethod.GET)
    public List<User> getUserList(Model model) {

        List<User> userList = (List<User>) userRepository.findAll();

        return userList;
    }

}
