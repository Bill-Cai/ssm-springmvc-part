package com.codeqm.error;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @since: 2025/6/9 9:36
 * @author: qm
 * @description:
 */
// @RestControllerAdvice = @ControllerAdvice + @ResponseBody
// @ControllerAdvice 代表当前类的异常处理controller!
@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(value = {NullPointerException.class})
    public Object NullPointerExceptionHandler(NullPointerException e) {
        // 处理 NullPointerException 异常
        System.out.println("捕获到 NullPointerException 异常: " + e.getMessage());
        return "NullPointerException: " + e.getMessage();
    }

    @ExceptionHandler(value = {ArithmeticException.class})
    public Object ArithmeticExceptionHandler(ArithmeticException e) {
        // 处理 ArithmeticException 异常
        System.out.println("捕获到 ArithmeticException 异常: " + e.getMessage());
        return "ArithmeticException: " + e.getMessage();
    }

    @ExceptionHandler(value = {Exception.class})
    public Object ExceptionHandler(Exception e) {
        // 处理其他异常
        System.out.println("捕获到 Exception 异常: " + e.getMessage());
        return "Exception: " + e.getMessage();
    }
}
