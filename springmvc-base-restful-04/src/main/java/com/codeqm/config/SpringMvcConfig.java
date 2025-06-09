package com.codeqm.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @since: 2025/6/8 16:27
 * @author: qingmu
 * @description:
 */
@Configuration
@ComponentScan(value = {
        "com.codeqm.controller",
})
@EnableWebMvc
public class SpringMvcConfig implements WebMvcConfigurer {
}
