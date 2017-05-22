package com.zkn.learnspringboot.config;

import javax.servlet.MultipartConfigElement;

import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by wb-zhangkenan on 2017/5/22.
 *
 * @author wb-zhangkenan
 * @date 2017/05/22
 */
@Configuration
public class UploadFileConfiguration {

    @Bean
    public MultipartConfigElement multipartConfigElement() {
        MultipartConfigFactory factory = new MultipartConfigFactory();
        factory.setMaxFileSize("256KB");
        factory.setMaxRequestSize("512KB");
        return factory.createMultipartConfig();
    }
}
