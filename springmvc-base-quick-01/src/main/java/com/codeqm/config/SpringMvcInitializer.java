package com.codeqm.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @since: 2025/6/7 16:21
 * @author: qingmu
 * @description: SpringMVC初始化器, 可以被web项目自动加载, 会初始化ioc容器, 会设置dispatcherServlet的地址
 * <p>
 * // SpringMVC提供的接口,是替代web.xml的方案,更方便实现完全注解方式ssm处理!
 * // Springmvc框架会自动检查当前类的实现类,会自动加载 getRootConfigClasses / getServletConfigClasses 提供的配置类
 * // getServletMappings 返回的地址 设置DispatherServlet对应处理的地址
 */
public class SpringMvcInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    /*
     * 指定 service mapper 层的配置类
     * @return
     */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    /*
     * 指定 springmvc 的配置类
     * @return
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringMvcConfig.class};
    }

    /*
     * 设置 dispatcherServlet 的处理路径!
     * 一般情况下为 "/" 代表处理所有请求!
     * @return
     */
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
