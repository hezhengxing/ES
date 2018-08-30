package com.example.es.repository;

import com.example.es.entity.Person;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author: hzx
 * @Date: 2018/8/27 18:22
 * @Description:
 * @Modify By:
 */
@Repository
public interface PersonRepository extends ElasticsearchRepository<Person,String> {
}
