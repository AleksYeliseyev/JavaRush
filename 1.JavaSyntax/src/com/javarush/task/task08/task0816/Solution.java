package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));
        map.put("Ривз", dateFormat.parse("JANUARY 10 2015"));
        map.put("Дамм", dateFormat.parse("FEBRUARY 21 2001"));
        map.put("Шварц", dateFormat.parse("SEPTEMBER 23 2016"));
        map.put("Хауэр", dateFormat.parse("JUNE 11 1954"));
        map.put("Сигал", dateFormat.parse("OCTOBER 18 1944"));
        map.put("Ли", dateFormat.parse("JULY 14 1962"));
        map.put("Ришар", dateFormat.parse("AUGUST 11 1854"));
        map.put("Круз", dateFormat.parse("MAY 16 2013"));
        map.put("Кейдж", dateFormat.parse("MAY 25 2015"));

        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) throws ParseException {
        Iterator<Map.Entry<String, Date>> entryIterator = map.entrySet().iterator();
        while (entryIterator.hasNext()){
            Map.Entry<String,Date> entry = entryIterator.next();
            if((entry.getValue().getMonth() > 4) && (entry.getValue().getMonth() < 8)){
                entryIterator.remove();
            }
        }

    }

    public static void main(String[] args) throws ParseException {


    }
}
