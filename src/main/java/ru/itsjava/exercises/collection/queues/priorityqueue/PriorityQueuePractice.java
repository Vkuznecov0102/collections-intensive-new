package ru.itsjava.exercises.collection.queues.priorityqueue;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueuePractice {

    public static void main(String[] args) {
// Создать очередь с именами с помощью PriorityQueue
// Удалять и вывести имена с помощью метода remove ;)
// Создать очередь с именами с помощью PriorityQueue в обратном порядке, используя Comparator
// Удалять и вывести имена с помощью метода remove ;)
        Queue<Object> queue = new PriorityQueue<>();
        queue.offer("Человек");
        queue.offer("Собака");
        queue.offer("something");
        queue.offer("666");

        System.out.print("Priority queue с Comparable: ");

        while (queue.size() > 0) {
            System.out.print(queue.remove() + " ");
        }
        System.out.println();

        //не удаляется

        PriorityQueue<Object> otherQueue
                = new PriorityQueue<>(5, Collections.reverseOrder());
        otherQueue.offer("Иван");
        otherQueue.offer("Митрофан");
        otherQueue.offer("Андрей");
        otherQueue.offer("Человек");
        System.out.print("Priority queue с Comparator: ");
        while (otherQueue.size() > 0) {
            System.out.print(otherQueue.remove() + " ");
        }

        //очередь поменялась местами в алфавитном порядке
    }
}
