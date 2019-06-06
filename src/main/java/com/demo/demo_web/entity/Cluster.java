package com.demo.demo_web.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Cluster {
    // 聚类id
    private String cluster_id;
    // 聚类创建时间
    private String created_ad;
    // 聚类更新时间
    private String modified_at;
    // 用户自定义的key，由系统自动计算生成，可通过labeling系列接口配置自动标签任务
    private String key;
    // 用户自定义的附加信息
    private String extra_info;
    // 聚类包含的特征列表，按抓取时间顺序排列
    private List<SearchResult> results;
    // 聚类搜索接口返回比对分值，其他接口返回无意义
    private Float score;
    // 仅在ClusterSearch或ClusterGetByKey且load_mode为CLUSTER_LOAD_PERVIEW时有效，其中包括此类中部分特征的详细信息
    private List<SearchResult> preview_results;
    // senseTime 通用特征格式
    //todo 缺少
    private ObjectFeature centroid;
}
