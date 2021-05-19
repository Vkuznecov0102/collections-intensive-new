package ru.itsjava.exercises.collection.lists.immutablelists;

import java.util.*;

public class ImmutableListsPractice {

    public static void main(String[] args) {
//Создать пустой список с помощью метода emptyList()
//Проверить можно ли добавить туда элемент?
//Создать список с помощью метода singletonList()
//Проверить можно ли добавить туда элемент?
//Создать копию списка с помощью метода copyOf()
//Проверить можно ли добавить туда элемент?
//Создать копию списка с помощью метода unmodifiableList()
//Проверить можно ли добавить туда элемент?
//Проверить можно ли добавить в исходный список элемент?
//Создать копию списка с помощью метода nCopies()
//Проверить можно ли добавить туда элемент?
        List<Object> emptyList = Collections.emptyList();

//        emptyList.add("something"); //исключение

        List<Object> singletonList = Collections.singletonList("one");
//        singletonList.add("nothing"); //исключение

        List<Object> copyOfSingletonList = List.copyOf(singletonList);
//        copyOfSingletonList.add("something"); //исключение

        List<Object> listWithStrings = new ArrayList<>();
        listWithStrings.add("One");
        listWithStrings.add("Two");
        listWithStrings.add("Three");
        List<Object> newListWithStrings = Collections.unmodifiableList(listWithStrings);
//        newListWithStrings.add("Four"); не добавляется
        listWithStrings.add("Four");
        System.out.println(listWithStrings); //добавляется
        List<Object> copies = Collections.nCopies(3, listWithStrings);
//        copies.add("Five"); //не добавляется
        System.out.println(copies);

    }
}
