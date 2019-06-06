package com.demo.demo_web.entity;
// 关联对象
public class ObjectAssociation {
    //关联对象类型
    //0:"OBJECT_UNKNOWN"
    //1:"OBJECT_FACE"
    //2:"OBJECT_PEDESTRIAN"
    //3:"OBJECT_AUTOMOBILE"
    //4:"OBJECT_CYCLIST"
    //5:"OBJECT_HUMAN_POWERED_VEHICLE"
    //6:"OBJECT_SCENARIO"
    //7:"OBJECT_CROWD"
    //8:"OBJECT_MULTI_PACH"
    //9:"OBJECT_SCENARIO_CITY_MANAGEMENT"
    //10:"OBJECT_FACE_PEDESTRIAN"
    private String type;
    // 可选，关联目标对象object_id,如果为空则与本对象一致
    private String object_id;
}
