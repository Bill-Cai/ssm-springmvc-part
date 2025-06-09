package com.codeqm.config;

import com.codeqm.interceptor.MyInterceptor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @since: 2025/6/8 16:27
 * @author: qingmu
 * @description:
 */
@Configuration
@ComponentScan(value = {
        "com.codeqm.controller",
        "com.codeqm.error", // 添加错误处理类所在的包
})
@EnableWebMvc
public class SpringMvcConfig implements WebMvcConfigurer {
    // 添加拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 将拦截器添加到Springmvc环境, 默认拦截所有Springmvc分发的请求
        registry.addInterceptor(new MyInterceptor());
    }
}
