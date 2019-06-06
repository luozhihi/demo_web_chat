package com.demo.demo_web.entity;
// 抓拍图相对于大图的位置信息
public class PortraitImageLocation {
    //全景大图大小，二维图像大小
    private Size panoramic_image_size;
    // 抓拍小图相对于全景大图的位置，目标检测结果多边形边界
    private BoundingPoly portrait_image_in_panoramic;
    // 抓拍对象相对于大图的位置
    private BoundingPoly portrait_in_panoramic;
}
