package com.futurecollars.lesson09;

public class VeryOldCar implements Car {

  @Override
  public void startEngine() {
    System.out.println("engine started");
  }

  @Override
  public void openWindow() {
    System.out.println("window opened...");
  }
}
