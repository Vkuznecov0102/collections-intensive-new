package ru.itsjava.exercises.collection.lists.arraylist;


import ru.itsjava.model.Man;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {

    public static void main(String[] args) {
        //создать список и добавить 2 мужчин
        List<Man> manList = new ArrayList<>();
        manList.add(new Man("Андрей", "Семенов"));
        manList.add(new Man("Иван", "Иванов"));
        System.out.println(manList);
    }
}
