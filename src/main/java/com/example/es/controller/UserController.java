package com.example.es.controller;

import com.example.es.config.BaseController;
import com.example.es.config.BaseResult;
import com.example.es.entity.Person;
import com.example.es.model.PersonRequestModel;
import com.example.es.repository.PersonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: hzx
 * @Date: 2018/8/27 17:55
 * @Description:
 * @Modify By:
 */
@RestController
@RequestMapping("/api/UserController")
public class UserController extends BaseController{

    Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    PersonRepository personRepository;
    @Autowired
    ElasticsearchTemplate elasticsearchTemplate;

    @PostMapping("/selectUser")
    public BaseResult<Page<Person>> selectUser(PersonRequestModel personRequestModel, Pageable pageable){
//        Optional<Person> user = personRepository.findById(id);
//        Person person1 = user.get();
//        BoolQueryBuilder queryBuilder = QueryBuilders.boolQuery();
//        SearchQuery searchQuery = new NativeSearchQueryBuilder().withPageable(pageable).withQuery(queryBuilder.should(matchPhraseQuery("name",id).slop(1))
//                .should(matchQuery("idCard",name))).build();
//        SearchQuery searchQuery1 = new NativeSearchQueryBuilder().withPageable(pageable).withQuery(queryBuilder.must(matchQuery("name",id))).build();
        SearchQuery searchQuery = new NativeSearchQueryBuilder().
                withPageable(pageable).
                withQuery(personRequestModel.generateQueryBuilder()).build();
//        Page<Person> page = elasticsearchTemplate.queryForPage(searchQuery,Person.class);
        Page<Person> page1 = personRepository.search(searchQuery);
        logger.info("接口请求返回{}"+page1);
        return sendResult200(page1);
    }

    @PostMapping("/addPerson")
    public BaseResult addPerson(String name,int sex,String idCard,String personContactId){
        Person person = new Person();
        person.setName(name);
        person.setSex(sex);
        person.setPersonContactId(personContactId);
        person.setIdCard(idCard);

        personRepository.save(person);
        return sendResult200();
    }
}
