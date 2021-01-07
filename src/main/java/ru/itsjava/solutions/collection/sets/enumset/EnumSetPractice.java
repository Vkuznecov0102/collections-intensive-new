package ru.itsjava.solutions.collection.sets.enumset;

import ru.itsjava.model.Day;

import java.util.EnumSet;

public class EnumSetPractice {

    public static void main(String[] args) {
        //Создать множества из enum day с помощью методов allOf noneOf и of
        EnumSet<Day> enumSetAllOfEnum = EnumSet.allOf(Day.class);
        System.out.println("enumSetAllOfEnum = " + enumSetAllOfEnum);

        EnumSet<Day> enumSetNone = EnumSet.noneOf(Day.class);
        System.out.println("enumSetNone = " + enumSetNone);

        EnumSet<Day> enumSetMonday = EnumSet.of(Day.MONDAY);
        System.out.println("enumSetMonday = " + enumSetMonday);

    }
}