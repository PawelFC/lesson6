package com.futurecollars.lesson13;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Map;

public class Main {

  public static void main(String[] args) {
    Map<Integer, String> daysOfJune = new HashMap<>();

    daysOfJune.put(1, "Wednesday");
    daysOfJune.put(2, "Thursday");
    daysOfJune.put(3, "Friday");
    daysOfJune.put(4, "Saturday");
    daysOfJune.put(5, "Sunday");
    daysOfJune.put(6, "Monday");
    daysOfJune.put(7, "Tuesday");
    daysOfJune.put(8, "Wednesday");
    daysOfJune.put(9, "Thursday");
    daysOfJune.put(10, "Friday");

    System.out.println(daysOfJune);

    String dayOfWeek = daysOfJune.get(8);
    System.out.println("8 czerwca jest: " + dayOfWeek);

    if (daysOfJune.containsKey(10)) {
      System.out.println("Zawiera!");
    } else {
      System.out.println("Nie zawiera!");
    }

    System.out.println("---------------------------");
    daysOfJune.clear();
    System.out.println(daysOfJune);
  }
}
