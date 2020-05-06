package com.javarush.task.task15.task1525;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


/* 
Файл в статическом блоке
*/

public class Solution {

    private static String line = null;
    public static List<String> lines = new ArrayList<String>();

    static {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(new FileInputStream(Statics.FILE_NAME)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (true) {
            try {
                line = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (line != null) {
                lines.add(line);
            } else {
                break;
            }
        }
    }
    public static void main(String[] args) {
        System.out.println(lines);
    }
}
