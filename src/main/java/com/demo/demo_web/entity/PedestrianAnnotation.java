package com.demo.demo_web.entity;
//行人信息
public class PedestrianAnnotation {
    // 特征质量
    private Float quality;
    // 人体位置框，目标检测结果为多边形
    private BoundingPoly rectangle;
    // 物体跟踪id
    private String track_id;
    // 人体属性信息，带属性分数
    private String attributes_with_score;
}
