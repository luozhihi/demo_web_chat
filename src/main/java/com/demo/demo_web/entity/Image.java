package com.demo.demo_web.entity;

public class Image {
    // 图片的格式，枚举类型，有六种，
    //0:"IMAGE_UNKNOWN"
    //1:"IMAGE_JPEG"
    //2:"IMAGE_PNG"
    //3:"IMAGE_BMP"
    //4:"IMAGE_TIFF"
    //5:"IMAGE_GIF"
    private String format;
    // 原始图片数据，base64
    private String data;
    // 图片的网络地址
    private String url;
}
