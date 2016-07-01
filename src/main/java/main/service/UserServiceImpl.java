package main.service;

import main.model.Userinfo;
import main.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

        Userinfo userinfo = new Userinfo();

        userinfo.setName(request.getParameter("name"));
        userinfo.setuserId(request.getParameter("userid"));
        userinfo.setPassword(request.getParameter("password"));
        userinfo.setDesc(request.getParameter("des")); // mysql에서 desc 라는 변수명 사용불가

        userRepository.save(userinfo);
    }
}


