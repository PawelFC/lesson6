package com.futurecollars.lesson13;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class Main4 {
  public static void main(String[] args) {
    // Queue (FIFO)
    Queue<String> queue = new ArrayDeque<>();
    queue.offer("first");
    queue.offer("second");
    queue.offer("third");

    System.out.println(queue);
    System.out.println(queue.peek());//tylko sprawdza, który element przetwarzamy jako następny
    System.out.println(queue);
    System.out.println(queue.poll());//wyciąga z kolejki następny element do przetworzenia
    System.out.println(queue.poll());//wyciąga z kolejki następny element do przetworzenia
    System.out.println(queue.poll());//wyciąga z kolejki następny element do przetworzenia
    System.out.println(queue);

    System.out.println("-----------------------------------");

    //Deque (FIFO, LIFO)
    Deque<String> queue2 = new ArrayDeque<>();
    queue2.offer("first");
    queue2.offer("second");
    queue2.offer("third");

    System.out.println(queue2);
    System.out.println(queue2.pollFirst());
    System.out.println(queue2);
    System.out.println(queue2.pollLast());
    System.out.println(queue2);
  }
}
