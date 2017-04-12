package com.zkn.learnspringboot.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zkn.learnspringboot.dao.PersonDAO;
import com.zkn.learnspringboot.domain.PersonDomain;
import com.zkn.learnspringboot.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by zkn on 2016/8/11.
 */
@org.springframework.stereotype.Service("personService")
//Service一定要用dubbo的Service
//@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonDAO personDAO;

    @Override
    public PersonDomain getPersonDomain() {

        return personDAO.getPersonDomain();
    }

}
