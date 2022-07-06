package com.futurecollars.lesson08;

public class Triangle extends Shape {

  private int angle1;
  private int angle2;
  private int angle3;

  @Override
  void printShape() {
    System.out.println(" /\\ ");
    System.out.println("/ \\ ");
    System.out.println("____");
  }
}
