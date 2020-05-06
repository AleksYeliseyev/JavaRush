package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static List<Thread> threads = new ArrayList<>(5);

    static {
        MyThread1 thread1 = new MyThread1();
        MyThread2 thread2 = new MyThread2();
        MyThread3 thread3 = new MyThread3();
        MyThread4 thread4 = new MyThread4();
        MyThread5 thread5 = new MyThread5();
        threads.add(thread1);
        threads.add(thread2);
        threads.add(thread3);
        threads.add(thread4);
        threads.add(thread5);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            threads.get(i).setName("TH-" + (i + 1));
            threads.get(i).start();
            System.out.println("thread " + threads.get(i).getName() + " start!");

        }


        /*while (true){
        }*/


    }

    public static class MyThread1 extends Thread {
        public void run() {
            //System.out.println("thread1 started");
            while (true) {

            }
        }
    }

    public static class MyThread2 extends Thread {
        public void run() {
            //System.out.println("thread2 started");

            try {
                throw new InterruptedException();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }

    public static class MyThread3 extends Thread {
        public void run() {
            //System.out.println("thread3 started");
            while (true) {
                System.out.println("Ура");
                try {
                    currentThread().sleep(500);
                } catch (InterruptedException e) {

                }
            }
        }
    }

    public static class MyThread4 extends Thread implements Message {
        boolean isCancel = true;

        public void run() {
            //System.out.println("thread4 started");
            // TEST
            /*try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/

            while (!Thread.currentThread().isInterrupted()) {
                if (isCancel == false) {
                    currentThread().interrupt();
                }
                //showWarning();
            }
        }

        @Override
        public void showWarning() {
            //System.out.println("thread " + currentThread().getName() + " interrupt!");
            if (isCancel == true) {
                isCancel = false;
            }

        }
    }

    public static class MyThread5 extends Thread {

        public void run() {
            //System.out.println("thread5 started");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String string = null;
            int summ = 0;
            while (true) {
                try {
                    string = reader.readLine();

                } catch (IOException e) {

                }
                if (string.contains("N")) {
                    System.out.println(summ);
                    summ = 0;
                } else {
                    summ += Integer.parseInt(string);
                }
            }
        }
    }
}