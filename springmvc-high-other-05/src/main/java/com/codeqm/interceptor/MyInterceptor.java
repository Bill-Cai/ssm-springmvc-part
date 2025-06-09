package com.codeqm.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * @since: 2025/6/9 9:50
 * @author: qm
 * @description:
 */
public class MyInterceptor implements HandlerInterceptor {
    /*
     * 在处理请求的目标 handler 方法前执行：编码格式检验、登录保护、权限校验等
     *     if(!preHandler()){return;}
     *
     * @param request 请求对象
     * @param response 响应对象
     * @param handler 目标 handler 对象
     * @return true：放行，false：不放行
     */
    @Override
    public boolean preHandle(
            HttpServletRequest request,
            HttpServletResponse response,
            Object handler
    ) throws Exception {
        System.out.println("request = " + request + ", response = " + response + ", handler = " + handler);
        System.out.println("MyInterceptor.preHandle");
        return true;
    }

    /*
     * 在处理请求的目标 handler 方法后执行：结果数据处理、视图渲染等
     *     如果目标 handler 方法抛出异常，则不会执行此方法
     *
     * @param request 请求对象
     * @param response 响应对象
     * @param handler 目标 handler 对象
     * @param modelAndView 视图模型和视图对象
     */
    @Override
    public void postHandle(
            HttpServletRequest request,
            HttpServletResponse response,
            Object handler,
            ModelAndView modelAndView
    ) throws Exception {
        System.out.println("request = " + request + ", response = " + response + ", handler = " + handler + ", modelAndView = " + modelAndView);
        System.out.println("MyInterceptor.postHandle");
    }

    /*
     * 在渲染视图之后执行：资源清理、日志记录等
     *     如果目标 handler 方法抛出异常，则会在此方法中接收到异常对象 ex
     *     如果目标 handler 方法没有抛出异常，则 ex 为 null
     *     注意：此方法一定会被执行，无论目标 handler 方法是否抛出异常
     *
     * @param request 请求对象
     * @param response 响应对象
     * @param handler 目标 handler 对象
     * @param ex 异常对象，如果没有异常则为 null
     */
    @Override
    public void afterCompletion(
            HttpServletRequest request,
            HttpServletResponse response,
            Object handler,
            Exception ex
    ) throws Exception {
        System.out.println("request = " + request + ", response = " + response + ", handler = " + handler + ", ex = " + ex);
        System.out.println("MyInterceptor.afterCompletion");
    }
}
