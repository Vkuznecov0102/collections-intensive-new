package ru.itsjava.solutions.collection.lists.arraysaslist;

import java.util.Arrays;
import java.util.List;

public class ArraysAsListPractice {

    public static void main(String[] args) {
        //Создать список из элементов One, Two, Three
        //Добавить элемент Four
        //Заменить один из элементов на Four и вывести на экран


        List<String> stringList = Arrays.asList("One", "Two", "Three");
//        stringList.add("four"); <- exception
        stringList.set(1, "Four");

    }
}
