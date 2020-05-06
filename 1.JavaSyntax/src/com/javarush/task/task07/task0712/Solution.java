package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            String string = reader.readLine();
            list.add(string);
        }
        int minLength = list.get(0).length();
        int maxLength = list.get(0).length();
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 1; i < 10; i++) {
            if (list.get(i).length() < minLength) {
                minLength = list.get(i).length();
                minIndex = i;
            }
            if (list.get(i).length() > maxLength) {
                maxLength = list.get(i).length();
                maxIndex = i;
            }
            /*System.out.println("i - " + i);
            System.out.println("min - " + list.get(minIndex));
            System.out.println("max - " + list.get(maxIndex));*/
        }
        if (minIndex < maxIndex) {
            System.out.println(list.get(minIndex));
        } else {
            System.out.println(list.get(maxIndex));
        }
    }
}
