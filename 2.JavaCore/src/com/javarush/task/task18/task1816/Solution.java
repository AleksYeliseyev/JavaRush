package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution {
    public static int data;
    public static int count = 0;
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        while (fileInputStream.available() > 0) {
            data = fileInputStream.read();
            String str = "" + (char)data;
            if (str.matches("[a-zA-Z]")){
                count++;
            }
        }
        fileInputStream.close();
        System.out.println(count);
    }
}
