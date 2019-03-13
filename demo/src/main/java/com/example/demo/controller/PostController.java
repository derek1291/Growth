package com.example.demo.controller;

import com.example.demo.domain.User;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName PostController
 * @Description post 请求需要将http请求头 的content-type 设置为Applocation/json
 * @Author
 * @Date 2019/3/9  16:11
 */
@RestController
public class PostController {
    /**
     * 从路径中获取字段
     * @return
     */
    @RequestMapping(path = "/post",method = RequestMethod.POST)
    public Map<String,Object> post(@RequestBody User usr){
        Map<String,Object> map = new HashMap<>();
        map.put("usr",usr);
        return map;
    }
}
