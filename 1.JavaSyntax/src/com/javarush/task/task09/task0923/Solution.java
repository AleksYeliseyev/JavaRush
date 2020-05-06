package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        List<Character> glas = new ArrayList<>();
        List<Character> soglas = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        char[] chars = string.toCharArray();
        for (char symbols:chars) {
            if (symbols == ' '){
                continue;
            }
            if (isVowel(symbols)){
                glas.add(symbols);
                glas.add(' ');
            }  else {
                soglas.add(symbols);
                soglas.add(' ');
            }
        }
        glas.toString().trim();
        soglas.toString().trim();
        for (char sym:glas) {
            System.out.print(sym);
        }
        System.out.println();
        for (char sym:soglas) {
            System.out.print(sym);
        }
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : vowels) {  // ищем среди массива гласных
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}