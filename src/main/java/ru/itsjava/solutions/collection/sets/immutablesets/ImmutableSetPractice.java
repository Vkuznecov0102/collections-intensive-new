package ru.itsjava.solutions.collection.sets.immutablesets;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

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

//
        Set<String> emptySet = Collections.emptySet();
//        emptySet.add("ola");


//        Set<String> singletonSet = Collections.singleton("One");
//        singletonSet.add("Two");

//        Set<String> copySingletonSet = Set.copyOf(singletonSet);
//        copySingletonSet.add("");

        Set<String> set = new HashSet<>();
        Set<String> wrapperSet = Collections.unmodifiableSet(set);
//        wrapperSet.add("No add");
        set.add("Add");
        System.out.println(wrapperSet);

    }
}
