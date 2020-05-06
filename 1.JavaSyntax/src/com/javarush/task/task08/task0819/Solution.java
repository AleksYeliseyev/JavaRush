package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Iterator<Cat> iterator = cats.iterator();
        if(iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
        printCats(cats);
    }

    public static Set<Cat> createCats() {
        Set<Cat> kitti = new HashSet<>();
        /*Cat cat1 = new Cat("Barsik");
        Cat cat2 = new Cat("Murka");
        Cat cat3 = new Cat("Snejok");*/
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        kitti.add(cat1);
        kitti.add(cat2);
        kitti.add(cat3);
        return kitti;
    }

    public static void printCats(Set<Cat> cats) {
        for (Cat ccc:cats) {
            System.out.println(ccc.toString());
        }
    }

    public static class Cat{
        /*String name;
        public Cat(String name){
            this.name = name;
        }*/
    }
}
