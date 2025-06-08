package com.codeqm.json;

import com.codeqm.pojo.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @since: 2025/6/8 15:13
 * @author: qingmu
 * @description:
 */
@Controller
@RequestMapping("/json")
public class JsonController {
    /*
     * 前端请求: http://localhost:8080/json/person
     * 请求体中包含 JSON 数据：{"name": "张三", "age": 18, "gender": "男"}
     *
     * 报错：org.springframework.web.HttpMediaTypeNotSupportedException: Content-Type 'application/json;charset=UTF-8' is not supported
     * * 解决方法：需要在 Spring MVC 配置中添加 Jackson 的支持
     */
    @PostMapping("/person")
    @ResponseBody
    public String addPerson(@RequestBody Person person) {
        // 在这里可以使用 person 对象来操作 JSON 数据中包含的属性
        return "success: " + person.toString();
    }
}
