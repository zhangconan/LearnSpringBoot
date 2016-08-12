package com.zkn.learnspringboot.dao.impl;

import com.zkn.learnspringboot.dao.PersonDAO;
import com.zkn.learnspringboot.domain.PersonDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by zkn on 2016/8/11.
 */
@Repository
public class PersonDAOImpl implements PersonDAO{

    @Autowired
    private PersonDomain personDomain;

    public PersonDomain getPersonDomain() {

        return personDomain;
    }
}
