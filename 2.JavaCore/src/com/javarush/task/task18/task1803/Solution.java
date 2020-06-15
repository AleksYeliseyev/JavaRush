package com.javarush.task.task18.task1803;

/* 
Самые частые байты
*/


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {

    //    public static List<Integer> dataCount = new ArrayList<>();   // запись количества повторов
//    public static List<Integer> result = new ArrayList<>();     // список для вывода


    public static Map<Integer, Integer> dataByte = new HashMap<>();   // запись байтов
    public static String fileName;

    public static void main(String[] args) throws Exception {

//      Открываем файл и считываем в dataByte данные побайтово
        fileName = (new BufferedReader(new InputStreamReader(System.in))).readLine();
//        fileName = "file3.txt";
        FileInputStream fileInputStream = new FileInputStream(fileName);
        int data;
        while (fileInputStream.available() > 0) {
            data = fileInputStream.read();
            dataByte.merge(data, 1, (oldValue, newValue) -> oldValue + newValue);
        }
        fileInputStream.close();

        int maxValues = Collections.max(dataByte.values());
        dataByte.forEach((k, v) -> {
            if (v == maxValues) System.out.print(k + " ");
        });
//        Решение проверить
//        при чтении побайтно использовал такое
//        byteMap.merge(data, 1, (oldValue, newValue) -> oldValue + newValue);
//        этот метод делает вот что:
//        - ищет в мапе ключ data
//        - если ключ не находится, то добавляет этот ключ со значением 1
//                - если ключ найден, то к его значению дабавляется 1
//
//        далее - в мапе легко вычислить максимальное значение:
//        int maxValues = Collections.max(byteMap.values());
//
//        ну и теперь осталось напечатать те ключи, у которых есть такое значение.
//        У мапа есть отличный метод forEach, потому одной строкой, без всяких там циклов, а всего одной строкой:
//        byteMap.forEach((k,v) -> {if (v == maxValues) System.out.print(k + " ");});


//       *****   Старое решение, которое не принимал валидатор   ******

//        System.out.println("dataByte not sorted:");
//        System.out.println(dataByte);
//        Collections.sort(dataByte);
//        Collections.reverse(dataByte);
//        System.out.println("dataByte:");
//        System.out.println(dataByte);

//      Добавляем количество повторов каждого байта в список dataCount
//        int count = 1;
//        for (int i = 1; i < dataByte.size(); i++) {
//            if (dataByte.get(i) == dataByte.get(i - 1)) {
//                count++;
//            } else {
//                dataCount.add(count);
//                count = 1;
//            }
//        }
//        dataCount.add(count);
//        Collections.sort(dataCount);
//        Collections.reverse(dataCount);
//        System.out.println("dataCount:");
//        System.out.println(dataCount);

//        count = 1;
//        int i = 1;
//        while (i < dataByte.size()) {
//            if (dataByte.get(i) == dataByte.get(i - 1)) {
//                count++;
//                i++;
//                continue;
//            }
//            if (count == dataCount.get(0) && !result.equals(dataByte.get(i - 1)) && count > 2) {
//                result.add(dataByte.get(i - 1));
//            }
//            count = 1;
//            i++;
//        }
//        if (count == dataCount.get(0) && !result.equals(dataByte.get(i - 1)) && count > 2) {
//            result.add(dataByte.get(i - 1));
//        }
//
//        for (Integer res : result) {
//            System.out.print(res + " ");
//        }
//
//
    }
}
