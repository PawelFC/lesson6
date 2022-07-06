package com.futurecollars.lesson13;

import java.util.ArrayList;
import java.util.List;

public class Main5 {
  public static void main(String[] args) {
    Apple apple = new Apple("red", 150.0);
    Orange orange = new Orange("orange", 200.0);

    FruitBox<Apple> appleFruitBox = new FruitBox<>(apple);
    FruitBox<Orange> orangeFruitBox = new FruitBox<>(orange);

    Apple fruit = appleFruitBox.getFruit();
    Orange fruit1 = orangeFruitBox.getFruit();

    List<String> maleNames = new ArrayList<>();
    maleNames.add("Andrzej");
    maleNames.add("Adam");
    maleNames.add("Leon");

    List<String> femaleNames = new ArrayList<>();
    maleNames.add("Ania");
    maleNames.add("Joanna");
    maleNames.add("Grażyna");

    List<String> names = union(maleNames, femaleNames);
    System.out.println(names);

    List<Integer> numbers = new ArrayList<>();
    numbers.add(1);
    numbers.add(2);
    numbers.add(4);

    List<Integer> numbers2 = new ArrayList<>();
    numbers2.add(5);
    numbers2.add(6);
    numbers2.add(7);

    List<Integer> union = union(numbers, numbers2);
    System.out.println(union);
  }

  public static <E> List<E> union(List<E> firstList, List<E> secondList) {
    List<E> result = new ArrayList<>(firstList);
    result.addAll(secondList);
    return result;
  }
}
