package com.demo.demo_web.utils;

public class StringUtils {

    public static String convertToJsonString(String json) {
        return json.replace("\\", "").substring(1, json.length() - 1);
    }
}
