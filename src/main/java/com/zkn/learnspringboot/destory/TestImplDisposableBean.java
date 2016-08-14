package com.zkn.learnspringboot.destory;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.stereotype.Component;

/**
 * Created by zkn on 2016/8/14.
 */
@Component
public class TestImplDisposableBean implements DisposableBean, ExitCodeGenerator {

    @Override
    public void destroy() throws Exception {

        System.out.println("<<<<<<<<<<<我被销毁了......................>>>>>>>>>>>>>>>");
        System.out.println("<<<<<<<<<<<我被销毁了......................>>>>>>>>>>>>>>>");
    }

    @Override
    public int getExitCode() {

        return 5;
    }
}
