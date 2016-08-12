package com.zkn.learnspringboot.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by zkn on 2016/8/12.
 */
@Component
public class TestImplCommandLineRunner implements CommandLineRunner {


    @Override
    public void run(String... args) throws Exception {

        System.out.println("<<<<<<<<<<<<这个是测试CommandLineRunn接口>>>>>>>>>>>>>>");
    }
}
