package ru.itsjava.solutions.collection.queues.arraydeque;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequePractice {

    public static void main(String[] args) {
//Создать stack и queue с помощью ArrayDeque
//Воспользоваться методами push pop и add remove
// для добавления и удаления элементов

        Deque<String> stack = new ArrayDeque<>();
        Deque<String> queue = new ArrayDeque<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();

        queue.add("A");
        queue.add("B");
        queue.add("C");
        queue.add("D");
        while (!queue.isEmpty()) {
            System.out.print(queue.remove() + " ");
        }
    }
}
