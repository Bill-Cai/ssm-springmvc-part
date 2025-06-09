package com.codeqm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
