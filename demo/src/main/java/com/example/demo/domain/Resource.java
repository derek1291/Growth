package com.example.demo.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @ClassName Resource
 * @Description
 * @Author
 * @Date 2019/3/25  13:53
 */
@Configuration
@ConfigurationProperties(prefix = "resource1")
@PropertySource({"classpath:test.properties"})
@Component
public class Resource {
    String url;
    String code;
    String time;

    public String getUrl () {
        return url;
    }

    public void setUrl (String url) {
        this.url = url;
    }

    public String getCode () {
        return code;
    }

    public void setCode (String code) {
        this.code = code;
    }

    public String getTime () {
        return time;
    }

    public void setTime (String time) {
        this.time = time;
    }
}
