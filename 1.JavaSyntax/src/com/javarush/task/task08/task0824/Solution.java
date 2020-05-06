package com.javarush.task.task08.task0824;

import java.util.ArrayList;
import java.util.List;

/* 
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {


        Human son1 = new Human("Mike", true, 6, new ArrayList<Human>(0));
        Human son2 = new Human("Bike", true, 8, new ArrayList<Human>(0));
        Human son3 = new Human("Fike", true, 9, new ArrayList<Human>(0));
        ArrayList<Human> children = new ArrayList<Human>(3);
        children.add(son1);
        children.add(son2);
        children.add(son3);
        Human dad = new Human("Jack", true, 45, children);
        Human mom = new Human("Ginger", false, 37, children);
        ArrayList<Human> childrenMom = new ArrayList<Human>(1);
        childrenMom.add(mom);
        Human ded1 = new Human("John", true, 78, childrenMom);
        Human bab1 = new Human("Susan", false, 73, childrenMom);
        ArrayList<Human> childrenDad = new ArrayList<Human>(1);
        childrenDad.add(dad);
        Human ded2 = new Human("Smith", true, 67, childrenDad);
        Human bab2 = new Human("Rose", false, 61, childrenDad);


        System.out.println(ded1.toString());
        System.out.println(ded2.toString());
        System.out.println(bab1.toString());
        System.out.println(bab2.toString());
        System.out.println(dad.toString());
        System.out.println(mom.toString());
        System.out.println(son1.toString());
        System.out.println(son2.toString());
        System.out.println(son3.toString());
    }

    public static class Human {
        String name;
        Boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
