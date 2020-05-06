package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {

        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2};
        int[] array3 = {1, 2, 3, 4};
        int[] array4 = {1, 2, 3, 4, 5, 6, 7};
        int[] array5 = {};
        ArrayList<int[]> arrayList = new ArrayList<int[]>();
        arrayList.add(array1);
        arrayList.add(array2);
        arrayList.add(array3);
        arrayList.add(array4);
        arrayList.add(array5);
        return arrayList;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
