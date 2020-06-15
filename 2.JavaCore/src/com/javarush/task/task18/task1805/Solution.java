package com.javarush.task.task18.task1805;

/* 
Сортировка байт
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Set<Integer> dataByte = new HashSet<>();
        String fileName;
//      Открываем файл и считываем в dataByte данные побайтово
        fileName = (new BufferedReader(new InputStreamReader(System.in))).readLine();
//      fileName = "file3.txt";
        FileInputStream fileInputStream = new FileInputStream(fileName);
        int data;
        while (fileInputStream.available() > 0) {
            data = fileInputStream.read();
            dataByte.add(data);
        }
        fileInputStream.close();
        List<Integer> dataByteList = new ArrayList<>();
        dataByteList.addAll(dataByte);
        Collections.sort(dataByteList);
        dataByteList.forEach(d -> System.out.print(d + " "));
    }
}
