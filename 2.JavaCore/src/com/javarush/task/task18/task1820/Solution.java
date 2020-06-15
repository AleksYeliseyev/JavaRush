package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = bufferedReader.readLine();
        String fileName2 = bufferedReader.readLine();

//        String fileName1 = "file1.txt";
//        String fileName2 = "file2.txt";
        //Чтение из файла
        FileInputStream fileInputStream = new FileInputStream(fileName1);
        byte[] buffer = new byte[fileInputStream.available()];
        if(fileInputStream.available() > 0){
            fileInputStream.read(buffer);
        }
        String string = new String(buffer);
        ArrayList<Double> numbers = new ArrayList<>();
        for (String str: string.split(" ")) {
            numbers.add(Double.parseDouble(str));
        }
        fileInputStream.close();

        //Запись в файл
        FileOutputStream fileOutputStream = new FileOutputStream(fileName2);
        String bufferString = "";
        for (double dob:numbers) {
            System.out.println(dob);
            //Округление до сотых
            //double newDouble = new BigDecimal(dob).setScale(2, RoundingMode.HALF_UP).doubleValue();

            //Округление до целых
            int num = (int) Math.round(dob);
            bufferString += (num + " ");
        }
        fileOutputStream.write(bufferString.getBytes());
        fileOutputStream.close();
    }
}
