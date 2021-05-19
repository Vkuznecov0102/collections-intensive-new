package ru.itsjava.exercises.collection.sets.treeset;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetPractice {

    public static void main(String[] args) {
//Создать TreeSet
//Добавить элементы  "1" , "4", "5", "7", "9", "3"
//Вывести множество на экран
//Вывести элемент больше 3 на экран
//Вывести элемент меньше 3 на экран
//создать множество в обратном порядке
//возвращаем множество в котором все элементы больше или равны текущего

        NavigableSet<String> set = new TreeSet();
        set.add("1");
        set.add("4");
        set.add("5");
        set.add("7");
        set.add("9");
        set.add("3");

        System.out.println(set);

        System.out.println(set.higher("3"));
        System.out.println(set.lower("3"));

        System.out.println(set.descendingSet());

        System.out.println(set.tailSet("5"));
    }
}