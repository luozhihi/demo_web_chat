package com.demo.demo_web.entity;

import com.alibaba.fastjson.annotation.JSONField;

public class User {
    private Long id;
    // 用于websocket中的session的id，每次连接到websocket的时候都会生成一个新的id
    @JSONField(serialize = false)
    private String serial;

    @JSONField(serialize = false)
    private String username;

    @JSONField(serialize = false)
    private String password;

    private String name;
    private Integer gender;
    private Integer age;
    // 用户签名
    private String signature;
    // 用户头像地址
    private String iconUrl;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", serial='" + serial + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", signature='" + signature + '\'' +
                ", iconUrl='" + iconUrl + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }
}
