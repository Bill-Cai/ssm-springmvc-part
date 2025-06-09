package com.codeqm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @since: 2025/6/9 10:07
 * @author: qm
 * @description:
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    @GetMapping("/test1")
    public String test1() {
        System.out.println("test1 executed successfully");
        return "order/test1";
    }

    @GetMapping("/test2")
    public String test2() {
        System.out.println("test2 executed successfully");
        return "order/test2";
    }
}
