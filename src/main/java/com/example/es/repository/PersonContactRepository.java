package com.example.es.repository;

import com.example.es.entity.PersonContact;
import org.springframework.data.elasticsearch.repository.ElasticsearchCrudRepository;

/**
 * @Author: hzx
 * @Date: 2018/8/29 10:48
 * @Description:
 * @Modify By:
 */
public interface PersonContactRepository extends ElasticsearchCrudRepository<PersonContact,String> {
}
