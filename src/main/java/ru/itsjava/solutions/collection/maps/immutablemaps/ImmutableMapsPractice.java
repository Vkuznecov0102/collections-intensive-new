package ru.itsjava.solutions.collection.maps.immutablemaps;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapsPractice {

    public static void main(String[] args) {
//Создать пустой список с помощью метода emptyMap()
//Проверить можно ли добавить туда элемент?
//Создать список с помощью метода singletonMap()
//Проверить можно ли добавить туда элемент?
//Создать копию списка с помощью метода Map.ofEntries()
//Проверить можно ли добавить туда элемент?
//Создать копию списка с помощью метода unmodifiableMap()
//Проверить можно ли добавить туда элемент?
//Проверить можно ли добавить в исходный список элемент?

        Map<Object, Object> emptyMap = Collections.emptyMap();
//        emptyMap.put("ola", "ola");


        Map<String, String> singletonMap = Collections.singletonMap("Key", "Value");
//        singletonMap.put("key2", "value2");

        Map<String, String> entriesMap = Map.ofEntries(Map.entry("Key", "Value"));
//        entriesMap.put("key2", "value2");



        Map<String, String> map = new HashMap<>();
        Map<String, String> unmodifiableMap = Collections.unmodifiableMap(map);
//        unmodifiableMap.put("No put key", "No put value");
        map.put(" put key", " put value");
    }
}
