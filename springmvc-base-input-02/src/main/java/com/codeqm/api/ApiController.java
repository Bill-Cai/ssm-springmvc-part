package com.codeqm.api;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @since: 2025/6/8 15:42
 * @author: qingmu
 * @description:
 */
@Controller
public class ApiController {
    @Autowired // 自动注入ServletContext对象
    private ServletContext servletContext;

    /*
     * 如果想要获取请求或者响应对象,或者会话等,可以直接在形参列表传入,并且不分先后顺序!
     * 注意: 接收原生对象,并不影响参数接收!
     */
    @GetMapping("/api")
    @ResponseBody
    public String api(
            HttpSession session,
            HttpServletRequest request,
            HttpServletResponse response
    ) {
        /*
         * 使用 Servelet 原生对象
         *
         * ServletContext
         * 1. 最大的配置文件，在web.xml中配置
         *     <context-param>
         *       <param-name>key</param-name>
         *       <param-value>value</param-value>
         *     </context-param>
         * 2. 全局最大共享域
         * 3. 核心API getRealPath
         */
        // 方案1：request获取  session获取
        ServletContext servletContext = request.getServletContext();
        ServletContext servletContext1 = session.getServletContext();
        // 方案2：直接获取
        // 直接全局注入

//        String method = request.getMethod();
//        System.out.println("method = " + method);
        return "api";
    }
}
