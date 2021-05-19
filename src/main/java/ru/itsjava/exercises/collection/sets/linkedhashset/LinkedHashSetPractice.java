package ru.itsjava.exercises.collection.sets.linkedhashset;

import java.util.LinkedHashSet;
import java.util.Set;


public class LinkedHashSetPractice {

    public static void main(String[] args) {
        //Создать LinkedHashSet и добавить разные элементы
        // и вывести на экран проверить, что все элементы
        // вывелись в порядке добавления
        Set set = new LinkedHashSet();
        set.add("1");
        set.add(4L);
        set.add("Собака");
        set.add(12);

        System.out.println(set);


    }
}
