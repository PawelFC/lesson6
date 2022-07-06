package com.futurecollars.lesson12;

import java.util.Collection;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    String[] names = new String[3];
    names[0] = "Andrzej";
    names[1] = "Andrzej";
    names[2] = "Andrzej";
  }

  // O(n)
  private static int sum(int[] numbers) {
    int result = 0; // 1

    for (int number : numbers) {
      result += number; // n
    }

    return result; // 1
  }
  // 1+n+1 = n + 2 ---> O(n)

  private static int[] clone(int[] numbers) {
    return numbers.clone(); // 1
  }
  // O(1)

  // O(n^2)
  private static int[] doSomething(int[] numbers) {// 1, 2, 4, 5, 78, 342, 534, 76567

    for (int num : numbers) {
      for (int i = 0; i < numbers.length; i++) {
        boolean bool = numbers[i] == num;
      }

    }// 8*8=64
    //9*9 = 81
    // 10x10 = 100
    //1000x1000 = 1000 000

    return numbers.clone(); // 1
  }
}
