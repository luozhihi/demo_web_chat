package com.demo.demo_web.entity;

public class CyclistAnnotation {
    //特征质量
    private Float quality;
    // 骑手与非机动车位置框，目标检测结果多边形边界
    private BoundingPoly rectangle;
    // 跟踪id
    private String track_id;
    // 骑手与非机动车属性信息，带属性分数
    private String attribute_with_socre;
}
