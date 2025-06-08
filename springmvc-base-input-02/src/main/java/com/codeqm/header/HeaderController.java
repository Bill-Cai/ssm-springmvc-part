package com.codeqm.header;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @since: 2025/6/8 15:38
 * @author: qingmu
 * @description:
 */
@Controller
@RequestMapping("/header")
@ResponseBody
public class HeaderController {
    /*
     * 前端请求: http://localhost:8080/header/demo
     *
     * 可以利用形参列表,直接接收前端传递的header参数!
     *    要求: 参数名 = 形参名
     *          类型相同
     *
     * @return 返回前端数据
     */
    @GetMapping("/demo")
    public String handle(@RequestHeader("Host") String host) {
        System.out.println("Host = " + host);
        return "Host = " + host;
    }
}
