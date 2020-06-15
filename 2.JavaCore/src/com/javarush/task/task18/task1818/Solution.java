package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = bufferedReader.readLine();
        String fileName2 = bufferedReader.readLine();
        String fileName3 = bufferedReader.readLine();

//        String fileName1 = "file1.txt";
//        String fileName2 = "file2.txt";
//        String fileName3 = "file3.txt";

        FileInputStream fileInputStream = new FileInputStream(fileName2);
        FileOutputStream fileOutputStream = new FileOutputStream(fileName1);
        int data;
        while (fileInputStream.available() > 0) {
            data = fileInputStream.read();
            fileOutputStream.write(data);
        }
        fileInputStream.close();

        fileInputStream = new FileInputStream(fileName3);
        fileOutputStream = new FileOutputStream(fileName1, true);
        while (fileInputStream.available() > 0) {
            data = fileInputStream.read();
            fileOutputStream.write(data);
        }

        fileInputStream.close();
        fileOutputStream.close();
    }
}
