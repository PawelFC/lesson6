package com.futurecollars.lesson09;

public class SimpleClass {

  public static void main(String[] args) {
//    OuterClass outer = new OuterClass();
//    OuterClass.InnerClass innerInstance = outer.createInnerInstance();
//
//    OuterClass.InnerClass inner = outer.new InnerClass();

//    Car car = new Car();
//    car.run();

    Greeting greeting = new Greeting() {
      @Override
      public void sayHello() {
        System.out.println("Hello!!!!!!!");
      }
    };

    greeting.sayHello();
  }
}
