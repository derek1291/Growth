package com.example.demo.controller;

import com.example.demo.domain.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @ClassName JackSon
 * @Description JackSon 测试
 * @Author
 * @Date 2019/3/9  16:56
 */
@RestController
public class JackSon {

    @GetMapping("/jackson")
    public Object jackson (){
        System.out.println("11112223334455");
        return new User ("123","abc",32,"2838784",new Date());
    }
}
