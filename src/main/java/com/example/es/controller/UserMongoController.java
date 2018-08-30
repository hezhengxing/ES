package com.example.es.controller;

import com.example.es.config.BaseController;
import com.example.es.config.BaseResult;
import com.example.es.entity.User;
import com.example.es.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: hzx
 * @Date: 2018/8/28 11:03
 * @Description:
 * @Modify By:
 */
@RestController
@RequestMapping("/api/userMongoController")
public class UserMongoController extends BaseController {

    @Autowired
    UserService userService;

    @PostMapping("/insertUser")
    public BaseResult insertUser(String name ,String password,int age) {
        userService.addUser(name, password, age);
        return sendResult200();
    }

    @PostMapping("/selectUser")
    public BaseResult<User> selectUser(String id) {
        User user = userService.selectUserById(id);
        return sendResult200(user);
    }

}
