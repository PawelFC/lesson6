package com.futurecollars.lesson14;

import java.util.Optional;

public class Main {
  public static void main(String[] args) {

    EmailUser emailUser = new EmailUser("Adam", "Kowalski");

    System.out.println(emailUser.getSignature());

    System.out.println("---------------");

    emailUser.setSignaturePrefix("pozdrawiam,");
    System.out.println(emailUser.getSignature());

    Optional<String> someOptional = Optional.ofNullable("jakiś napis");

    if (someOptional.isPresent()){
      String o = someOptional.get();
    }


  }
}
