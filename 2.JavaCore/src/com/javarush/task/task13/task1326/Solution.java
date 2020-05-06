package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader fileNameReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = fileNameReader.readLine();        // FILENAME
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));

        List<Integer> arrayList = new LinkedList<>();
        while (reader.ready()) {
            String data = reader.readLine();
            if (Integer.parseInt(data) % 2 == 0) {
                arrayList.add(Integer.parseInt(data));
            }
        }
        reader.close();
        Collections.sort(arrayList);
        for (Integer num : arrayList) {
            System.out.println(num);
        }
    }
}

