package com.javarush.task.task08.task0817;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> humans = new HashMap<>();
        humans.put("Ивнов", "Антон");
        humans.put("Елисеев", "Алексей");
        humans.put("Петров", "Алексей");
        humans.put("Куприянов", "Алексей");
        humans.put("Елисеева", "Елена");
        humans.put("Ковалева", "Екатерина");
        humans.put("Иванова", "Юля");
        humans.put("Петрова", "Юля");
        humans.put("Доброва", "Юля");
        humans.put("Сидорова", "Наталья");
        return humans;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        Map<String, String> copy2 = new HashMap<>(map);
        Map<String, String> copy3 = new HashMap<>(map);

        for (Map.Entry<String, String> pair : copy2.entrySet()) {
            int count = 0;
            for (Map.Entry<String, String> pair2 : copy3.entrySet()) {
                if (pair.getValue().equals(pair2.getValue())) {
                    count++;
                    if (count > 1) {
                        removeItemFromMapByValue(map, pair.getValue());
                        count = 0;
                    }
                }
            }
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}
