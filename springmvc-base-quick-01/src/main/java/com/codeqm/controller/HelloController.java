package com.codeqm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @since: 2025/6/7 16:13
 * @author: qingmu
 * @description:
 */
@Controller
public class HelloController {
    //handlers --> springmvc/hello return "Hello SpringMVC!!"

    /*
     * handler就是controller内部的具体方法
     *
     * @RequestMapping("/springmvc/hello") 就是用来向handlerMapping中注册的方法注解!
     * @ResponseBody 代表向浏览器直接返回数据, 不找视视图解析器!
     */
    @RequestMapping("/springmvc/hello")
    @ResponseBody
    public String hello() {
        System.out.println("HelloController.hello");
        return "Hello SpringMVC!!";
    }
}
