package ru.itsjava.solutions.collection.maps.weakhashmap;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapPractice {

    public static void main(String[] args) {
        Map<Integer, String> map = new WeakHashMap<>();
        map.put(new Integer(30), "Vitaliy");

        Thread thread = new Thread(
                () -> {
                    while (map.containsKey(30)) {
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("Thread is waiting...");
                        System.gc();
                    }
                });
        thread.start();
        System.out.println("Application is waiting...");
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
