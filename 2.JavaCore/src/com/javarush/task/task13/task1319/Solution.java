package com.javarush.task.task13.task1319;

/* 
Писатель в файл с консоли
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();        // FILENAME
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));

        String string = reader.readLine();
        while (!string.equals("exit")){
            writer.write(string);
            writer.newLine();
            string = reader.readLine();
        }
        writer.write(string);
        writer.flush();
        writer.close();
        reader.close();
    }
}
