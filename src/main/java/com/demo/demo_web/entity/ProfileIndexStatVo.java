package com.demo.demo_web.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(description = "一人一档主页日期统计")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProfileIndexStatVo {

    @ApiModelProperty("日期展示")
    private String dt;
    @ApiModelProperty("日期时间戳")
    private long day;
    @ApiModelProperty("抓拍总数")
    private long totalFeatures;
    @ApiModelProperty("档案总数")
    private long totalClusters;
    @ApiModelProperty("抓拍新增")
    private long incrementalFeatures;
    @ApiModelProperty("档案新增")
    private long incrementalClusters;

}
