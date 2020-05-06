package com.javarush.task.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println();
        System.out.println(getMinimum(integerList));
        System.out.println();
    }

    public static int getMinimum(List<Integer> array) {
        Iterator<Integer> iterator = array.iterator();
        int min = iterator.next();
        int current;
        while (iterator.hasNext()){
            current = iterator.next();
            if (current < min){
                min = current;
            }
        }
        return min;
    }

    public static List<Integer> getIntegerList() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(bufferedReader.readLine());
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < num; i++) {
            list.add(Integer.parseInt(bufferedReader.readLine()));
        }
        return list;
    }
}
