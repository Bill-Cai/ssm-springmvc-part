package com.codeqm.path;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @since: 2025/6/8 15:02
 * @author: qingmu
 * @description:
 */
@Controller
@RequestMapping("/path")
public class PathController {
    /**
     * 动态路径设计: /user/{动态部分}/{动态部分}   动态部分使用{}包含即可! {}内部动态标识!
     * 形参列表取值: @PathVariable Long id  如果形参名 = {动态标识} 自动赋值!
     *
     * @PathVariable("动态标识") Long id  如果形参名 != {动态标识} 可以通过指定动态标识赋值!
     * <p>
     * 访问测试:  /path/user/1/root  -> id = 1  uname = root
     */
    @GetMapping("/user/{id}/{name}")
    @ResponseBody
    public String getUser(@PathVariable("id") Long id,
                          @PathVariable("name") String uname) {
        System.out.println("id = " + id + ", uname = " + uname);
        return "user_detail: id = " + id + ", uname = " + uname;
    }
}
