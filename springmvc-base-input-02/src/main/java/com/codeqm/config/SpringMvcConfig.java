package com.codeqm.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

/**
 * @since: 2025/6/8 14:08
 * @author: qingmu
 * @description:
 */
@EnableWebMvc  // json数据处理, 必须使用此注解, 因为他会加入json处理器
@Configuration
@ComponentScan(value = {
        "com.codeqm.param",
        "com.codeqm.path",
        "com.codeqm.json",
        "com.codeqm.cookie",
        "com.codeqm.header",
})
public class SpringMvcConfig implements WebMvcConfigurer {
}
