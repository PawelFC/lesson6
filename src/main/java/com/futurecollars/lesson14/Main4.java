package com.futurecollars.lesson14;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main4 {
  public static void main(String[] args) {
    Pattern postCodePattern = Pattern.compile("\\d{2}-\\d{3}");
    Pattern phoneNumberPattern = Pattern.compile("\\d{3} \\d{3} \\d{3}");
    Matcher matcher = postCodePattern.matcher("00-001");
    boolean matches = matcher.matches();
    System.out.println(matches);

    Scanner scanner = new Scanner(System.in);
    String postCode;
    boolean isPostCodeValid;

    do {
      System.out.println("Wprowadź nr telefonu: ");
      postCode = scanner.nextLine();
      isPostCodeValid = phoneNumberPattern.matcher(postCode).matches();

      if (!isPostCodeValid) {
        System.out.println("Wprowadzony nr tel jest niepoprawny! Wprowadź nr w formacie 000 000 000");
      }
    } while (!isPostCodeValid);
  }
}
