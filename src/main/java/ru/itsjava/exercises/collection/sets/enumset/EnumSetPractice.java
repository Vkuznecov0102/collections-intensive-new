package ru.itsjava.exercises.collection.sets.enumset;

import ru.itsjava.model.Day;

import java.util.EnumSet;

public class EnumSetPractice {

    public static void main(String[] args) {
        //Создать множества из enum day с помощью методов allOf noneOf и of
        EnumSet<Day> enumAllOf = EnumSet.allOf(Day.class);
        System.out.println(enumAllOf);

        EnumSet<Day> enumNoneOf = EnumSet.noneOf(Day.class);
        System.out.println(enumNoneOf);

        EnumSet<Day> enumOf = EnumSet.of(Day.FRIDAY);
        System.out.println(enumOf);
    }
}