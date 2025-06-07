package com.codeqm.requestmapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @since: 2025/6/7 16:54
 * @author: qingmu
 * @description:
 */
@Controller
@RequestMapping("/user") // 设置类级别的请求映射路径
public class UserController {
    /*
     * 精准设置访问地址 /user/login
     * 精准地址：[一个|多个]路径
     *   1. 单个路径："/user/login"
     *   2. 多个路径：{"/user/login", "/user/register"}
     * 支持模糊匹配
     *   单个路径："/user/*"  *表示任意一层字符串，**表示任意多层字符串
     * 类和方法上都可以使用 @RequestMapping 注解来设置请求映射路径
     *   类上设置的路径会作为方法上设置的路径的统一前缀
     *   方法上设置的路径会作为类上设置的路径的不同路径
     * 请求方法指定
     *   可以通过 @RequestMapping 注解的 method 属性来指定请求方法
     * 注解进阶
     *   get @GetMapping == @RequestMapping(method = RequestMethod.GET)
     *   post @PostMapping == @RequestMapping(method = RequestMethod.POST)
     *   put @PutMapping == @RequestMapping(method = RequestMethod.PUT)
     *   delete @DeleteMapping == @RequestMapping(method = RequestMethod.DELETE)
     */
    @RequestMapping(value = {"/login"}, method = RequestMethod.POST) // 最终的地址是类地址 + 方法地址：/user/login
    @ResponseBody
    public String login() {
        System.out.println("UserController.login");
        return "login success!!";
    }

    /*
     * 精准设置访问地址 /user/register
     */
    @RequestMapping(value = {"/register"}, method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String register() {
        System.out.println("UserController.register");
        return "register success!!";
    }

    @GetMapping
    public String index() {
        System.out.println("UserController.index");
        return "index";
    }
}
