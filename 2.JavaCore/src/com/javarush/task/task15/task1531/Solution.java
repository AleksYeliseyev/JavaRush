package com.javarush.task.task15.task1531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/* 
Факториал
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        System.out.println(factorial(input));
    }

    public static String factorial(int n) {
        BigInteger res = BigInteger.ONE;
        if (n < 0 ){
            return "0";
        } else if (n == 0){
            return "1";
        } else {
            res = BigInteger.valueOf(n).multiply(new BigInteger( factorial(n-1)));
        }

        return res + "";
    }
}
