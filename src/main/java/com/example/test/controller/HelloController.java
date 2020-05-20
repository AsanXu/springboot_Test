package com.example.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author xbt
 * @Date 2020/5/10 12:21
 * @Version 1.0
 */
@Controller
public class HelloController {
    @RequestMapping
    public String sayHello(){
        return "index";
    }
}
