package com.codeqm.cookie;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @since: 2025/6/8 15:30
 * @author: qingmu
 * @description:
 */
@Controller
@RequestMapping("/cookie")
@ResponseBody
public class CookieController {
    /*
     * 前端请求: http://localhost:8080/cookie/set
     *
     * 这里可以设置一个 cookie，通常在实际应用中会通过响应头设置
     */
    @GetMapping("/set")
    public String setCookie(HttpServletResponse response) {
        // 这里可以设置一个 cookie，通常在实际应用中会通过响应头设置
        // 例如：response.addCookie(new Cookie("JSESSIONID", "123456"));
        Cookie cookie = new Cookie("JSESSIONID", "123456");
        response.addCookie(cookie);
        return "Cookie has been set!";
    }

    /*
     * 前端请求: http://localhost:8080/cookie/demo
     *
     * 这里可以获取 cookie 的值，通常在实际应用中会通过请求头获取
     * 例如，通过 @CookieValue 注解获取名为 "JSESSIONID" 的 cookie
     */
    @GetMapping("/demo")
    public String handle(@CookieValue("JSESSIONID") String cookie) {
        System.out.println("cookie = " + cookie);
        return "cookie = " + cookie;
    }
}
