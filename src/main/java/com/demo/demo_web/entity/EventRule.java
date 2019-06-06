package com.demo.demo_web.entity;

import java.util.Vector;

public class EventRule {
    // 事件类型
    //0:"EVENT_UNKNOWN"     未知
    //1:"EVENT_PEDESTRIAN_STAY" 逗留
    //2:"EVENT_PEDESTRIAN_HOVER"  可疑人员徘徊
    //3:"EVENT_PEDESTRIAN_CROSS_LINE"  越线时间
    //4:"EVENT_PEDESTRIAN_INVADE" 区域入侵事件
    //5:"EVENT_VEHICLE_PARK" 违停事件
    private String type;
    // 规则id，下发任务时未指定则自动生成
    private String rule_id;
    //可选, ROI区域. - 对于使用多边形作为区域的事件, 一般传入至少4个点, 顺时针方向, 不要求闭合, 不填或置空表示全画面; - 对于跨线事件, 必须传入两个点表示参考线, 建议参考线尽量穿过画面中部区域, 以达到更好的检测效果; - 各点的坐标为画面下的百分比坐标(如顶点可以表示1920x1080分标率画面下的点), 前后端根据实际分辨率进行换算. 多边形, 可用于表示ROI
    private BoundingPoly roi;
    // 时长
    private String duration;
    // 物体位置框，目标检测结果多边形边界
    private Vector rectangle;
}
