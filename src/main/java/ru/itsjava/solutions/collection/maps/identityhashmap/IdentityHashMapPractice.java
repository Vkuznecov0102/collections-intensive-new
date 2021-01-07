package ru.itsjava.solutions.collection.maps.identityhashmap;

import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapPractice {

    public static void main(String[] args) {
        //Создать IdentityHashMap (тип строка-строка)
        //и добавить 2 разных элемента и одинаковые по значению (new String() и "")
        //вывести размер map

        // creating an instance of IdentityHashMap
        Map<String, String> identityHashMap = new IdentityHashMap<>();

        // Putting key and value pair
        // in a IdentityHashMap Object
        identityHashMap.put("key", "value");
        identityHashMap.put(new String("key"), "value2");


        // compares the objects by reference
        System.out.println("Size of IdentityHashMap --" + identityHashMap.size());
    }
}
