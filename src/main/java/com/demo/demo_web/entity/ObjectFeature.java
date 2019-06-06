package com.demo.demo_web.entity;
// senseTime通用特征格式
public class ObjectFeature {
    // 特征对象类型，为对应objectType的字符串表示
    private String type;
    // 特征模型版本，对应sdk模型版本号
    private Integer version;
    // 特征数据，完整标准特征序列化格式，范围，json表示为base64编码字符串
    private Byte blob;
}
