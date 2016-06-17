package main.service;

import main.model.UserList;
import main.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by admin on 2016-06-17.
// */
//@Service("UserService")
//public class UserServiceImpl implements UserService{
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @Transactional(readOnly = true)
//    public List findAll() {
//        return userRepository.findAll();
//    }
//
//    @Transactional
//    public UserList create(String name, String description) {
//        UserList userList = new UserList();
//        userList.setName(name);
//        userList.setDesc(description);
//        return userRepository.save(userList);
//    }
//
//    @Transactional
//    public UserList update(UserList userList) {
//        return userRepository.save(userList);
//    }
//
//    @Transactional
//    public void delete(String id) {
//        userRepository.delete(id);
//    }
//}


