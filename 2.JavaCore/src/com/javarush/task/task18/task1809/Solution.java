package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        List<Integer> dataByte = new ArrayList<>();
        String fileName1;
        String fileName2;
//      Открываем файл и считываем в dataByte данные побайтово из первого файла
        fileName1 = (new BufferedReader(new InputStreamReader(System.in))).readLine();
        fileName2 = (new BufferedReader(new InputStreamReader(System.in))).readLine();
//        fileName1 = "file1.txt";
//        fileName2 = "file2.txt";
        FileInputStream fileInputStream = new FileInputStream(fileName1);
        while (fileInputStream.available() > 0) {
            dataByte.add(fileInputStream.read());
        }
        fileInputStream.close();
        FileOutputStream fileOutputStream = new FileOutputStream(fileName2);
        for (int i = dataByte.size() - 1; i >= 0; i--) {
            fileOutputStream.write(dataByte.get(i));
        }
        fileOutputStream.close();
    }
}
