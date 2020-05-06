package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        ArrayList<Integer> numbers = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            try {
                int num = Integer.parseInt(bufferedReader.readLine());
                numbers.add(num);
            } catch (Exception e) {
                for (Integer nums : numbers) {
                    System.out.println(nums);
                }
                break;
            }
        }
    }
}
