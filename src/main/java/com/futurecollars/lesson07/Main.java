package com.futurecollars.lesson07;

public class Main {

  public static void main(String[] args) {
    Car skoda = new Car("Skoda", "Octavia", "black", 150);
    Car bmw = new Car("BMW", "Seria 3", "silver", 200);
    Car mercedez = new Car("Mercedez-Benz", "CLA");
    Car volkswagen = new Car();

    System.out.println("Skoda: ");
    System.out.println("brand: " + skoda.getBrand());
    System.out.println("model: " + skoda.getModel());
    System.out.println("color: " + skoda.getColor());
    System.out.println("horse power: " + skoda.getHorsePower());

    System.out.println("BMW: ");
    System.out.println("brand: " + bmw.getBrand());
    System.out.println("model: " + bmw.getModel());
    System.out.println("color: " + bmw.getColor());
    System.out.println("horse power: " + bmw.getHorsePower());

    System.out.println("Mercedes: ");
    System.out.println("brand: " + mercedez.getBrand());
    System.out.println("model: " + mercedez.getModel());
    System.out.println("color: " + mercedez.getColor());
    System.out.println("horse power: " + mercedez.getHorsePower());

    System.out.println("VW: ");
    System.out.println("brand: " + volkswagen.getBrand());
    System.out.println("model: " + volkswagen.getModel());
    System.out.println("color: " + volkswagen.getColor());
    System.out.println("horse power: " + volkswagen.getHorsePower());

    volkswagen.setBrand("Volkswagen");
    volkswagen.setHorsePower(180);
    volkswagen.setModel("1234567890123456789012345678901234");

    System.out.println("VW after the use of setters: ");
    System.out.println("brand: " + volkswagen.getBrand());
    System.out.println("model: " + volkswagen.getModel());
    System.out.println("color: " + volkswagen.getColor());
    System.out.println("horse power: " + volkswagen.getHorsePower());

    System.out.println("-----------------------------------");

    Employee employee = new Employee("Adam", "Nowak", 2000.0);
    Employee[] subordinates = {employee};

    System.out.println(employee);

    Manager employee1 = new Manager("Jan", "Kowalski", 3000.0, subordinates);

    System.out.println(employee1);

    Employee[] subordinates2 = {employee, employee1};

    Car companyCar = new Car("Ferrari", "Spider", "red", 600);

    Director employee3 = new Director("Mariusz", "Pudzianowski", 10000.0, subordinates2, companyCar);

    System.out.println(employee3);

    String a = "a";
    String b = "b";

    a.equals(b);

    Employee employee8 = new Director("Sebastian", "Pudzianowski", 410000.0, subordinates2, companyCar);


    System.out.println(employee8.getJobTitle());

    System.out.println("--------------------------------------------------");
    System.out.println("--------------------------------------------------");
    System.out.println("--------------------------------------------------");

    Car car = new Car("skoda", "fabia");
    Car car2 = new Car("skoda", "fabia");
    System.out.println(car);

    System.out.println(car.equals(car2));
  }
}
