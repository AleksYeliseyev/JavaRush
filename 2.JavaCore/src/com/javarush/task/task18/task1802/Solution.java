package com.javarush.task.task18.task1802;

/* 
Минимальный байт
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
    public static String fileName;

    public static void main(String[] args) throws Exception {
        fileName = (new BufferedReader(new InputStreamReader(System.in))).readLine();
        //firstFileName = "file1.txt";
        FileInputStream fileInputStream = new FileInputStream(fileName);
        int min = 127;
        int data;
        while (fileInputStream.available() > 0){
            data = fileInputStream.read();
            if (data < min){
                min = data;
            }
        }
        fileInputStream.close();
        System.out.println(min);
    }
}
