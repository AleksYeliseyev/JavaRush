package com.javarush.task.task08.task0812;

import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Integer num = Integer.parseInt(reader.readLine());
            list.add(num);
        }
        int count = 1;
        int max = 1;
        Object[] listString = list.toArray();
        for (int i = 1; i < 10; i++) {
            if (listString[i].equals(listString[i-1])){
                count++;
            } else {
                if(count > max) {
                    max = count;
                }
                count = 1;
            }
        }
        if(count > max){
            System.out.println(count);
        } else System.out.println(max);
    }
}