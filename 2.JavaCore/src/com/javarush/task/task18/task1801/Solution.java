package com.javarush.task.task18.task1801;

/* 
Максимальный байт
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
        int max = -127;
        int data;
        while (fileInputStream.available() > 0){
            data = fileInputStream.read();
            if (data > max){
                max = data;
            }
        }
        fileInputStream.close();
        System.out.println(max);
    }
}
