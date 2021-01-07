package ru.itsjava.solutions.collection.maps.linkedhashmap;

import java.util.LinkedHashMap;

public class LinkedHashMapPractice {

    public static void main(String[] args) {
//        Создать LinkedHashMap (String Integer).
//        Добавить 5 элементов и взять entrySet.
//        Пробежаться итератором по множеству и вывести на экран элемент и ключ
//
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("one", 1);
        linkedHashMap.put("two", 2);
        linkedHashMap.put("three", 3);
        linkedHashMap.put("four", 4);
        linkedHashMap.put("five", 5);

        var set = linkedHashMap.entrySet();
        var iterator = set.iterator();
        while (iterator.hasNext()) {
            var item = iterator.next();
            System.out.println("Key = " + item.getKey() + " Value = " + item.getValue());
        }
    }
}
