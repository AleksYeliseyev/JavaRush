package com.javarush.task.task19.task1904;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        System.out.println("main start");

        PersonScannerAdapter PSA = new PersonScannerAdapter();
        PSA.read();
        PSA.close();
        System.out.println("main stop");
    }

    public static class PersonScannerAdapter implements PersonScanner {
        private Scanner fileScanner;


        public PersonScannerAdapter() {

        }

       /*public PersonScannerAdapter personScannerAdapter (Scanner fileScanner) {
           this.fileScanner = fileScanner;
       }*/

       /*public PersonScannerAdapter personScannerAdapter (Scanner fileScanner) {
           this.fileScanner = fileScanner;
           return null;
       }*/


        public void close() {
            this.fileScanner.close();
        }

        public Person read() throws IOException {
            Path path = Paths.get("input.txt");
            Scanner scanner = new Scanner(path);
            int i = 0;
            scanner.useDelimiter(System.lineSeparator());
            while (scanner.hasNext()) {
                System.out.println("test output -> i=" + i);
                String[] pers = scanner.next().split(" ", 4);
                System.out.println("test output -> pers.length = " + pers.length);
                i++;
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("d M y", Locale.ENGLISH);


                Person person = new Person(pers[1], pers[2], pers[0], date);
                System.out.println(person.toString());
                for (String s : pers) {
                    System.out.println("test output -> " + s);
                }
            }

            return null;
        }

    }
}

