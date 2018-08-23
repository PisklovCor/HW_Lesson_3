package com.pisklov;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {


        //Задание 1

        System.out.println();
        System.out.println("Задание 1");
        System.out.println();

        HashMap<String, Integer> mp = new HashMap<>();

        ArrayList<String> list = new ArrayList<>();
        list.add("Д");
        list.add("Б");
        list.add("Б");
        list.add("А");
        list.add("В");
        list.add("А");
        list.add("Г");
        list.add("Г");


        for (int i = 0; i < list.size(); i++) {
            String tempSt = list.get(i);

            if (!mp.containsKey(tempSt)) {
                mp.put(tempSt, 1);
            } else {
                mp.put(tempSt, mp.get(tempSt) + 1);
            }
        }

        for (Map.Entry<String, Integer> mp2 : mp.entrySet()) {
            System.out.println("Буква = " + mp2.getKey() + ", Повторений = " + mp2.getValue());
        }

        System.out.println();
        System.out.println("Задание 2");
        System.out.println();

        //Задание 2

        TelephoneDirectory tD = new TelephoneDirectory();
        tD.addTel("Ромашкин", 3645);
        tD.getTel("Иванов");

    }
}
