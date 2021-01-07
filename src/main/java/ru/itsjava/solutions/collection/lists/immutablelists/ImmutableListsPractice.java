package ru.itsjava.solutions.collection.lists.immutablelists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableListsPractice {

    public static void main(String[] args) {
//Создать пустой список с помощью метода emptyList()
//Проверить можно ли добавить туда элемент?
        List<String> emptyList = Collections.emptyList();
//        emptyList.add("ola");

//Создать список с помощью метода singletonList()
//Проверить можно ли добавить туда элемент?
        List<String> singletonList = Collections.singletonList("One");
//        singletonList.add("Two");
//Создать копию списка с помощью метода copyOf()
//Проверить можно ли добавить туда элемент?
        List<String> copySingletonList = List.copyOf(singletonList);
//        copySingletonList.add("");

//Создать копию списка с помощью метода unmodifiableList()
//Проверить можно ли добавить туда элемент?
//Проверить можно ли добавить в исходный список элемент?
        List<String> list = new ArrayList<>();
        List<String> wrapperList = Collections.unmodifiableList(list);
//        wrapperList.add("No add");
        list.add("Add");
        System.out.println(wrapperList);

//Создать копию списка с помощью метода nCopies()
//Проверить можно ли добавить туда элемент?
        List<String> rList = Collections.nCopies(5, "r");
//        rList.add("r");
        System.out.println(rList);

    }
}
