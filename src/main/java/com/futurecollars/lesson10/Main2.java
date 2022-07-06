package com.futurecollars.lesson10;

public class Main2 {
  public static void main(String[] args) throws SalaryNotSetException {

//    try {
//      System.out.println("Wynik dzielenia to: " + divide(6, 0));
//    } catch (ArithmeticException e) {
//      e.printStackTrace();
//    } finally {
//      System.out.println("Wyłączam kalkulator!");
//    }

    Employee employee = new Employee("Adam", "Kowalski");
    try {

      employee.setSalary(3000.0);
      employee.increaseSalary(30);

      Employee[] employees = new Employee[2];
      employees[0] = employee;
      employees[1] = employee;

      for (int i = 0; i < 3; i++) {
        Employee employee1 = employees[i];
        System.out.println(employee1.toString());
      }

    } catch (IndexOutOfBoundsException e) {
      throw new IndexOutOfBoundsException("Nie ma tylu pracowników!");
    } catch (NullPointerException e) {
      throw new SalaryNotSetException("Salary is not set yet! Set the salary before incresing it!");
    }
  }

  private static int divide(int a, int b) {
    return a / b;
  }
}
