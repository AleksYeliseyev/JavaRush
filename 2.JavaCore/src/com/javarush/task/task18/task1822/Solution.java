package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();

//        String fileName = "file4.txt";
//        int id = 2;

        BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
        String line;
        while (fileReader.ready()){
            line = fileReader.readLine();
            int index = line.indexOf(' ');
            String idString = line.substring(0, index);
//            if (id == Integer.parseInt(idString)){
            if (args[0].equals(idString)){
                System.out.println(line);
//                String[] data = cut(line);
//              data[0]  id - int.
//              data[1]  productName - название товара, может содержать пробелы, String.
//              data[2]  price - цена, double.
//              data[3]  quantity - количество, int.
 //               break;
            }
        }
        fileReader.close();

    }
    // Метод разрезает строку на массив строк и преобразует этот массив из множеслва эл-ов в массив из 4х эл-ов
//    public static String[] cut (String line){
//        String[] lineCut = line.split(" ");
//        String[] res = new String[4];
//        res[0] = lineCut[0];
//        res[1] = lineCut[1];
//        for (int i = 2; i < lineCut.length-2; i++) {
//            res[1] += " ";
//            res[1] += lineCut[i];
//        }
//        res[2] = lineCut[lineCut.length-2];
//        res[3] = lineCut[lineCut.length-1];
////        for (String d:res) {
////            System.out.println(d);
////        }
//        return res;
//    }
}
