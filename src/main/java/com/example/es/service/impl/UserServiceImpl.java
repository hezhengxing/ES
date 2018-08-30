package com.example.es.service.impl;

import com.example.es.entity.User;
import com.example.es.repository.UserRepository;
import com.example.es.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @Author: hzx
 * @Date: 2018/8/28 10:54
 * @Description:
 * @Modify By:
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository repository;
    @Override
    public void addUser(String name, String password, int age) {
        User user = new User();
        user.setUserName(name);
        user.setPassWord(password);
        user.setAge(age);
        repository.save(user);
    }

    @Override
    public User selectUserById(String id) {
        Optional<User> user = repository.findById(id);
        return user.get();
    }
}
