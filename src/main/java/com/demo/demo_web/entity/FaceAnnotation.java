package com.demo.demo_web.entity;


import java.util.List;

public class FaceAnnotation {
    // 特征质量，如对象不包含特征信息则返回0
    private Float quality;
    // 人脸位置框相当于抓拍图坐标，目标检测结果多边形边界
    private BoundingPoly rectangle;
    // 物体跟踪id，仅保证本次视频源链接中递增，全局或重连后不唯一
    private String track_id;
    // 人脸角度信息
    private Angle angle;
    // 人脸关键点位信息
    private List<Vertex> landmarks;
    // 人脸属性信息
    private String attributes;
    // 人脸属性信息，带属性分数
    private String attributes_with_score;
    // 人脸质量分数
    // todo 缺少
    private Float face_score;
}
