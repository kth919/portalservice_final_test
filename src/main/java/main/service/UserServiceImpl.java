package main.service;

import main.model.User;
import main.repository.UserRepository;
import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by admin on 2016-06-17.
// */
@Service("UserService")
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public void addUser(HttpServletRequest request) {

        User user = new User();

        user.setName(request.getParameter("name"));
        user.setuserId(request.getParameter("userId"));
        user.setPassword(request.getParameter("password"));
        user.setDesc(request.getParameter("desc"));

        userRepository.save(user);
    }
}


