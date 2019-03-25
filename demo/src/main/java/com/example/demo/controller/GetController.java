package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName GetController
 * @Description get请求
 * @Author
 * @Date 2019/3/9  15:20
 */
@RestController
public class GetController {

    /**
     * 从路径中获取字段
     * @param usrId
     * @param pwd
     * @return
     */
    @RequestMapping(path = "/get1/{usrid}/{pwd}",method = RequestMethod.GET)
    public Map<String,Object> get1(@PathVariable("usrid") String usrId, @PathVariable("pwd")String pwd){
        Map<String,Object> map = new HashMap<>();
        map.put("method","get1");
        map.put("usrId",usrId);
        map.put("pwd",pwd);
        return map;
    }

    /**
     * get请求简化写法
     * @param usrId
     * @param pwd
     * @return
     */
    @GetMapping(path = "/get2/{usrid}/{pwd}")
    public Map<String,Object> get2(@PathVariable("usrid") String usrId, @PathVariable("pwd")String pwd){
        Map<String,Object> map = new HashMap<>();
        map.put("method","get2");
        map.put("usrId",usrId);
        map.put("pwd",pwd);
        return map;
    }

    /**
     * 获取get请求参数
     * @param usrId
     * @param pwd
     * @return
     */
    @RequestMapping(path = "/get3",method = RequestMethod.GET)
    public Map<String,Object> get3(@RequestParam("usrid") String usrId, @RequestParam("pwd")String pwd){
        Map<String,Object> map = new HashMap<>();
        map.put("method","get3");
        map.put("usrId",usrId);
        map.put("pwd",pwd);
        return map;
    }

    /**
     * 获取get请求参数，默认值，必传
     * @param usrId
     * @param pwd
     * @return
     */
    @RequestMapping(path = "/get4",method = RequestMethod.GET)
    public Map<String,Object> get4(@RequestParam(defaultValue = "mwf" ,name="usrid" , required = true) String usrId, @RequestParam(name = "pwd" , required = true)String pwd){
        Map<String,Object> map = new HashMap<>();
        map.put("method","get4");
        map.put("usrId",usrId);
        map.put("pwd",pwd);
        return map;
    }

    /**
     * 获取http请求头里的信息
     * @param usrId
     * @param pwd
     * @return
     */
    @GetMapping(path = "/get5")
    public Map<String,Object> get5(@RequestHeader("token") String token , @RequestParam("usrid") String usrId, @RequestParam("pwd") String pwd){
        Map<String,Object> map = new HashMap<>();
        map.put("method","get5");
        map.put("token",token);
        map.put("usrId",usrId);
        map.put("pwd",pwd);
        return map;
    }
    /**
     * 通过Request获取参数
     * @param request
     * @return
     */
    @GetMapping(path = "/get6")
    public Map<String,Object> get6(HttpServletRequest request){
        Map<String,Object> map = new HashMap<>();
        map.put("method","get6");
        map.put("usrId",request.getParameter("usrid"));
        map.put("pwd",request.getParameter("pwd"));
        return map;
    }


}
