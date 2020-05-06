package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
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
        humans.put("Иванова", "Наталья");
        return humans;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
