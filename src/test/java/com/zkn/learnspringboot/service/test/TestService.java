package com.zkn.learnspringboot.service.test;

import com.zkn.learnspringboot.FirstExample;
import com.zkn.learnspringboot.service.PersonService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Created by wb-zhangkenan on 2016/11/18.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = FirstExample.class)
public class TestService {
    @Autowired
    private PersonService personService;
    @Test
    public void testSys() {
        System.out.println(personService.getPersonDomain().toString());
    }

}
