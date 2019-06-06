package com.demo.demo_web.entity;

import java.util.List;

public class ObjectAnnotation {
    // 目标类型
    //0:"OBJECT_UNKNOWN" 未知
    //1:"OBJECT_FACE"  人脸
    //2:"OBJECT_PEDESTRIAN" 行人
    //3:"OBJECT_AUTOMOBILE" 机动车
    //4:"OBJECT_CYCLIST" 骑手
    //5:"OBJECT_HUMAN_POWERED_VEHICLE" 非机动车
    //6:"OBJECT_SCENARIO" 场景识别
    //7:"OBJECT_CROWD"  人群
    //8:"OBJECT_MULTI_PACH" 行人，机动车，骑手，非机动车
    //9:"OBJECT_SCENARIO_CITY_MANAGEMENT" 城管类场景
    //10:"OBJECT_FACE_PEDESTRIAN" 人脸人体联合
    private String type;
    // 人脸信息
    private FaceAnnotation face;
    // 行人信息
    private PedestrianAnnotation pedestrian;
    // 机动车信息
    private AutomobileAnnotation automobile;
    // 非机动车信息
    private HumanPoweredVehicleAnnotation human_powered_vehicle;
    // 骑手与非机动车信息
    private CyclistAnnotation cyclist;
    // 场景识别信息
    private ScenarioAnnotation scenario;
    // 人群识别信息
    private CrowAnnotation crowd;
    // 事件触发信息
    private EventAnnotation event;
    // 抓拍图相对于大图的坐标位置
    private PortraitImageLocation portrait_image_location;
    // 全局唯一对象ID，同一个对象的多个部分并且在同一个跟踪过程的不同图片，同享一个id
    private String object_id;
    // 并联对象列表，入其中的objec_id为空，则关联对象object_id与本对象object_id一致
    //todo 缺少
    private List<ObjectAssociation> associations;

}
