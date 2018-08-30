package com.example.es.repository;

import com.example.es.entity.Dept;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @Author: hzx
 * @Date: Created By 2018/8/30 9:24
 * @Description:
 * @Modify By:
 */
public interface DeptRepository extends ElasticsearchRepository<Dept,String> {
}
