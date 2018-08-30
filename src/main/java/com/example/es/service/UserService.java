package com.example.es.service;

import com.example.es.entity.User;

/**
 * @Author: hzx
 * @Date: 2018/8/28 10:53
 * @Description:
 * @Modify By:
 */
public interface UserService {
    void addUser(String name,String password,int age);

    User selectUserById(String id);
}
