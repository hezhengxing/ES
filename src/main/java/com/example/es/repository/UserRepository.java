package com.example.es.repository;

import com.example.es.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @Author: hzx
 * @Date: 2018/8/28 10:52
 * @Description:
 * @Modify By:
 */
public interface UserRepository extends MongoRepository<User,String> {
}
