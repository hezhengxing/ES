package com.example.es.controller;

import com.example.es.config.BaseController;
import com.example.es.config.BaseResult;
import com.example.es.service.CaseInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @Author: hzx
 * @Date: 2018/8/28 10:03
 * @Description:
 * @Modify By:
 */
@RestController
@RequestMapping("/api/caseInfoController")
public class CaseInfoController extends BaseController {
    @Autowired
    CaseInfoService caseInfoService;

    @PostMapping("/insertCaseInfo")
    public BaseResult insertCaseInfo(BigDecimal overDueMoney, int overDueDays, String personId){
        caseInfoService.insertCaseInfo(overDueMoney, overDueDays, personId);
        return sendResult200();
    }
}
