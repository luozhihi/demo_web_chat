package com.demo.demo_web.common;

public enum CommonConstant {
    CURRENT_WANGING_NUMBER("00001","错误信息1");

    private String code;
    private String message;
    public static String getMessage(String code){
        for (CommonConstant c : CommonConstant.values()){
            if(c.getCode().equals(code)){
                return c.getMessage();
            }
        }
        return "";
    }
    CommonConstant(String code,String message){
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}