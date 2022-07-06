package com.futurecollars.lesson10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Main {

  public static void main(String[] args) {

    File file =
        new File(
            "/home/pawel/futurecollars/lesson6/src/main/java/com/futurecollars/lesson10/users.csv");

    System.out.println(file.exists());

    try {
      file.createNewFile();
    } catch (IOException e) {
      e.printStackTrace();
    }

    try {
      writeCsvRecord(file, "id;login;email");
      writeCsvRecord(file, "1;user1;user@1email.com");
      writeCsvRecord(file, "2;user2;user@2email.com");
      writeCsvRecord(file, "3;user3;user@3email.com");
    } catch (IOException e) {
      e.printStackTrace();
    }

  }

  private static void writeCsvRecord(File file, String record) throws IOException {
    Files.writeString(file.toPath(), record + "\n", StandardOpenOption.APPEND);
  }

}
