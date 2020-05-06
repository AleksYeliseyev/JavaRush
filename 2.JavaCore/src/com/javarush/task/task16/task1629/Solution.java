package com.javarush.task.task16.task1629;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


    public static void main(String[] args) throws InterruptedException {
        Read3Strings t1 = new Read3Strings();
        Read3Strings t2 = new Read3Strings();

        t1.start();
        t1.join();
        t2.start();
        t2.join();

        t1.printResult();
        t2.printResult();
    }

    //add your code here - добавьте код тут
    public static class Read3Strings extends Thread{
        public String string1;
        public String string2;
        public String string3;
        @Override
        public void run() {
            try {
                string1 = reader.readLine();
                string2 = reader.readLine();
                string3 = reader.readLine();
            } catch (IOException e) {
                System.out.println("error");
            }

        }

        public void printResult(){
            System.out.println(string1 + " " + string2 + " " + string3);
        }
    }
}
