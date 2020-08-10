package com.javarush.task.task18.task1825;

/* 
Собираем файл
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        List<Integer> dataByte = new ArrayList<>();
        Map<Integer, String> fileNums = new TreeMap<>();
        String[] num = new String[0];
        while (true) {
            String data = (new BufferedReader(new InputStreamReader(System.in))).readLine();
            if (data.equals("end")) {
                break;
            }
            num = data.split("part");
            fileNums.put(Integer.parseInt(num[num.length - 1]), data);
        }
//        fileNums.forEach((k, v) -> System.out.println(k + " " + v));

        //Имя файла для записи
        String fileName = num[0].substring(0, num[0].length()-1);
        System.out.println(fileName);
        byte[] buffer;
        for (Map.Entry<Integer, String> entry : fileNums.entrySet()) {
            FileInputStream fileInputStream = new FileInputStream(entry.getValue());
            FileOutputStream fileOutputStream = new FileOutputStream(fileName, true);
            buffer = new byte[fileInputStream.available()];
            if (fileInputStream.available() > 0) {
                fileInputStream.read(buffer);
                fileOutputStream.write(buffer);
            }
            fileInputStream.close();
            fileOutputStream.close();
        }
    }
}
