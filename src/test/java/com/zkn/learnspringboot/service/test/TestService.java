package com.zkn.learnspringboot.service.test;

import com.zkn.learnspringboot.FirstExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Created by wb-zhangkenan on 2016/11/18.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = FirstExample.class)
@WebAppConfiguration
public class TestService {

    @Test
    public void contextLoads() {
    }

}
