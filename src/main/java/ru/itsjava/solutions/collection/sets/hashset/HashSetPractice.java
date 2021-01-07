package ru.itsjava.solutions.collection.sets.hashset;

import ru.itsjava.model.Man;

import java.util.HashSet;

public class HashSetPractice {

    public static void main(String[] args) {
//        Создать 2 множества от Man, добавить несколько Man
//        и сравнить множества через equals
        HashSet<Man> men = new HashSet<>();
        Man vitaliy = new Man("Vitaliy", "Nezhinskiy");
        Man miha = new Man("Mikhail", "Ivanov");

        men.add(vitaliy);
        men.add(miha);

        HashSet<Man> men2 = new HashSet<>();
        Man vitaliy2 = new Man("Vitaliy", "Nezhinskiy");
        Man miha2 = new Man("Mikhail", "Ivanov");

        men2.add(vitaliy2);
        men2.add(miha2);

        System.out.println(men.equals(men2));
    }
}
