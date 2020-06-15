package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Solution {
    public static int data;
    public static int countSymbol = 0;
    public static int countProb = 0;
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        while (fileInputStream.available() > 0) {
            data = fileInputStream.read();
            String str = "" + (char)data;
            if (str.matches("[ ]")){
                countProb++;
            }
            countSymbol++;
        }

        fileInputStream.close();

        double templateDouble = (double) countProb/countSymbol*100;


        double newDouble = new BigDecimal(templateDouble).setScale(2, RoundingMode.HALF_UP).doubleValue();

        System.out.println(newDouble);

    }
}
