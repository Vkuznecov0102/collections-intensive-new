package ru.itsjava.exercises.collection.maps.enummap;

import ru.itsjava.model.Day;

import java.util.AbstractMap.SimpleEntry;
import java.util.EnumMap;
import java.util.Map;

public class EnumMapPractice {

    public static void main(String[] args) {
        //Создать EnumMap ключ -- день значение активность
        //положить по ключу несколько активностей и проверить, что они есть

        EnumMap<Day, String> activityMap = new EnumMap(Day.class);
        activityMap.put(Day.THURSDAY, "Бег");
        activityMap.put(Day.FRIDAY, "Отдых");
        activityMap.put(Day.SUNDAY, "Спорт");
        System.out.println(activityMap.containsKey(Day.THURSDAY));
        System.out.println(activityMap.containsKey(Day.FRIDAY));
        System.out.println(activityMap.containsKey(Day.WEDNESDAY));

    }
}
