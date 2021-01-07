package ru.itsjava.solutions.collection.maps.enummap;

import ru.itsjava.model.Day;

import java.util.AbstractMap.SimpleEntry;
import java.util.EnumMap;

public class EnumMapPractice {

    public static void main(String[] args) {
        //Создать EnumMap ключ -- день значение активность
        //положить по ключу несколько активностей и проверить, что они есть

        EnumMap<Day, String> activityMap = new EnumMap(Day.class);
        activityMap.put(Day.THURSDAY, "Karate");
        activityMap.put(Day.WEDNESDAY, "Dancing");
        activityMap.put(Day.MONDAY, "Soccer");

        System.out.println(activityMap.entrySet()
                .contains(new SimpleEntry(Day.MONDAY, "Soccer")));
        System.out.println(activityMap.entrySet()
                .contains(new SimpleEntry(Day.THURSDAY, "Karate")));
    }
}
