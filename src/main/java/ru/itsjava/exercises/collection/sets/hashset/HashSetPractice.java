package ru.itsjava.exercises.collection.sets.hashset;

import ru.itsjava.model.Man;

import java.util.HashSet;
import java.util.Set;

public class HashSetPractice {

    public static void main(String[] args) {
//        Создать 2 множества от Man, добавить несколько Man
//        и сравнить множества через equals
        Set<Man> men = new HashSet<>();
        men.add(new Man("Иван", "Демьян"));
        men.add(new Man("Алексей", "Джавов"));
        men.add(new Man("Феофан", "Нейромонах"));

        Set<Man> otherMan = new HashSet<>();
        otherMan.add(new Man("Иван", "Демьян"));
        otherMan.add(new Man("Алексей", "Джавов"));
        otherMan.add(new Man("Феофан", "Нейромонах"));
//        otherMan.add(new Man("Николай","Поляков"));
//        otherMan.add(new Man("Нехороший","Человек"));
//        otherMan.add(new Man("Андрей","Иванов"));

        System.out.println(men.equals(otherMan));

        //true когда одинаковые, false если нет
    }
}
