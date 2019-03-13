package com.example.demo.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @Description
 * @Author
 * @Date 2019/3/9  13:30
 */
@RestController
public class HelloController {

    @RequestMapping("/")
    public  String index(){
        return "Greetings from Spring Boot!YYYYYYYYYYYYYYY";
    }

}
