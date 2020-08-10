package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName = args[1];
        String fileOutputName = args[2];
        FileInputStream fileInputStream = new FileInputStream(fileName);
        FileOutputStream fileOutputStream = new FileOutputStream(fileOutputName);
        byte[] buffer = new byte[fileInputStream.available()];
        if (fileInputStream.available() > 0) {
            fileInputStream.read(buffer);
            if (args[0].equals("-e")) {
                for (int i = 0; i < buffer.length; i++) {
                    buffer[i] += 1;
                }
            }
            if (args[0].equals("-d")) {
                for (int i = 0; i < buffer.length; i++) {
                    buffer[i] -= 1;
                }
            }
            fileOutputStream.write(buffer);
        }
        fileInputStream.close();
        fileOutputStream.close();
    }

}
