package com.example.es.entity;

import com.example.es.config.BaseEntity;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @Author: hzx
 * @Date: 2018/8/28 10:48
 * @Description:
 * @Modify By:
 */
@Document
@Data
public class User extends BaseEntity {
    private String userName;
    private String passWord;
    private int age;
}
