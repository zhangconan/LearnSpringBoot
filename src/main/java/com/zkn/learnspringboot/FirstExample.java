package com.zkn.learnspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by zkn on 2016/8/7.
 *
 * @desc <ul>
 * <li>
 * @RestController注解相当于@Controller和@ResponseBody注解的结合。
 * @ResponseBody注解：异步请求或者不需要返回页面的注解。 </li>
 * <li>
 * @RestController和@RequestMapping是SpringMVC的注解。 </li>
 * <li>
 * @EnableAutoConfiguration注解：这个注解是自动配置的注解。 我们把main方法的类放在最底层。
 * </li>
 * </ul>
 * @see @{@link org.springframework.stereotype.Controller}
 * @see @{@link org.springframework.web.bind.annotation.ResponseBody}
 */
@RestController
@EnableAutoConfiguration
//@ImportResource(locations = {"classpath:dubbo-provider.xml"})
@ComponentScan
@EnableSwagger2
public class FirstExample implements EmbeddedServletContainerCustomizer {

    @RequestMapping("/first.do")
    String home() {
        return "Hello World！世界你好！O(∩_∩)O哈哈~！！！我不是太很好!";
    }

    public static void main(String[] args) {
        System.out.println(System.getProperty("user.dir"));
        SpringApplication.run(FirstExample.class, args);
    }

    @Override
    public void customize(ConfigurableEmbeddedServletContainer configurableEmbeddedServletContainer) {

        configurableEmbeddedServletContainer.setPort(8003);
    }
}
