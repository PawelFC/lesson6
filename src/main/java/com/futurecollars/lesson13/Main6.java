package com.futurecollars.lesson13;

import java.util.ArrayList;
import java.util.List;

public class Main6 {
  public static void main(String[] args) {

    List<? super Number> numberList = new ArrayList<>();
    numberList.add(5);
    numberList.add(3123123L);
    numberList.add(243.0);

    System.out.println(numberList);
  }
}
