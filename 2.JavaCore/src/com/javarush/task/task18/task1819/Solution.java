package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = bufferedReader.readLine();
        String fileName2 = bufferedReader.readLine();

//        String fileName1 = "file1.txt";
//        String fileName2 = "file2.txt";

        FileInputStream fileInputStream = new FileInputStream(fileName1);

        byte[] buffer1 = new byte[fileInputStream.available()];

        if (fileInputStream.available() > 0){
            fileInputStream.read(buffer1);
        }
        fileInputStream.close();

        fileInputStream = new FileInputStream(fileName2);

        byte[] buffer2 = new byte[fileInputStream.available()];

        if (fileInputStream.available() > 0){
            fileInputStream.read(buffer2);
        }
        fileInputStream.close();

        FileOutputStream fileOutputStream = new FileOutputStream(fileName1);
        fileOutputStream.write(buffer2);
        fileOutputStream.write(buffer1);

        fileOutputStream.close();
    }
}
