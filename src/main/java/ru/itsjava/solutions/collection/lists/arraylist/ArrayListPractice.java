package ru.itsjava.solutions.collection.lists.arraylist;

import ru.itsjava.model.Man;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {

    public static void main(String[] args) {
        List<Man> menList = new ArrayList<>();

        menList.add(new Man("V", "N"));
        menList.add(new Man("A", "I"));

        System.out.println(menList);

    }
}
