package ru.itsjava.exercises.collection.maps.identityhashmap;

import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapPractice {

    public static void main(String[] args) {
        //Создать IdentityHashMap (тип строка-строка)
        //и добавить 2 разных элемента и одинаковые по значению (new String() и "")
        //вывести размер map

        IdentityHashMap<String, String> ihm = new IdentityHashMap<>();
        ihm.put("1", "something");
        ihm.put(new String("anything"), "2");
        System.out.println(ihm.size());

    }
}
