package ru.itsjava.solutions.collection.sets.linkedhashset;

import java.util.LinkedHashSet;
import java.util.Set;


public class LinkedHashSetPractice {

    public static void main(String[] args) {
        //Создать LinkedHashSet и добавить разные элементы
        // и вывести на экран проверить, что все элементы
        // вывелись в порядке добавления
        Set<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("1");
        linkedHashSet.add("4");
        linkedHashSet.add("5");
        linkedHashSet.add("7");
        linkedHashSet.add("9");
        linkedHashSet.add("3");

        System.out.println(linkedHashSet);
    }
}
