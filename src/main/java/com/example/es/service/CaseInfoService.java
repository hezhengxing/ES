package com.example.es.service;

import java.math.BigDecimal;

/**
 * @Author: hzx
 * @Date: 2018/8/28 9:26
 * @Description:
 * @Modify By:
 */
public interface CaseInfoService {

    /**
     * 添加一个新案件
     * @param overDueMoney
     * @param overDueDays
     * @param personId
     */
    void insertCaseInfo(BigDecimal overDueMoney,int overDueDays,String personId);
}
