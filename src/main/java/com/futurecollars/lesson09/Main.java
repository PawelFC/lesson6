package com.futurecollars.lesson09;

public class Main {
  public static void main(String[] args) {
    Tshirt tshirt = new Tshirt(Colour.GREEN, TshirtSize.L);

    System.out.println(tshirt.size.getLength());
    System.out.println(tshirt.size.getName());
  }
}
