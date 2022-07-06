package com.futurecollars.lesson6;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;

public class Main {
  public static void main(String[] args) {
    System.out.println(add(2, 3));
    System.out.println(add(2, 3, 5));
    System.out.println(add(2.4, 3.7, 5.5));
    System.out.println(add(1,2,4,6,7,8,65,54,4,34,4));
  }

  private static int add(int a, int b){
    return a + b;
  }

  private static int add(int a, int b, int c){
    return a + b + c;
  }

  private static double add(double a, double b, double c){
    return a + b + c;
  }

  private static int add(int... a){
    return 0;
  }

  public static String getSeason(int month) {
    switch (month) {
      case 12:
      case 1:
      case 2:
        return "WINTER";
      case 3:
      case 4:
      case 5:
        return "SPRING";
      case 6:
      case 7:
      case 8:
        return "SUMMER";
      case 9:
      case 10:
      case 11:
        return "AUTUMN";
      default:
        return "No such month: " + month;
    }
  }
}
