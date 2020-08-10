package com.javarush.task.task18.task1828;

/* 
Прайсы 2
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        List<String> data = new ArrayList<>();
        String fileName = new BufferedReader(new InputStreamReader(System.in)).readLine();
//        String fileName = "file5.txt";

        if (args.length > 0) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
            String string;
            String id;
            while (reader.ready()) {
                string = reader.readLine();
                id = string.substring(0, 8).trim();
                if (id.equals(args[1])) {
                    if ("-u".equals(args[0])) {
                        // Обновляем данные о товаре
                        string = cutName(args[1], 8)
                                + cutName(productName(args), 30)
                                + cutName(args[args.length - 2], 8)
                                + cutName(args[args.length - 1], 4);
                    }
                    if ("-d".equals(args[0])) {
                        // Удаляем данные о товаре
                        continue;
                    }
                }
                data.add(string);
            }
            reader.close();
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName)));
            for (int i = 0; i < data.size(); i++) {
                writer.write(data.get(i));
                writer.write("\n");
            }
            writer.close();
        }
    }

    // Метод обрезает имя товара свыше 30 символов, либо наращивает до 30 символов
    public static String cutName(String name, int countSymbols) {
        int iter = countSymbols - name.length();
        if (iter > 0) {
            for (int i = 0; i < iter; i++) {
                name = name + " ";
            }
        } else {
            name = name.substring(0, countSymbols);
        }
        return name;
    }

    // Метод выделяет из аргументов имя товара (всё, кроме нулевого и двух последних ячеек массива args)
    public static String productName(String[] name) {
        String result = name[2];
        for (int i = 3; i < name.length - 2; i++) {
            result = result + " " + name[i];
        }
        return result;
    }
}
