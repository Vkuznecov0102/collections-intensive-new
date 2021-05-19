package ru.itsjava.exercises.collection.sets.immutablesets;

import java.util.*;

public class ImmutableSetPractice {

    public static void main(String[] args) {
//Создать пустой список с помощью метода emptySet()
//Проверить можно ли добавить туда элемент?
//Создать список с помощью метода singleton()
//Проверить можно ли добавить туда элемент?
//Создать копию списка с помощью метода copyOf()
//Проверить можно ли добавить туда элемент?
//Создать копию списка с помощью метода unmodifiableSet()
//Проверить можно ли добавить туда элемент?
//Проверить можно ли добавить в исходный список элемент?

        Set<Object> set = Collections.emptySet();
        Set<Object> singletonSet = new HashSet<>();
        Set<Object> setForCopies = new HashSet<>();
        setForCopies.add(4L);

        singletonSet.add("166");
//исключение        set.add("1");
        Set<Object> objectSet = Collections.singleton(singletonSet);
//исключение        objectSet.add("167");
        Set<Object> copy = Set.copyOf(setForCopies);
//исключение        copy.add("something");
        Set<Object> noModifying = Collections.unmodifiableSet(setForCopies);
//исключение        noModifying.add("Кошка");
        setForCopies.add("Теперь должно работать");
        System.out.println(setForCopies);


    }
}
