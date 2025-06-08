package com.codeqm.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

/**
 * @since: 2025/6/8 14:08
 * @author: qingmu
 * @description:
 */
@Configuration
@ComponentScan(value = {"com.codeqm.param", "com.codeqm.path"})
public class SpringMvcConfig {
    @Bean
    public RequestMappingHandlerMapping requestMappingHandlerMapping() {
        return new RequestMappingHandlerMapping();
    }

    @Bean
    public RequestMappingHandlerAdapter requestMappingHandlerAdapter() {
        return new RequestMappingHandlerAdapter();
    }
}
