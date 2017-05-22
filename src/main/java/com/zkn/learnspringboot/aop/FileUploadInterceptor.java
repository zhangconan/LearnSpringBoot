package com.zkn.learnspringboot.aop;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * Created by wb-zhangkenan on 2017/5/22.
 *
 * @author wb-zhangkenan
 * @date 2017/05/22
 */
@Component
public class FileUploadInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
        throws Exception {

        return super.preHandle(request, response, handler);
    }
}
