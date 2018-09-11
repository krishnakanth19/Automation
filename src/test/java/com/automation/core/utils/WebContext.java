package com.automation.core.utils;

import java.util.HashMap;
import java.util.Map;

public class WebContext {

    private static Map<String,Object> map = new HashMap<String, Object>();

    public static Object getValue(String key) {
        return map.get(key);
    }

    public static void setValue(String key, Object value) {
        map.put(key,value);
    }
}
