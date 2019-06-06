package com.demo.demo_web.controller;

import java.io.*;
import java.util.Base64;

public class Demo {
    public static void main(String[] args) {
//        String base64 = ImageToBase64("C:\\luozhihui_vendor\\桌面\\离线解析\\结构化照片\\test7.jpg");
        String base64 = ImageToBase64("C:\\luozhihui_vendor\\桌面\\离线解析\\结构化照片\\test5.jpg");
        Integer fileLength = getFileLength(base64);
        System.out.println(base64);
        System.out.println(fileLength);
    }

    private static String ImageToBase64(String imgPath) {
        byte[] data = null;
        // 读取图片字节数组
        try {
            InputStream in = new FileInputStream(imgPath);
            data = new byte[in.available()];
            in.read(data);
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 返回Base64编码过的字节数组字符串
        return Base64.getEncoder().encodeToString(data);
    }

    private static Integer getFileLength(String base64){
        byte[] bytes = Base64.getDecoder().decode(base64);
//        sout
//        if(base64.indexOf(",")>0){
//            base64 = base64.substring(base64.indexOf(","));
//        }
//        base64 = base64.replace("=","");
//        Integer fileLength = (base64.length()-(int)(new Double(base64.length())/8)*2);
        return bytes.length;
    }
    public static Long base64ToFile(String base64) {
        File file = null;
        //创建文件目录
        String filePath = "C:\\luozhihui_vendor\\桌面\\";
        File dir = new File(filePath);
        if (!dir.exists() && !dir.isDirectory()) {
            dir.mkdirs();
        }
        BufferedOutputStream bos = null;
        java.io.FileOutputStream fos = null;
        try {
            byte[] bytes = Base64.getDecoder().decode(base64);
            file = new File(filePath + "/" + "temp.jpg");
            fos = new java.io.FileOutputStream(file);
            bos = new BufferedOutputStream(fos);
            bos.write(bytes);
            return file.length();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (bos != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            file.delete();
        }
        return null;
    }
}
