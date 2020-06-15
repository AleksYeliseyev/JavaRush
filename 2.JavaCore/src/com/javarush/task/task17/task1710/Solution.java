package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
        //allPeople.add(Person.createFemale("Петрова Ирина", new Date()));  //сегодня родился    id=2
    }

    public static void main(String[] args) throws ParseException {
        //start here - начни тут

        // Тестовый вывод аргументов, переданных в main
        /*for (int i = 0; i < args.length; i++) {
            System.out.println("param1 - " + args[i]);
        }*/

        //>>>  TEST START
        // Вывод объектов, созданных в static
        /*System.out.println("*********TEST**********");
        for (int i = 0; i < allPeople.size(); i++) {
            System.out.println("People created, id: " + allPeople.get(i).getName());
        }
        System.out.println("*********TEST**********");
        System.out.println();*/
        //<<<  TEST END

        /*if (args == null){
            return;
        }*/

        if (args[0].equals("-c") && args[2].equals("м")) {
            Person newPerson = Person.createMale(args[1], new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[3]));
            allPeople.add(newPerson);
            System.out.println(allPeople.indexOf(newPerson));
        } else if (args[0].equals("-c") && args[2].equals("ж")) {
            Person newPerson = Person.createFemale(args[1], new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[3]));
            allPeople.add(newPerson);
            System.out.println(allPeople.indexOf(newPerson));
        }

        if (args[0].equals("-u")) {
            // Тестовый вывод аргументов, переданных в main
            /*System.out.println("args0 : " + args[0]);
            System.out.println("args0 : " + args[1]);
            System.out.println("args0 : " + args[2]);
            System.out.println("args0 : " + args[3]);
            System.out.println("args0 : " + args[4]);*/

            // Присвоение id в переменную index
            int index = Integer.parseInt(args[1]);

            // тестовый вывод существующей записи
            /*System.out.println("index: " +  index);
            System.out.println("name:" + allPeople.get(index).getName());
            System.out.println("sex:" + allPeople.get(index).getSex());
            System.out.println("birth:" + allPeople.get(index).getBirthDate());*/

            // Изменение данных по id
            allPeople.get(index).setName(args[2]);
            if (args[3].equals("м")){
                allPeople.get(index).setSex(Sex.MALE);
            } else allPeople.get(index).setSex(Sex.FEMALE);
            allPeople.get(index).setBirthDate(new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[4]));

            // Тестовый вывод измененной записи
            /*System.out.println(allPeople.get(index).getName());
            System.out.println(allPeople.get(index).getSex());
            System.out.println(allPeople.get(index).getBirthDate());*/
        }

        if (args[0].equals("-i")) {
            /*System.out.println("args 0 - " + args[0]);
            System.out.println("args 1 - " + args[1]);*/  //TEST

            // Присвоение id в переменную index
            int index = Integer.parseInt(args[1]);

            String sex;
            String name = allPeople.get(Integer.parseInt(args[1])).getName();
            if (allPeople.get(index).getSex() == Sex.MALE) {
                sex = "м";
            } else sex = "ж";
            String dateBirth = new SimpleDateFormat("dd-MMMM-yyyy", Locale.ENGLISH).format(allPeople.get(index).getBirthDate());
            System.out.println(name + " " + sex + " " + dateBirth);
        }

        if (args[0].equals("-d")) {
            /*System.out.println("args 0 - " + args[0]);
            System.out.println("args 1 - " + args[1]);*/  //TEST

            // Присвоение id в переменную index
            int index = Integer.parseInt(args[1]);

            // Удаление данных по id
            allPeople.get(index).setName(null);
            allPeople.get(index).setSex(null);
            allPeople.get(index).setBirthDate(null);
        }

        //>>>  TEST START
        // Вывод объектов, созданных в static и измененных в программе
        /*System.out.println("*********TEST**********");
        for (int i = 0; i < allPeople.size(); i++) {
            System.out.println("People created, id: " + allPeople.get(i).getName());
        }
        System.out.println("*********TEST**********");
        System.out.println();*/
        //<<<  TEST END
    }
}
