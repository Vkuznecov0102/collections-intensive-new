package ru.itsjava.solutions.collection.sets.treeset;

import java.util.NavigableSet;
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

        NavigableSet<String> stringNumbersSet = new TreeSet<>();
        stringNumbersSet.add("1");
        stringNumbersSet.add("4");
        stringNumbersSet.add("5");
        stringNumbersSet.add("7");
        stringNumbersSet.add("9");
        stringNumbersSet.add("3");

        System.out.println(stringNumbersSet.toString());

        System.out.println(stringNumbersSet.higher("3"));
        System.out.println(stringNumbersSet.lower("6"));

        System.out.println("stringNumbersSet.descendingSet() = " + stringNumbersSet.descendingSet());


        // возвращаем набор в котором все элементы больше или равны текущего
        System.out.println(stringNumbersSet.tailSet("5"));
    }
}