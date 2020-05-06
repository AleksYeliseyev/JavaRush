package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws NodException, IOException {
        int num1 = 0;
        int num2 = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            String str1 = reader.readLine();
            num1 = Integer.parseInt(str1);
            if (num1 <= 0) {
                throw new NodException("The number is less than zero");
            } else { break; }
        }
        while (true){
            String str2 = reader.readLine();
            num2 = Integer.parseInt(str2);
            if (num2 <= 0) {
                throw new NodException("The number is less than zero");
            } else { break; }
        }
        //Вычисление НОД
        System.out.println(nod(num1, num2));
    }

    public static int nod(int a, int b) {
        while ((a != 0) && (b != 0)) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        return a + b;
    }

    public static class NodException extends Exception{
        private int a;
        private int b;

        public int getA() {
            return a;
        }

        public int getB() {
            return b;
        }

        public NodException (String message){
            super(message);
        }

    }
}
