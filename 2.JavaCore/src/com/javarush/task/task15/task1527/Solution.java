package com.javarush.task.task15.task1527;

/* 
Парсер реквестов
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        //String url = "http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo";
        //String url = "http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo";

        String[] string = url.split("\\?"); // разделение строки URL на две части по символу "?"
        String string1 = string[1]; // оставляем только вторую часть (после ?)
        //System.out.println(string1);
        String[] string2 = string1.split("[&]");  // разделение строки на части по символу "&"


        for (int i = 0; i < string2.length; i++) {
            System.out.print(parametr(string2[i]));
            if (i < string2.length - 1){
                System.out.print(" ");
            }
        }
        System.out.println();
        if (url.contains("obj")) {
            //System.out.println("obj обнаружен!!!");
            String res = objEx(url);
            if (res.matches("[0-9]+[.]?[0-9]*")){
                double d = Double.parseDouble(res);
                alert(d);
            } else {
                alert(res);
            }
        }

    }

    public static String objEx (String s){
        String sss = s.substring(s.indexOf("obj=")+4, s.indexOf("&"));
        //System.out.println("Выполняется метод objEx.");
        //System.out.println(sss);
        return sss;
    }
    // метод для выделения параметра (до символа "="
    public static String parametr (String s) {
        if (s.contains("=")) {
            return s.substring(0, s.indexOf("="));
        } else {
            return s;
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
