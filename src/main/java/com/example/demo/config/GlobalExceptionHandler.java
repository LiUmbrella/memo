package com.example.demo.config;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

/**
 * 全局异常捕获
 *
 * @author lixiang
 * @since 2019/5/23 18:04
 */
@ControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(value = {RuntimeException.class})
    @ResponseBody
    public String exception(HttpServletResponse response) {
        response.setStatus(501);
        response.setHeader("myHeader", "otutoutoutou");

        System.out.println(response.toString());
        return "";
    }
}
