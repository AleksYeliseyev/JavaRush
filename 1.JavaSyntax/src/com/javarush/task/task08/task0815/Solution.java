package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> humans = new HashMap<>();
        humans.put("Елисеев", "Антон");
        humans.put("Елисеев--", "Алексей");
        humans.put("Иванов", "Алексей");
        humans.put("Елисеев-", "Алексей");
        humans.put("Елисеева", "Елена");
        humans.put("Елисеева-", "Екатерина");
        humans.put("Иванова", "Ольга");
        humans.put("Петрова", "Ольга");
        humans.put("Сидорова-", "Светлана");
        humans.put("Сидорова", "Наталья");
        return humans;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int count = 0;
        for (Map.Entry<String, String> pair: map.entrySet()){
            String first = pair.getValue();
            if (first.equals(name)){
                count++;
                //System.out.println("first count++");
                //System.out.println(pair.getKey() + " " + pair.getValue());
            }
        }
        return count;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int count = 0;
        for (Map.Entry<String, String> pair: map.entrySet()){
            String second = pair.getKey();
            if (second.equals(lastName)){
                count++;
                //System.out.println("second count++");
                //System.out.println(pair.getKey() + " " + pair.getValue());
            }
        }
        return count;

    }

    public static void main(String[] args) {
        //Map<String,String> map = createMap();
        //System.out.println(getCountTheSameFirstName(map,"Алексей"));
        //System.out.println(getCountTheSameLastName(map,"Елисеев"));
    }
}
