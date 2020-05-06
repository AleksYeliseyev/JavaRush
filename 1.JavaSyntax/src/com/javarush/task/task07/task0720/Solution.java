package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();
        String string = reader.readLine();
        int n = Integer.parseInt(string);
        string = reader.readLine();
        int m = Integer.parseInt(string);
        for (int i = 0; i < n; i++) {
            string = reader.readLine();
            list.add(string);
        }
        for (int i = 0; i < m; i++) {
            String str = list.get(0);
            list.add(str);
            list.remove(0);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(list.get(i));
        }
    }
}
