package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws Exception {
        if (args.length > 0) {
            if ("-c".equals(args[0])) {
                List<String> data = new ArrayList<>();
                String fileName = new BufferedReader(new InputStreamReader(System.in)).readLine();
//            String fileName = "file5.txt";
                BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName, true)));
                String string;
                int id;
                int maxId = 0;
                while (reader.ready()) {
                    string = reader.readLine();
                    data.add(string);
                    id = Integer.parseInt(string.substring(0, 8).trim());
                    if (id > maxId) maxId = id;
                }
                reader.close();
                maxId++;
                int c = args.length - 1;
                writer.write("\n");
                writer.write("" + maxId);
                writer.write(cutName(productName(args), 30));
                writer.write(cutName(args[args.length - 2], 8));
                writer.write(cutName(args[args.length - 1], 4));

                writer.close();
            }
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
        String result = name[1];
        for (int i = 2; i < name.length - 2; i++) {
            result = result + " " + name[i];
        }
        return result;
    }
}
