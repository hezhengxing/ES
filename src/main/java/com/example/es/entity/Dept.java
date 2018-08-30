package com.example.es.entity;

import com.example.es.config.BaseEntity;
import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * @Author: hzx
 * @Date: Created By 2018/8/30 9:22
 * @Description:
 * @Modify By:
 */
@Data
@Document(indexName = "dept",type = "type",shards = 1,replicas = 0)
public class Dept extends BaseEntity {
    private String name;
    private String number;
}
