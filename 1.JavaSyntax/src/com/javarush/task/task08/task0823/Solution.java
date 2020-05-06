package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();

        String  string1 = string.trim();
        String one[] = string1.split("\\s+");  // по пробелу
        for (int i = 0; i < one.length ; i++) {
            char[] symbol = one[i].toCharArray();
            String first = String.format("%S", symbol[0]);
            String result = first.concat(new String(symbol).substring(1,  symbol.length));
            one[i] = result;
        }
        String newString = "";
        for (int i = 0; i < one.length; i++) {
            newString += (one[i]);
            if (i < one.length-1){
                newString += " ";
            }
        }
        System.out.println(newString);
    }
}
