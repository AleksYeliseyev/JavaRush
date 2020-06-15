package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String fileName = bufferedReader.readLine();
            if (fileName.equals("exit")) {
                break;
            }
            new ReadThread(fileName);
        }
        //Thread.currentThread().interrupt();
        bufferedReader.close();
//        resultMap.forEach ((k, v) -> System.out.println(k + " " + v) );

    }

    public static class ReadThread extends Thread {
        private String fileName;

        public ReadThread(String fileName) throws IOException {
            //implement constructor body
            this.fileName = fileName;
            this.start();
        }

        @Override
        public void run() {

            Map<Integer, Integer> dataByte = new HashMap<>();   // Map для записи байтов
            int data = 0;
            try {
                FileInputStream fileInputStream = new FileInputStream(fileName);
                while (fileInputStream.available() > 0) {
                    data = fileInputStream.read();
                    dataByte.merge(data, 1, (oldValue, newValue) -> oldValue + newValue);
                }
                fileInputStream.close();
            } catch (IOException e) {
                System.out.println("File Not Found");
            }
            try {
                int maxValues = Collections.max(dataByte.values());

                dataByte.forEach((k, v) -> {
                    if (v == maxValues) resultMap.put(fileName, k);
                });
            } catch (NoSuchElementException e) {
 //               System.out.println("Error");
            }
        }
    }
}

