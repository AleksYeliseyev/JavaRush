package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName;
        int count = 0;
//      Открываем файл и считываем в dataByte данные побайтово
        fileName = (new BufferedReader(new InputStreamReader(System.in))).readLine();
//      fileName = "file3.txt";
        FileInputStream fileInputStream = new FileInputStream(fileName);
        while (fileInputStream.available() > 0) {
           if (fileInputStream.read() == (int) ','){
               count++;
           }
        }
        fileInputStream.close();
        System.out.println(count);
    }
}
