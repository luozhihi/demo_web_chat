package com.demo.demo_web.entity;

public class ScenarioObject {
    // 特征质量
    private Float quality;
    // 物体位置框，目标检测结果多边形边界
    private BoundingPoly rectangle;
    //0:"ST_UNKNOWN" 未知
    //1:"ST_STALL" 违规占道经营
    //2:"ST_FIRE" 烟火
    //3:"ST_SLOGAN" 藏疆标语检测
    //4:"ST_LANDSCAPE_LAMP" 景观灯损坏
    //5:"ST_CLUTTER" 工地堆放不当
    //6:"ST_ROAD_CLEAN" 路面清洁（工程车抛洒）
    //7:"ST_SOIL" 工地泥土覆盖
    private String scenario_type;
    // 属性信息，带属性分数
    private String attribute_with_score;
}
