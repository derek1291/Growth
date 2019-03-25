package com.example.demo.controller;

import com.example.demo.domain.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName PropertySource
 * @Description 配置文件读取
 * @Author
 * @Date 2019/3/13  20:24
 */
@RestController
@PropertySource({"classpath:test.properties"})
@EnableConfigurationProperties(Resource.class)
public class PropertySourceController {

    @Value("${web.file.url2}")
    private String url;

    @Autowired
    private Resource resource;

    /**
     * 配置文件映射到属性
     */
    @GetMapping("/resource")
    public void source(){
        System.out.println("url："+url);
    }

    /**
     * 配置文件映射到实体类
     * @return
     */
    @GetMapping("/resource1")
    @ResponseBody
    public Object source1(){
        Map map = new HashMap();
        map.put("data",resource);
        return map;
    }

}
