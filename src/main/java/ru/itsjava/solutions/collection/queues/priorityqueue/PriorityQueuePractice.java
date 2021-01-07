package ru.itsjava.solutions.collection.queues.priorityqueue;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueuePractice {

    public static void main(String[] args) {
// Создать очередь с именами с помощью PriorityQueue
// Удалять и вывести имена с помощью метода remove ;)
// Создать очередь с именами с помощью PriorityQueue в обратном порядке, используя Comparator
// Удалять и вывести имена с помощью метода remove ;)
        Queue<String> queue = new PriorityQueue<>();
        queue.offer("Анна");
        queue.offer("Яна");
        queue.offer("Саша");
        queue.offer("Вова");
        System.out.print("Priority queue с Comparable: ");
        while (queue.size() > 0) {
            System.out.print(queue.remove() + " ");
        }
        System.out.println();

        PriorityQueue<String> reverseQueue
                = new PriorityQueue<>(5, Collections.reverseOrder());
        reverseQueue.offer("Анна");
        reverseQueue.offer("Яна");
        reverseQueue.offer("Саша");
        reverseQueue.offer("Вова");
        System.out.print("Priority queue с Comparator: ");
        while (reverseQueue.size() > 0) {
            System.out.print(reverseQueue.remove() + " ");
        }
    }
}
