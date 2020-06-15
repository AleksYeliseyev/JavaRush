package com.javarush.task.task17.task1721;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Транзакционность
*/

public class Solution {
    public static String firstFileName;
    public static String secondFileName;
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {

        //Считываем два имени файла
        try {
            firstFileName = (new BufferedReader(new InputStreamReader(System.in))).readLine();

        } catch (IOException e) {
            //System.out.println("ERROR!!!");
        }
        try {
            secondFileName = (new BufferedReader(new InputStreamReader(System.in))).readLine();
        } catch (IOException e) {
            //System.out.println("ERROR!!!");
        }
//        firstFileName = "file1.txt";
//        secondFileName = "file2.txt";

        // Присваиваем в массивы данные из файлов
        allLines = readFile(firstFileName);
        forRemoveLines = readFile(secondFileName);

        // TEST START
//        System.out.println("before remove");
//        System.out.println("List 1");
//        for (String all : allLines) {
//            System.out.println(all);
//        }
//
//        System.out.println("List 2");
//        for (String all : forRemoveLines) {
//            System.out.println(all);
//        }
        // TEST END

        try {
            new Solution().joinData();
        } catch (CorruptedDataException e) {
            //e.printStackTrace();
        }
        // TEST START
//        System.out.println("after remove");
//        System.out.println("List 1");
//        for (String all : allLines) {
//            System.out.println(all);
//        }
//
//        System.out.println("List 2");
//        for (String all : forRemoveLines) {
//            System.out.println(all);
//        }
        // TEST END
    }

    public static ArrayList<String> readFile(String fileName) {
        ArrayList<String> result = new ArrayList<String>();
        BufferedReader filereader = null;
        try {
            filereader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
            String line;
            while (filereader.ready()) {
                line = filereader.readLine();
                /*if (line.isEmpty()) {
                    continue;
                }*/
                result.add(line);
            }
            filereader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    public void joinData() throws CorruptedDataException {

        // TEST START
//        System.out.println("sorted");
//        System.out.println("List 1");
//        for (String all : allLines) {
//            System.out.println(all);
//        }
//        System.out.println("List 2");
//        for (String all : forRemoveLines) {
//            System.out.println(all);
//        }
//        System.out.println();
        // TEST END


        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
        /*// Устанавливаем счетчик совпадений сравнения
        int count = 0;
        // Перебираем вложенным циклом оба списка и сравниваем все элементы из первого списка со всеми элементами
        // из второго. При совпадении увеличиваем счетчик на 1 и прерываем вложенный цикл
        for (int i = 0; i < forRemoveLines.size(); i++) {
            for (int j = 0; j < allLines.size(); j++) {
                if (forRemoveLines.get(i).equals(allLines.get(j))) {
                    count++;
                    break;
                }
            }
        }

        System.out.println("forRemoveLines.size(): " + forRemoveLines.size());
        System.out.println("count: " + count);
        System.out.println();*/

        // Если счетчик равен кол-ву элементов второго списка, то удаляем из первого все совпавшие элементы второго
        // списка...
       /* if (count == forRemoveLines.size()) {
            //allLines.removeAll(Collections.synchronizedList(forRemoveLines));

            for (int i = 0; i < allLines.size(); i++) {
                for (int j = 0; j < forRemoveLines.size(); j++) {
                    if (allLines.get(i).equals(forRemoveLines.get(j))) {
                        allLines.set(i, null);
                        break;
                    }
                }
            }
            // ... иначе заполняем список 1 нулевыми значениями
        } else {
            allLines.clear();
            *//*for (int i = 0; i < allLines.size(); i++) {
                allLines.remove(i);
            }*//*
            throw new CorruptedDataException();
        }*/
    }
}
