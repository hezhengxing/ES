package com.example.es.repository;

import com.example.es.entity.CaseInfo;
import org.springframework.data.elasticsearch.repository.ElasticsearchCrudRepository;

/**
 * @Author: hzx
 * @Date: 2018/8/28 9:23
 * @Description:
 * @Modify By:
 */
public interface CaseInfoRepository extends ElasticsearchCrudRepository<CaseInfo,String> {
}
