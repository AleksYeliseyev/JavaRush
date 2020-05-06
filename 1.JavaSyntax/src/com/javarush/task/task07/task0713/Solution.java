package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
сортировка списка на три новых списка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        ArrayList<Integer> numbers3 = new ArrayList<Integer>();
        ArrayList<Integer> numbers2 = new ArrayList<Integer>();
        ArrayList<Integer> numbers32 = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            String string = reader.readLine();
            int num = Integer.parseInt(string);
            numbers.add(num);
        }
        for (int num:numbers) {
            if (num % 3 == 0){
                numbers3.add(num);
            }
            if (num % 2 == 0){
                numbers2.add(num);
            }
            if ((num % 3 !=0) && (num % 2 != 0)) {
                numbers32.add(num);
            }
        }
        printList(numbers3);
        printList(numbers2);
        printList(numbers32);
    }

    public static void printList(ArrayList<Integer> list) {
        for (int num:list) {
            System.out.println(num);
        }
    }
}
