package com.demo.demo_web.entity;

public class CrowdIncident {
    // 告警事件id
    private String id;
    // 告警事件类型
    //0:"INCIDENT_CROWD" 过密
    //1:"INCIDENT_STRAND" 滞留
    private String type;
    // 告警事件状态
    //0:"INCIDENT_START" 开始
    //1:"INCIDENT_CONTINUE" 进行中
    //2:"INCIDENT_STOP" 结束
    private String status;
    // 告警事件开始时间
    private String start_time;
    // 告警事件结束时间
    private String stop_time;
    // 告警事件最近一次更新时间
    private String update_time;
}
