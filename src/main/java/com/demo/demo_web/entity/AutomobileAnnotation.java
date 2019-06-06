package com.demo.demo_web.entity;

public class AutomobileAnnotation {
    // 特征质量
    private Float quality;
    // 机动车位置框，目标检测结果多边形边界
    private BoundingPoly rectangle;
    // 跟踪id
    private String track_id;
    // 机动车属性，带属性分数
    private String attributes_with_score;
}
