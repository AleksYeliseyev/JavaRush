package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String stringDate = reader.readLine();

        SimpleDateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-d", Locale.US);

        Date date = dateFormat1.parse(stringDate);
        SimpleDateFormat dateFormat2 = new SimpleDateFormat("MMM d, yyyy", Locale.US);
        System.out.println(dateFormat2.format(date).toUpperCase());
    }
}
