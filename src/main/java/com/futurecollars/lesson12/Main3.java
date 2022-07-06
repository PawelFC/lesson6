package com.futurecollars.lesson12;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

public class Main3 {
  public static void main(String[] args) {

    //    Set<String> namesSet = new TreeSet<>();
    //
    //    namesSet.add("Andrzej");//0)
    //    namesSet.add("Krystyna");//1)
    //    namesSet.add("Grażyna");//2)
    //    namesSet.add("Aleksander");//3)
    //
    //    System.out.println(namesSet);

        Set<Book> books =
            new TreeSet<>(
                new Comparator<Book>() {
                  @Override
                  public int compare(Book book, Book t1) {
                    // ujemna -> element 1 jest mniejszy
                    // 0 -> elementy są równe
                    // dodatnia ->\ element 1 jest większy

                    return book.getTitle().compareTo(t1.getTitle());
                  }
                });

//    Set<Book> books = new TreeSet<>();
    books.add(new Book("Harry Potter", 1300));
    books.add(new Book("Lord of the Rings", 500));

    System.out.println(books);
  }
}
