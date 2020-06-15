package com.javarush.task.task18.task1804;

/* 
Самые редкие байты
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


public class Solution {

    public static void main(String[] args) throws Exception {
        Map<Integer, Integer> dataByte = new HashMap<>();
        String fileName;
//      Открываем файл и считываем в dataByte данные побайтово
        fileName = (new BufferedReader(new InputStreamReader(System.in))).readLine();
//      fileName = "file3.txt";
        FileInputStream fileInputStream = new FileInputStream(fileName);
        int data;
        while (fileInputStream.available() > 0) {
            data = fileInputStream.read();
            dataByte.merge(data, 1, (oldValue, newValue) -> oldValue + newValue);
        }
        fileInputStream.close();


        int minValues = Collections.min(dataByte.values());
        dataByte.forEach((k, v) -> {
            if (v == minValues) System.out.print(k + " ");
        });
    }
}
