package com.example.es.model;

import com.example.es.utils.SearchRequest;
import lombok.Data;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;

/**
 * @Author: hzx
 * @Date: Created By 2018/8/30 9:32
 * @Description:
 * @Modify By:
 */
@Data
public class RequestDeptModel extends SearchRequest {

    private String name;
    private String number;
    @Override
    public QueryBuilder generateQueryBuilder() {
        BoolQueryBuilder boolQueryBuilder = QueryBuilders.boolQuery();
        if (name != null) {
            boolQueryBuilder.must(QueryBuilders.matchPhraseQuery("name" ,name));
        }
        if (number!= null) {
            boolQueryBuilder.must(QueryBuilders.matchPhraseQuery("number",number));
        }
        return boolQueryBuilder;
    }
}
