package com.codeqm.controller;

import com.codeqm.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @since: 2025/6/9 9:21
 * @author: qm
 * @description:
 */
@Controller
@RequestMapping("/user")
public class UserController {
    /*
     * 模拟分页查询业务接口：GET http://localhost:8080/user?page=1&size=10
     */
    @GetMapping
    public Object queryPage(
            @RequestParam(name = "page", required = false, defaultValue = "1") int page,
            @RequestParam(name = "size", required = false, defaultValue = "10") int size
    ) {
        System.out.println("page = " + page + ", size = " + size);
        System.out.println("分页查询业务!");
        return "{'status':'ok'}";
    }


    /*
     * 模拟用户保存业务接口：POST http://localhost:8080/user
     */
    @PostMapping
    public Object saveUser(@RequestBody User user) {
        System.out.println("user = " + user);
        System.out.println("用户保存业务!");
        return "{'status':'ok'}";
    }

    /*
     * 模拟用户详情业务接口：POST http://localhost:8080/user/1
     */
    @PostMapping("/{id}")
    public Object detailUser(@PathVariable Integer id) {
        System.out.println("id = " + id);
        System.out.println("用户详情业务!");
        return "{'status':'ok'}";
    }

    /*
     * 模拟用户更新业务接口：PUT http://localhost:8080/user
     */
    @PutMapping
    public Object updateUser(@RequestBody User user) {
        System.out.println("user = " + user);
        System.out.println("用户更新业务!");
        return "{'status':'ok'}";
    }

    /*
     * 模拟条件分页查询业务接口：GET http://localhost:8080/user/search?page=1&size=10&keyword=xxx
     */
    @GetMapping("search")
    public Object queryPage(
            @RequestParam(name = "page", required = false, defaultValue = "1") int page,
            @RequestParam(name = "size", required = false, defaultValue = "10") int size,
            @RequestParam(name = "keyword", required = false) String keyword
    ) {
        System.out.println("page = " + page + ", size = " + size + ", keyword = " + keyword);
        System.out.println("条件分页查询业务!");
        return "{'status':'ok'}";
    }
}
