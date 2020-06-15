package com.javarush.task.task17.task1711;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        //start here - начни тут

        // Присвоение id в переменную index
        int index;
        switch (args[0]) {
            case ("-c"):
                Person newPerson = null;
                for (int i = 1; i < args.length; i = i + 3) {
                    if (args[i+1].equals("м")) {
                        newPerson = Person.createMale(args[i], new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[i+2]));
                    } else if (args[i+1].equals("ж")) {
                        newPerson = Person.createFemale(args[i], new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[i+2]));
                    }
                    allPeople.add(newPerson);
                    System.out.println(allPeople.indexOf(newPerson));
                }
                break;

            case ("-u"):
                for (int i = 1; i < args.length; i = i + 4) {
                    // Изменение данных по id
                    index = Integer.parseInt(args[i]);
                    allPeople.get(index).setName(args[i+1]);
                    if (args[i+2].equals("м")) {
                        allPeople.get(index).setSex(Sex.MALE);
                    } else allPeople.get(index).setSex(Sex.FEMALE);
                    allPeople.get(index).setBirthDate(new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[i+3]));
                }
                break;

            case ("-i"):
                String sex;
                for (int i = 1; i < args.length ; i++) {
                    index = Integer.parseInt(args[i]);
                    String name = allPeople.get(Integer.parseInt(args[i])).getName();
                    if (allPeople.get(index).getSex() == Sex.MALE) {
                        sex = "м";
                    } else sex = "ж";
                    String dateBirth = new SimpleDateFormat("dd-MMMM-yyyy", Locale.ENGLISH).format(allPeople.get(index).getBirthDate());
                    System.out.println(name + " " + sex + " " + dateBirth);
                }
                break;

            case ("-d"):
                for (int i = 1; i < args.length; i++) {
                    // Удаление данных по id
                    index = Integer.parseInt(args[i]);
                    allPeople.get(index).setName(null);
                    allPeople.get(index).setSex(null);
                    allPeople.get(index).setBirthDate(null);
                }
                break;
            default:
                //>>>  TEST START
                // Вывод объектов, созданных в static
                System.out.println("*********TEST**********");
                for (int i = 0; i < allPeople.size(); i++) {
                    System.out.println("People created, id: " + allPeople.get(i).getName());
                }
                System.out.println("*********TEST**********");
                System.out.println();
                //<<<  TEST END
        }
    }
}
