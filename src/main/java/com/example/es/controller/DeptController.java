package com.example.es.controller;

import com.example.es.config.BaseController;
import com.example.es.config.BaseResult;
import com.example.es.entity.Dept;
import com.example.es.model.RequestDeptModel;
import com.example.es.repository.DeptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: hzx
 * @Date: Created By 2018/8/30 9:23
 * @Description:
 * @Modify By:
 */
@RequestMapping("/api/DeptController")
@RestController
public class DeptController extends BaseController {
    @Autowired
    DeptRepository deptRepository;
    @PostMapping("/addDept")
    public BaseResult addDept(String name , String number){
        Dept dept = new Dept();
        dept.setName(name);
        dept.setNumber(number);
        deptRepository.save(dept);
        return sendResult200();
    }

    @PostMapping("/selectDept")
    public BaseResult<Page<Dept>> selectDept(RequestDeptModel requestDeptModel, Pageable pageable){
        SearchQuery searchQuery = new NativeSearchQueryBuilder()
                .withPageable(pageable)
                .withQuery(requestDeptModel.generateQueryBuilder()).build();
        Page<Dept> page = deptRepository.search(searchQuery);
        return sendResult200(page);
    }

}














