package com.futurecollars.lesson13;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main3 {
  public static void main(String[] args) {

      Map<Integer, String> map = new LinkedHashMap<>();

      map.put(3, "value 3.");
      map.put(2, "value 2.");
      map.put(1, "value 1.");
      map.put(5, "value 5.");
      map.put(4, "value 4.");

      for (Map.Entry<Integer, String> entry : map.entrySet()) {
          System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
      }

  }
}
