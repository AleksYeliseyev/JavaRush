package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String granFatherName = reader.readLine();      //  ДЕД
        Cat catGranFather = new Cat(granFatherName);

        String granMotherName = reader.readLine();      //  БАБКА
        Cat catGranMother = new Cat(granMotherName);

        String fatherName = reader.readLine();      //  ПАПА
        Cat catFather = new Cat(fatherName, catGranFather, null);

        String motherName = reader.readLine();      //  МАМА
        Cat catMother = new Cat(motherName, null, catGranMother);

        String sonName = reader.readLine();        // СЫН
        Cat catSon = new Cat(sonName, catFather, catMother);

        String daughterName = reader.readLine();        // ДОЧЬ
        Cat catDaughter = new Cat(daughterName, catFather, catMother);

        System.out.println(catGranFather);
        System.out.println(catGranMother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat father;
        private Cat mother;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat father, Cat mother) {
            this.name = name;
            this.father = father;
            this.mother = mother;
        }

        @Override
        public String toString() {
            if ((father == null) && (mother == null))
                return "The cat's name is " + name + ", no mother, no father";
            else if (mother == null)
                return "The cat's name is " + name + ", no mother, father is " + father.name;
            else if (father == null)
                return "The cat's name is " + name + ", mother is " + mother.name + ", no father";
            else return "The cat's name is " + name + ", mother is " + mother.name + ", father is " + father.name;
        }
    }
}
