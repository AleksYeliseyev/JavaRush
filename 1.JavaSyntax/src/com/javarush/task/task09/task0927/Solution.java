package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map<String, Cat> map = new HashMap<>();
        map.put("Murka1", new Cat("Murka1"));
        map.put("Murka2", new Cat("Murka2"));
        map.put("Murka3", new Cat("Murka3"));
        map.put("Murka4", new Cat("Murka4"));
        map.put("Murka5", new Cat("Murka5"));
        map.put("Murka6", new Cat("Murka6"));
        map.put("Murka7", new Cat("Murka7"));
        map.put("Murka8", new Cat("Murka8"));
        map.put("Murka9", new Cat("Murka9"));
        map.put("Murka10", new Cat("Murka10"));
        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> catSet = new HashSet<>(map.values());
        return catSet;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
