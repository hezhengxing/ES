package com.example.es.service.impl;

import com.example.es.entity.CaseInfo;
import com.example.es.entity.Person;
import com.example.es.repository.CaseInfoRepository;
import com.example.es.repository.PersonRepository;
import com.example.es.service.CaseInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;

/**
 * @Author: hzx
 * @Date: 2018/8/28 9:29
 * @Description:
 * @Modify By:
 */
@Service
public class CaseInfoServiceImpl implements CaseInfoService {
    @Autowired
    CaseInfoRepository caseInfoRepository;
    @Autowired
    PersonRepository repository;
    @Override
    public void insertCaseInfo(BigDecimal overDueMoney, int overDueDays, String personId) {
        CaseInfo caseInfo = new CaseInfo();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyMMdd");
        caseInfo.setBatchNumber(simpleDateFormat.format(new Date()));
        caseInfo.setCaseNumber(String.valueOf(System.currentTimeMillis()));
        caseInfo.setOverDueMoney(overDueMoney);
        caseInfo.setOverDays(overDueDays);
        Optional<Person> person = repository.findById(personId);
        caseInfo.setPersonInfo(person.get());
        caseInfoRepository.save(caseInfo);
    }
}
