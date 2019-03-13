package com.example.demo.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

/**
 * @ClassName User
 * @Description
 * @Author
 * @Date 2019/3/9  16:25
 */
public class User {

    String usrId;

    @JsonIgnore
    String pwd;

    Integer age;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("cusdd")
    String phone;

    @JsonFormat(pattern="yyyy-MM-dd hh:mm:ss",locale="zh",timezone="GMT+8")
    Date time;

    public User (String usrId, String pwd, Integer age, String phone, Date time) {
        this.usrId = usrId;
        this.pwd = pwd;
        this.age = age;
        this.phone = phone;
        this.time = time;
    }

    public String getUsrId () {
        return usrId;
    }

    public void setUsrId (String usrId) {
        this.usrId = usrId;
    }

    public String getPwd () {
        return pwd;
    }

    public Integer getAge () {
        return age;
    }

    public void setAge (Integer age) {
        this.age = age;
    }

    public String getPhone () {
        return phone;
    }

    public void setPhone (String phone) {
        this.phone = phone;
    }

    public Date getTime () {
        return time;
    }

    public void setTime (Date time) {
        this.time = time;
    }

    public void setPwd (String pwd) {
        this.pwd = pwd;
    }
}
