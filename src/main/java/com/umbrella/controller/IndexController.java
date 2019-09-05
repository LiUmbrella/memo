package com.umbrella.controller;

import com.umbrella.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * 首页
 *
 * @author lixiang
 * @since 2019/5/23 17:24
 */
@RestController
@RequestMapping("/index")
public class IndexController {
    @Autowired
    private BusinessService businessService;

    @GetMapping("/hello")
    public String hello(HttpServletResponse request) {
        return businessService.hello();
    }
}
