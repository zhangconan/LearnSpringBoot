package com.zkn.learnspringboot.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * Created by zkn on 2016/8/12.
 * 注意：一定要有@Component这个注解。要不然SpringBoot扫描不到这个类。
 */
@Component
public class TestImplApplicationRunner implements ApplicationRunner {


    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(args);
        System.out.println("这个是测试ApplicationRunner接口");
    }
}
