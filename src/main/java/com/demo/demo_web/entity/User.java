package com.demo.demo_web.entity;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
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

    public void setName(String name){
        System.out.println("使用自己写的set");
        this.name = name;
    }
}
