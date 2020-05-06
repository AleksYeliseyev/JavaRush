package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        
        char[] xxx = Integer.toString(number).toCharArray();
        int res = 0;
        for(char i: xxx){
            res += Character.getNumericValue(i);
        }
        return res;
    }
}

