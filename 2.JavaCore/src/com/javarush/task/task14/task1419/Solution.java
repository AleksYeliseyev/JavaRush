package com.javarush.task.task14.task1419;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions(){   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }
        //2
        try {
            int[] num = new int[3];
            num[5] = 4;

        } catch (ArrayIndexOutOfBoundsException e) {
            exceptions.add(e);
        }
        //3
        Object[] obj = new String[2];
        try {
            obj[0] = 'w';

        } catch (ArrayStoreException e) {
            exceptions.add(e);
        }
        //4
        Object obj1 = new Character('*');
        try{
            System.out.println((float)obj1);
        }
        catch (ClassCastException e) {
            exceptions.add(e);
        }
        //5
        try{
            int[] nums = new int[-4];
        }
        catch (NegativeArraySizeException e){
            exceptions.add(e);
        }
        //6
        int[] nums1 = new int[7];
        nums1 = null;
        try {
            int a = nums1.length;
        }
        catch (NullPointerException e){
            exceptions.add(e);
        }
        //7
        String string = "12334";
        try{
            char ch = string.charAt(8);
        }
        catch (StringIndexOutOfBoundsException e){
            exceptions.add(e);
        }
        //8
        exceptions.add(new UnsupportedOperationException());
        //9
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            Integer n = reader.read();
        } catch (IOException e) {
            exceptions.add(e);
        }
        //10
        String str = "12234DDD";
        try{
            int x = Integer.parseInt(str);
        }
        catch (NumberFormatException e){
            exceptions.add(e);
        }

        try{
            throw new IOException();
        }
        catch (IOException e){
            exceptions.add(e);
        }






    }
}
