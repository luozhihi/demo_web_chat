package com.demo.demo_web.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

/**
 * 一人一档主页统计
 */
@ApiModel(description = "一人一档主页统计")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProfileIndexStatResponse {

    @ApiModelProperty("档案总数")
    private long totalClusters;

    @ApiModelProperty("特征总数")
    private long totalFeatures;

    @ApiModelProperty("点位总数")
    private long totalResource;

    @ApiModelProperty("昨日新增档案")
    private long yesterdayIncrementalClusters;

    @ApiModelProperty("昨日更新旧档案")
    private long yesterdayUpdatedClusters;

    @ApiModelProperty("昨日新增抓拍")
    private long yesterdayIncrementalFeatures;

    @ApiModelProperty("归档档案总数")
    private long totalLabeledClusters;

    @ApiModelProperty("未归档档案总数")
    private long totalUnlabeledClusters;

    @ApiModelProperty("昨日新增档案占比")
    private BigDecimal yesterdayIncrementalClustersRate;

    @ApiModelProperty("昨日新增抓拍占比")
    private BigDecimal yesterdayIncrementalFeaturesRate;

    @ApiModelProperty("每日统计")
    private List<ProfileIndexStatVo> dailyStat;





}


