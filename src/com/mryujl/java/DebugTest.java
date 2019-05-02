package com.mryujl.java;

import java.util.HashMap;

/**
 * @author mryujl
 * @date 2019-05-02 18:17
 */
public class DebugTest {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
        HashMap<String, String> map = new HashMap<>();
        map.put("name", "Tom");
        map.put("age", "12");
        map.put("school", "Tsinghua");
        map.put("major", "computer");

        String age = map.get("age");
        System.out.println(age);

        map.remove("major");
        System.out.println(map);


    }
}
