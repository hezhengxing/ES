package com.example.es.service;

/**
 * @Author: hzx
 * @Date: 2018/8/29 10:49
 * @Description:
 * @Modify By:
 */
public interface PersonContactService {
    /**
     *  添加一个客户相关联系人
     * @param name
     * @param phone
     * @param address
     */
    void addPersonContact(String name,String phone,String personId,String address);
}
