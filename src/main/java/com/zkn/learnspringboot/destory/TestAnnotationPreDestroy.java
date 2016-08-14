package com.zkn.learnspringboot.destory;

import org.springframework.stereotype.Component;
import javax.annotation.PreDestroy;

/**
 * Created by zkn on 2016/8/14.
 */
@Component
public class TestAnnotationPreDestroy {

    @PreDestroy
    public void destory() {

        System.out.println("我被销毁了、、、、、我是用的@PreDestory的方式、、、、、、");
        System.out.println("我被销毁了、、、、、我是用的@PreDestory的方式、、、、、、");
    }
}
