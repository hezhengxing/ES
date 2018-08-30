package com.example.es.entity;

import com.example.es.config.BaseEntity;
import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;

import java.util.List;

/**
 * @Author: hzx
 * @Date: 2018/8/29 10:45
 * @Description:
 * @Modify By:
 */
@Data
@Document(indexName = "personcontact",type = "personContact",shards = 2,replicas = 0)
public class PersonContact extends BaseEntity {
    private String personName;
    private String phone;
    private String address;
    private Person personInfo;
}
