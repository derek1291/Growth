package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jws.Oneway;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName ExceptionController
 * @Description 抛出异常累
 * @Author
 * @Date 2019/3/28  19:02
 */
@RestController
public class ExceptionController {

    @GetMapping("/exception")
    public Object exceptionHandler(){
        Map<String,Object> map = new HashMap<String, Object>();
        int i = 1/0;
        map.put("result","success");
        return map;
    }
}
