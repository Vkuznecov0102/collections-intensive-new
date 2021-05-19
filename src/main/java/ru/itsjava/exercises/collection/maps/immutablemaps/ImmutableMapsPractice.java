package ru.itsjava.exercises.collection.maps.immutablemaps;

import java.util.*;

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
//исключение        emptyMap.put(1,"star");

        Map<Object, Object> singletonMap = Collections.singletonMap(1, "size");
//исключение        singletonMap.put(2,"star");

        Map<Object, Object> entriesMap = Map.ofEntries(Map.entry(15, "44"));
//исключение        entriesMap.put(1,"128");


        Map<Object, Object> someMap = new HashMap<>();
        Map<Object, Object> noModifying = Collections.unmodifiableMap(someMap);
//исключение        noModifying.put(111,"something");
        someMap.put(1, "anybody");
        System.out.println(noModifying);
        System.out.println(someMap);

    }
}
