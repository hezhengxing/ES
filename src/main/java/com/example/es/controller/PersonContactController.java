package com.example.es.controller;

import com.example.es.config.BaseController;
import com.example.es.config.BaseResult;
import com.example.es.service.PersonContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: hzx
 * @Date: 2018/8/29 11:00
 * @Description:
 * @Modify By:
 */
@RestController
@RequestMapping("/api/PersonContactController")
public class PersonContactController  extends BaseController{
    @Autowired
    PersonContactService personContactService;

    @PostMapping("/addPersonContact")
    public BaseResult addPersonContact(String name ,String phone ,String personId,String address){
        personContactService.addPersonContact(name, phone, personId, address);
        return sendResult200();
    }

}
