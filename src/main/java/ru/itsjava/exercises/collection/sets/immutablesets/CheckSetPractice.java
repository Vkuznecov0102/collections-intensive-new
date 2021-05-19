package ru.itsjava.exercises.collection.sets.immutablesets;

import java.util.*;

public class CheckSetPractice {
    public static void main(String[] args) {
//Создать HashSet с типо Object, добавить несколько элементов с типом String
// Создать обертку над ним с помощью checkedSet  с типом String.class
//добавить элемент 10
        Set stringObjects = new HashSet<>();
        stringObjects.add("1");
        stringObjects.add("2");
        stringObjects.add("3");

        Set other = Collections.checkedSet(stringObjects, String.class);
        System.out.println(stringObjects);
//исключение        other.add(10);


    }
}
