package com.futurecollars.lesson12;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main2 {

  public static void main(String[] args) {

    List<String> names = new LinkedList<>();

    names.add("Andrzej");//0
    names.add("Krystyna");//1
    names.add("Grażyna");//2
    names.add("Aleksander");//3

    System.out.println(names);
    System.out.println(names.get(2));
//    System.out.println(names.size());

//    for (String name : names) {
//      System.out.println(name.toUpperCase());
//    }

//    System.out.println(names.contains("Aleksander"));

    names.remove(2);

    System.out.println(names);

    System.out.println(names.get(2));

    names.remove("Aleksander");

    System.out.println(names);

    names.set(0, "Andrew");

    System.out.println(names);
  }
}
