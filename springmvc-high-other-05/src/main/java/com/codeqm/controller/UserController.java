package com.codeqm.controller;

import com.codeqm.pojo.User;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.sql.DatabaseMetaData;
import java.util.HashMap;

/**
 * @since: 2025/6/9 9:32
 * @author: qm
 * @description:
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping("/test1")
    public String test1() {
        String name = null;
//        name.toString(); // 这里抛出 NullPointerException
        System.out.println("test1 executed successfully");
        return "user/test1";
    }

    @GetMapping("/test2")
    public String test2() {
//        int i = 1 / 0; // 这里抛出 ArithmeticException
        System.out.println("test2 executed successfully");
        return "user/test2";
    }

    /**
     * 用户注册接口
     * 用户校验：
     * * step 1. 实体类属性上使用注解进行校验
     * * step 2. 在Controller方法参数上使用@Validated注解开启校验
     * *   param 和 json 校验注解都有效果
     * *   json -> @RequestBody
     * * 如果不符合，则会直接向前端抛出异常。
     * * 因此，需要捕捉绑定异常，进行处理：
     * * * 1. handler(校验对象, BindingResult bindingResult) 方法
     * * *   要求：参数顺序不能变，BindingResult必须紧跟在校验对象后面
     * * * 2. bindingResult获取绑定错误
     *
     * @param user 用户信息
     * @return 注册成功的用户信息
     */
    @PostMapping("/register")
    public Object register(
            @Validated @RequestBody User user,
            BindingResult bindingResult
    ) {
        //判断是否有信息绑定错误! 有可以自行处理!
        if (bindingResult.hasErrors()) {
            System.out.println("Binding errors: " + bindingResult.getAllErrors());
            HashMap hashMap = new HashMap();
            hashMap.put("code", 400);
            hashMap.put("message", "参数校验失败");
            return hashMap;
        }
        //没有,正常处理业务即可
        System.out.println("User registered: " + user);
        return user;
    }
}
