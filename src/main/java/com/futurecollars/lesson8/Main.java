package com.futurecollars.lesson8;

public class Main {

  public static void main(String[] args) {

//    Striker lewandowski = new Striker("Robert", "Lewandowski", 9);
//    System.out.println(lewandowski.getName());
//    System.out.println(lewandowski.prepareForTheGame());
//    System.out.println(lewandowski.enterTheStadium());
//
//    Goalkeeper szczesny = new Goalkeeper("Szczena", 1);
//    System.out.println(szczesny.getName());
//    System.out.println(szczesny.prepareForTheGame());
//    System.out.println(szczesny.enterTheStadium());

    Circle circle = new Circle();
    Rectangle rectangle = new Rectangle();

    System.out.println(checkShapeType(circle));
    System.out.println(checkShapeType(rectangle));
  }

  private static String checkShapeType (Shape shape){
    if (shape instanceof Circle) {
      return "To jest koło!";
    } else if (shape instanceof Rectangle) {
      return "To jest prostokąt!";
    } else {
      return "nie ma takeigo kształtu";
    }
  }
}
