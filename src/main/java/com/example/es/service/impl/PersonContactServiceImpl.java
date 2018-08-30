package com.example.es.service.impl;

import com.example.es.entity.Person;
import com.example.es.entity.PersonContact;
import com.example.es.repository.PersonContactRepository;
import com.example.es.repository.PersonRepository;
import com.example.es.service.PersonContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @Author: hzx
 * @Date: 2018/8/29 10:51
 * @Description:
 * @Modify By:
 */
@Service
public class PersonContactServiceImpl implements PersonContactService {
    @Autowired
    ElasticsearchTemplate elasticsearchTemplate;
    @Autowired
    PersonRepository personRepository;
    @Autowired
    PersonContactRepository personContactRepository;

    @Override
    public void addPersonContact(String name, String phone,String personId, String address) {
        PersonContact personContact = new PersonContact();
        Optional<Person> person = personRepository.findById(personId);
        personContact.setPersonName(name);
        personContact.setPhone(phone);
        personContact.setPersonInfo(person.get());
        personContact.setAddress(address);
        personContactRepository.save(personContact);
    }
}
