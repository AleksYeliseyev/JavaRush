package com.javarush.task.task13.task1318;
import java.io.*;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException  {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        
        InputStream inStream = new FileInputStream(fileName);
        int count = 0;
        while (inStream.available() > 0)
         {
          int data = inStream.read(); //читаем один байт из потока для чтения
          System.out.print("" + (char)data);
          count++;
          if (count > 80) { count = 0; }
         }
        
         inStream.close(); //закрываем потоки
         reader.close();
    }
}