package com.example.es.config;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Date;

/**
 * @Author: hzx
 * @Date: 2018/8/27 20:36
 * @Description:
 * @Modify By:
 */
@Data
public class BaseEntity {
    @Id
    private String id = IdGen.uuid();
    private Date operateTime = new Date();
}
