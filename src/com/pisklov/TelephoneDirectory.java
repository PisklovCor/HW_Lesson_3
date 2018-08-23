package com.pisklov;

import java.util.*;

public class TelephoneDirectory {

    Map<String, ArrayList<Integer>> tel = new HashMap<>();

    public TelephoneDirectory() {
        tel.put("Иванов", new ArrayList<>(Arrays.asList(1234, 3456, 345345)));
        tel.put("Сидоров", new ArrayList<>(Arrays.asList(456)));
        tel.put("Петров", new ArrayList<>(Arrays.asList(1234, 4562)));
        tel.put("Соколов", new ArrayList<>(Arrays.asList(123)));
    }

    public void addTel(String name, int number) {
        if (tel.containsKey(name)) {
            tel.get(name).add(number);
        } else {
            tel.put(name, new ArrayList<>(Arrays.asList(number)));
        }
    }

    public void getTel (String name){
            System.out.println(name + " : " + tel.get(name));
        }
}

