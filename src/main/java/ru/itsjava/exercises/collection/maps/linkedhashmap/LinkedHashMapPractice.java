package ru.itsjava.exercises.collection.maps.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapPractice {

    public static void main(String[] args) {
//        Создать LinkedHashMap (String Integer).
//        Добавить 5 элементов и взять entrySet.
//        Пробежаться итератором по множеству и вывести на экран элемент и ключ

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("Иван", 1);
        map.put("Алексей", 2);
        map.put("Андрей", 3);
        map.put("Феофан", 4);
        map.put("Акакий", 5);
        var set = map.entrySet();
        var iterator = set.iterator();

        while (iterator.hasNext()) {
            var item = iterator.next();
            System.out.println(item.getKey() + " " + item.getValue());
        }
    }
}
