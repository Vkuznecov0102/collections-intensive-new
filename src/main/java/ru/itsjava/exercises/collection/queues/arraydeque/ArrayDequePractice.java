package ru.itsjava.exercises.collection.queues.arraydeque;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequePractice {

    public static void main(String[] args) {
//Создать stack и queue с помощью ArrayDeque
//Воспользоваться методами push pop и add remove
// для добавления и удаления элементов
        Deque<Object> stack = new ArrayDeque<>();
        Deque<Object> queue = new ArrayDeque<>();

        stack.push(1);
        stack.push("star");
        stack.push(166);
        stack.push("something");

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();

        queue.add(44);
        queue.add("star");
        queue.add(111L);
        queue.add("4");

        while (!queue.isEmpty()) {
            System.out.print(queue.remove() + " ");
        }
    }
}
