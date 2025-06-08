package com.codeqm.jsp;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @since: 2025/6/8 16:31
 * @author: qingmu
 * @description:
 */
@Controller
@RequestMapping("/jsp")
public class JspController {
    /*
     * 快速查找视图
     * - 方法的返回值为字符串
     * - 不能添加 @ResponseBody
     * - 返回值 对应视图名称（例如 /WEB-INF/views/index.jsp -> index )
     */
    @GetMapping("/index")
    public String index(HttpServletRequest httpServletRequest) {
        httpServletRequest.setAttribute("data", "Hello jsp!");
        System.out.println("JspController.index");
        return "index";
    }
}
