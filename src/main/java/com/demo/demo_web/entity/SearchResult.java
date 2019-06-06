package com.demo.demo_web.entity;


public class SearchResult {
    // 结果对象标识
    private ObjectIdentifier object_id;
    // 结果对象抓拍图，只包含url
    private Image portrait_image;
    // 结果对象全图，只包含url
    private Image panoramic_iamge;
    // 对象标注信息
    private ObjectAnnotation object;
    // 业务附带额外信息
    private String extra_info;
    // 归一化后检索得分
    private Float score;
    // 聚类id
    private String cluster_id;
}
