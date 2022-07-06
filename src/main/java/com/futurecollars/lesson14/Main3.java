package com.futurecollars.lesson14;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

public class Main3 {
  public static void main(String[] args) throws InterruptedException {
    User user = new User("Paweł", "Nowosieski", LocalDate.of(1993, 3, 9));
    System.out.println(user.getAge());

    LocalTime startOfOperation = LocalTime.now();

    Thread.sleep(3000);

    Duration executionTime = Duration.between(startOfOperation, LocalTime.now());

    if (executionTime.getSeconds() > 4L) {
      System.out.println("WARNING! Performance of pperation is very low!");
    }
  }
}
