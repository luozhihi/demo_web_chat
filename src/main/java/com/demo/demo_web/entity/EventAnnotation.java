package com.demo.demo_web.entity;
// 事件触发信息
public class EventAnnotation {
    // 全局唯一事件id
    private String event_id;
    // 触发规则
    private EventRule rule;
    // 物体位置框，目标检测结果多边形边界
    private BoundingPoly rectangle;
}
