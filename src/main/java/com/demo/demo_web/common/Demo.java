package com.demo.demo_web.common;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;

import java.io.File;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) {
//        RestTemplate restTemplate = new RestTemplate();
//        File file = new File("C:\\luozhihui_vendor\\桌面\\离线解析\\task-2b976097-9301-4132-a1a3-ae8a05318347_1.json");
//
//        FileSystemResource resource = new FileSystemResource(file);
//        MultiValueMap<String, Object> param = new LinkedMultiValueMap<>();
//        param.add("file", resource);
//        HttpHeaders headers = new HttpHeaders();
//        headers.setContentType(MediaType.MULTIPART_FORM_DATA);
//        String url =  "http://10.9.240.23:10219/senseface/va-analysisjob/importData";
//        HttpEntity<MultiValueMap<String, Object>> httpEntity = new HttpEntity<MultiValueMap<String, Object>>(param,headers);
//        ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.POST, httpEntity, String.class);
//
////        HttpHeaders headers = new HttpHeaders();
////        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
////        HttpEntity<Object> entity = new HttpEntity<>(file, headers);
////        restTemplate.exchange(url, HttpMethod.POST, entity,String.class);
        File file = new File("C:\\luozhihui_vendor\\桌面\\离线解析\\test.json");
        try {
            LineIterator lineIterator = FileUtils.lineIterator(file);
            int i = 0 ;
            while (lineIterator.hasNext()){
                System.out.println(i);
                i++;
                String next = lineIterator.next();
                JSONObject jsonObject = JSON.parseObject(next);
                System.out.println(jsonObject.getJSONObject("panoramic_image").getString("data"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
