package com.javarush.task.task09.task0905;

/* 
Там, в синих глубинах стек-трейса…
*/

import javax.print.DocFlavor;

public class Solution {
    public static void main(String[] args) {
        int deep = getStackTraceDepth();
    }

    public static int getStackTraceDepth() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        int count = 0;
        for (StackTraceElement elements: stackTraceElements) {
            count++;
            //System.out.println(elements.getMethodName());
        }
        System.out.println(count);
        return count;
    }
}

