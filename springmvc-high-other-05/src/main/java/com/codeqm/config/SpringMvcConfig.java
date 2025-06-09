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
        /*
         * 多个拦截器执行顺序
         * 1. preHandle 方法执行顺序：按照添加的顺序依次执行
         * 2. postHandle 方法执行顺序：按照添加的顺序逆序执行
         * 3. afterCompletion 方法执行顺序：按照添加的顺序逆序执行
         */

        // 配置方案 1. 拦截全部请求
        // 将拦截器添加到Springmvc环境, 默认拦截所有Springmvc分发的请求
//        registry.addInterceptor(new MyInterceptor());

        // 配置方案 2. 拦截指定请求
        //   指定地址拦截 .addPathPatterns("/user/test1")
        //     * 任意一层字符串    ** 表示任意多层字符串
//        registry.addInterceptor(new MyInterceptor())
//                .addPathPatterns("/user/**"); // 拦截所有/user/开头的请求

        // 配置方案 3. 排除指定请求
        //   指定地址排除 .excludePathPatterns("/user/test1")
        registry.addInterceptor(new MyInterceptor())
                .addPathPatterns("/user/**")
                .excludePathPatterns("/user/test2"); // 排除/user/test2请求不被拦截
    }
}
