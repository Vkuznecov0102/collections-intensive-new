package ru.itsjava.solutions.collection.sets.immutablesets;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class CheckSetPractice {
    public static void main(String[] args) {
//Создать HashSet с типо Object, добавить несколько элементов с типом String
// Создать обертку над ним с помощью checkedSet  с типом String.class
//добавить элемент 10
        Set set = new HashSet();
        set.add("one");
        set.add("two");
        set.add("three");

        Set chkSet = Collections.checkedSet(set, String.class);
        System.out.println("Checked list content: " + chkSet);
        chkSet.add(10);

//you cannot add any type of elements to checkSet object, doing so
//throws ClassCastException
        chkSet.add(10); //throws ClassCastException


    }
}
