package com.javarush.task.task10.task1015;

import javax.crypto.AEADBadTagException;
import java.util.ArrayList;
import java.util.Collections;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String> arrayList1 = new ArrayList<>();
        ArrayList<String> arrayList2 = new ArrayList<>();
        ArrayList<String> arrayList3 = new ArrayList<>();

        arrayList1.add("string11");
        arrayList1.add("string12");
        arrayList1.add("string13");
        arrayList2.add("string21");
        arrayList2.add("string22");
        arrayList2.add("string23");
        arrayList3.add("string31");
        arrayList3.add("string32");
        arrayList3.add("string33");


        ArrayList<String>[] array = new ArrayList[3];
        array[0] = arrayList1;
        array[1] = arrayList2;
        array[2] = arrayList3;


        return array;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}