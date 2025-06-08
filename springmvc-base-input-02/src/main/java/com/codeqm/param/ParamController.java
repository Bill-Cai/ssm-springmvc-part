package com.codeqm.param;

import com.codeqm.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @since: 2025/6/8 14:06
 * @author: qingmu
 * @description:
 */
@Controller
@RequestMapping("/param")
public class ParamController {
    /*
     * 前端请求: http://localhost:8080/param/value?name=xx&age=18
     *
     * 可以利用形参列表,直接接收前端传递的param参数!
     *    要求: 参数名 = 形参名
     *          类型相同
     * 出现乱码正常，json接收具体解决！！
     * @return 返回前端数据
     */
    @RequestMapping(value = "/value")
    @ResponseBody
    public String setupForm(@RequestParam("name") String name, @RequestParam("age") int age) {
        System.out.println("name = " + name + ", age = " + age);
        return "name = " + name + ", age = " + age;
    }

    /*
     * 前端请求: http://localhost:8080/param/data1?account=xx&page=2
     *
     *      @RequestParam注解的value属性对应前端传递的参数名
     *          required属性表示该参数是否必须传递
     *          defaultValue属性表示该参数的默认值
     *
     * @return 返回前端数据
     */
    @GetMapping(value = "/data1")
    @ResponseBody
    public String data1(
            @RequestParam(value = "account", required = true) String username,
            @RequestParam(value = "page", required = false, defaultValue = "1") int page
    ) {
        return "account = " + username + ", page = " + page;
    }


    /**
     * 前端请求: http://localhost:8080/param/mul?hbs=aaa&hbs=bbb
     * <p>
     * 一名多值,可以使用集合接收即可!但是需要使用@RequestParam注解指定
     */
    @GetMapping(value = "/mul")
    @ResponseBody
    public Object mulForm(@RequestParam("hbs") List<String> hbs) {
        System.out.println("hbs = " + hbs);
        return hbs.toString();
    }

    /**
     * 前端请求: http://localhost:8080/param/user?name=xx&age=18
     * <p>
     * 可以直接使用对象接收前端传递的参数!
     * 要求: 前端传递的参数名与对象属性名一致
     * 对象属性类型与前端传递的参数类型一致
     */
    @RequestMapping(value = "/user")
    @ResponseBody
    public String addUser(User user) {
        // 在这里可以使用 user 对象的属性来接收请求参数
        System.out.println("user = " + user);
        return "success";
    }

}
