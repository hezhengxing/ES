package com.example.es.entity;

import com.example.es.config.BaseEntity;
import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;

import java.math.BigDecimal;

/**
 * @Author: hzx
 * @Date: 2018/8/28 9:14
 * @Description:
 * @Modify By:
 */
@Data
@Document(indexName = "caseinfo",type = "caseinfo",shards = 1,replicas = 0)
public class CaseInfo extends BaseEntity{
    private String caseNumber;
    private String batchNumber;
    private BigDecimal overDueMoney;
    private int overDays;
    private Person personInfo;

}
