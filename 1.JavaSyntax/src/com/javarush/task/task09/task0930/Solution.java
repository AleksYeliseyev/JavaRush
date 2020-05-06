package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) {
                break;
            }
            list.add(s);
        }
        //   тестовый ввод списка
        /*list.add("Apple");
        list.add("202");
        list.add("Beer");
        list.add("737");
        list.add("Mobile");
        list.add("353");
        list.add("Dragon");
        list.add("0919");*/

        String[] array = list.toArray(new String[0]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        //System.out.println("Start sort");         триггер начала сортировки
        //System.out.println("length = " + array.length);
        String temp = null;
        for (int j = 0; j < array.length; j++) {
            for (int i = array.length - 1; i > j; i--) {
                if (isGreaterThan(array[i - 1], array[i])) {
                    temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                }
            }
        }
        // определение количества чисел в массиве
        int count = 0;
        for (String x : array) {
            if (isNumber(x)) {
                count++;
            }
        }
        //  сортировка чисел
        int first;
        int second;
        for (int j = 0; j < count; j++) {
            for (int i = count - 1; i > j; i--) {
                first = Integer.parseInt(array[i - 1]);
                second = Integer.parseInt(array[i]);
                if (first < second) {
                    temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                }
            }
        }
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) {
            return false;
        }

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // Строка содержит '-'
                    || (!Character.isDigit(c) && c != '-') // или не цифра и не начинается с '-'
                    || (chars.length == 1 && c == '-')) // или одиночный '-'
            {
                return false;
            }
        }
        return true;
    }
}
