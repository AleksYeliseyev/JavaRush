package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private int age;
        private boolean sex;
        private int chieldCount;
        private boolean haveCat;
        private int catCount;

        public Human(){

        }
        public Human(String name){
            this.name = name;
        }
        public Human(String name, int age){
            this.name = name;
            this.age = age;
        }
        public Human(String name, int age, boolean sex){
            this.name = name;
            this.age = age;
            this.sex = sex;
        }
        public Human(String name, int age, boolean sex, int chieldCount){
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.chieldCount = chieldCount;
        }
        public Human(String name, int age, boolean sex, int chieldCount, boolean haveCat){
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.chieldCount = chieldCount;
            this.haveCat = haveCat;
        }
        public Human(String name, int age, boolean sex, int chieldCount, boolean haveCat, int catCount){
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.chieldCount = chieldCount;
            this.haveCat = haveCat;
            this.catCount = catCount;
        }
        public Human(String name, boolean sex){
            this.name = name;
            this.sex = sex;
        }
        public Human(String name, int chieldCount, int catCount){
            this.name = name;
            this.chieldCount = chieldCount;
            this.catCount = catCount;
        }
        public Human(String name, boolean haveCat, int catCount){
            this.name = name;
            this.haveCat = haveCat;
            this.catCount = catCount;
        }


    }
}
