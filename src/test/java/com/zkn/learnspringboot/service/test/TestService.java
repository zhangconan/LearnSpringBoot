package com.zkn.learnspringboot.service.test;

import com.zkn.learnspringboot.service.PersonService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by wb-zhangkenan on 2016/11/18.
 */

public class TestService extends BaseTestService{
    @Autowired
    private PersonService personService;
    @Test
    public void testSys() {
        System.out.println(personService.getPersonDomain().toString());
    }

}
