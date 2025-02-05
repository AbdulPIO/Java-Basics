package com.programmersio.javabasics.week3day3.hashmap;

import java.util.HashMap;
import java.util.Map;

public class NestingHashMap {
    public static void main(String[] args) {
        Map<String, Map<String, Object>> userProfile = new HashMap<>();

        Map<String, Object> profile = new HashMap<>();
        profile.put("age", 23);
        profile.put("department", "UI");
        profile.put("city", "Jaipur");

        userProfile.put("Abdul", profile);

        profile = new HashMap<>();
        profile.put("age", 25);
        profile.put("department", "HR");
        profile.put("city", "Jaipur");

        userProfile.put("John", profile);

        System.out.println("userProfile: " + userProfile);

        Map<String, Object> profile1 = userProfile.get("John");
        String department = (String) profile1.get("department");
        System.out.println("Department: " + department);
    }
}
