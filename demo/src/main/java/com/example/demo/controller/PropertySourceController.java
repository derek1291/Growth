package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName PropertySource
 * @Description
 * @Author
 * @Date 2019/3/13  20:24
 */
@RestController
@PropertySource({"classpath:application.properties"})
public class PropertySourceController {

    @Value("${web.file.url}")
    private String url;

    @GetMapping("/resource")
    public void source(){
        System.out.println("url："+url);
    }
}
