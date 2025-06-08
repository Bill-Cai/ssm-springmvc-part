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

    /*
     * 在 Spring MVC 中，Handler 方法返回值来实现快速转发，可以使用 redirect 或者 forward 关键字来实现重定向。
     * - 将方法的返回值，设置String类型
     * - 转发使用forward关键字，重定向使用redirect关键字
     * - 关键字: /路径
     * - 注意：如果是项目下的资源，转发和重定向都一样都是项目下路径！都不需要添加项目根路径！
     * 注意： 转发和重定向到项目下资源路径都是相同，都不需要添加项目根路径！填写项目下路径即可！
     * - 转发只能转发到项目内的路径。
     *     项目下地址 /jsp/index
     *     忽略 Application context (tomcat部署时设置)
     * - 重定向可以重定向到项目外的路径，属于二次请求。
     *     外部地址 需要全地址
     */

    @RequestMapping("/redirect-index")
    public String redirectIndex() {
        System.out.println("JspController.redirectIndex");
        // 重定向到 /index 路径
        return "redirect:/jsp/index";
    }

    @RequestMapping("/forward-index")
    public String forwardIndex() {
        System.out.println("JspController.forwardIndex");
        // 转发到 /index 路径
        return "forward:/jsp/index";
    }
    @RequestMapping("/redirect")
    public String redirect() {
        System.out.println("JspController.redirect");
        // 重定向到外部地址
        return "redirect:https://www.baidu.com";
    }
}
