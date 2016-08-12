package com.zkn.learnspringboot.service.impl;

import com.zkn.learnspringboot.dao.PersonDAO;
import com.zkn.learnspringboot.domain.PersonDomain;
import com.zkn.learnspringboot.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zkn on 2016/8/11.
 */
@Service("personService")
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonDAO personDAO;

    public PersonDomain getPersonDomain() {

        return personDAO.getPersonDomain();
    }

}
