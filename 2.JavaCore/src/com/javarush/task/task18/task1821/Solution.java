package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        // Создаём поток ввода из файла file4.txt
        FileInputStream fileInputStream = new FileInputStream(args[0]);

        // Создаём буфер для чтения файла
        byte[] buffer = new byte[fileInputStream.available()];
        if (fileInputStream.available() > 0) {
            fileInputStream.read(buffer);
        }
        // Записываем содержимое буфера в массив символов
        char[] chars = new String(buffer).toCharArray();

        // Создаём новый поток чтения из файла
        fileInputStream = new FileInputStream(args[0]);

        // Создаем Сет для символов без повтора
        Set<Character> symbols = new HashSet<>();
        while (fileInputStream.available() > 0) {
            symbols.add((char) fileInputStream.read());
        }
        fileInputStream.close();

        //Применяем TreeMap, т.к. ключи в TreeMap отсортированы
        TreeMap<Character, Integer> result = new TreeMap<>();
        int count = 0;
        for (Character ch : symbols) {
            for (char aChar : chars) {
                if (ch.equals(aChar)) {
                    count++;
                }
            }
            result.put(ch, count);
            count = 0;
        }

        for (Map.Entry e : result.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}
