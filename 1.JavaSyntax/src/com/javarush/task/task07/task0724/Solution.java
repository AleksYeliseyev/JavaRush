package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human son1 = new Human("Ivan", true, 87);
        Human son2 = new Human("Evgen", true, 78);
        Human d1 = new Human("Helen", false, 77);
        Human d2 = new Human("Lusy", false, 65);
        Human son3 = new Human("Alex", true, 25, son1, d1);
        Human son4 = new Human("Nick", true, 15, son2, d2);
        Human son5 = new Human("Persy", true, 35, son3, son4);
        Human d3 = new Human("Natali", false, 19, son3, son4);
        Human d4 = new Human("Casey", false, 28, son3, son4);

        System.out.println(son1.toString());
        System.out.println(son2.toString());
        System.out.println(d1.toString());
        System.out.println(d2.toString());
        System.out.println(son3.toString());
        System.out.println(son4.toString());
        System.out.println(son5.toString());
        System.out.println(d3.toString());
        System.out.println(d4.toString());
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }
            return text;
        }
    }
}