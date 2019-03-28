package com.example.demo.domain;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName ExceptionHandler
 * @Description
 * @Author
 * @Date 2019/3/28  19:18
 */
//@ControllerAdvice
@RestControllerAdvice
public class ExceptionWholeHandler {

    @ExceptionHandler(value = Exception.class)
    //@ResponseBody
    Object handlerException(Exception e, HttpServletRequest request){
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("code",100);
        map.put("message",e.getMessage());
        map.put("url",request.getRequestURL());
        return map;
    }
}
