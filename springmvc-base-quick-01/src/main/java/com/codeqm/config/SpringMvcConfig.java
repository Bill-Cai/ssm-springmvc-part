package com.codeqm.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

/**
 * @since: 2025/6/7 16:16
 * @author: qingmu
 * @description: SpringMVC对应组件的配置类 [声明SpringMVC需要的组件信息]
 * 导入handlerMapping和handlerAdapter的三种方式
 * 1.自动导入handlerMapping和handlerAdapter [推荐]
 * 2.可以不添加,springmvc会检查是否配置handlerMapping和handlerAdapter,没有配置默认加载
 * 3.使用@Bean方式配置handlerMapper和handlerAdapter
 */
@Configuration
@ComponentScan("com.codeqm.controller")
public class SpringMvcConfig {
    @Bean
    public RequestMappingHandlerMapping getRequestMappingHandlerMapping() {
        return new RequestMappingHandlerMapping();
    }

    @Bean
    public RequestMappingHandlerAdapter getRequestMappingHandlerAdapter() {
        return new RequestMappingHandlerAdapter();
    }
}
