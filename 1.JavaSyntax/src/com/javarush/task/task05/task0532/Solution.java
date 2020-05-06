package com.javarush.task.task05.task0532;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        int n = Integer.parseInt(reader.readLine());
        if (n > 0) {
            int[] arr = new int[n];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(reader.readLine());
            }

            int maximum = arr[0];
            for (int value : arr) {
                if (value > maximum) {
                    maximum = value;

                }
            }
            System.out.println(maximum);
        }
    }
}
