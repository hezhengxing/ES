package com.example.es.model;

import com.example.es.utils.SearchRequest;
import lombok.Data;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;


/**
 * @Author: hzx
 * @Date: 2018/8/28 18:00
 * @Description:
 * @Modify By:
 */
@Data
public class PersonRequestModel extends SearchRequest {
    private String name;
    private String idCard;
    @Override
    public QueryBuilder generateQueryBuilder() {
        BoolQueryBuilder qb = QueryBuilders
                .boolQuery();
        if (name != null) {
            qb.must(QueryBuilders.matchPhraseQuery("name",name));
        }
        if (idCard != null) {
            qb.must(QueryBuilders.matchPhraseQuery("idCard",idCard));
        }
        qb.mustNot(QueryBuilders.matchPhraseQuery("sex",1));
        return qb;
    }
}
