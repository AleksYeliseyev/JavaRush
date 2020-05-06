package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        Map<String, Integer> humans = new HashMap<>();
        humans.put("Елисеев", 50000);
        humans.put("Елисеев--", 60000);
        humans.put("Иванов", 300);
        humans.put("Елисеев-", 80000);
        humans.put("Елисеева", 90000);
        humans.put("Елисеева-", 65000);
        humans.put("Иванова", 130);
        humans.put("Петрова", 490);
        humans.put("Сидорова-", 300);
        humans.put("Сидорова", 400);
        return humans;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        Iterator<Map.Entry<String, Integer>> entryIterator = map.entrySet().iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Integer> entry = entryIterator.next();
            if (entry.getValue() < 500) {
                entryIterator.remove();
            }
        }
    }

    public static void main(String[] args){

    }
}