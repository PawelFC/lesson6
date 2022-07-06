package com.futurecollars.lesson14;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class Main2 {
  public static void main(String[] args) {
    Date date = new Date(System.currentTimeMillis());
    System.out.println(date);

    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'o godzinie:' HH:mm");
    System.out.println(formatter.format(date));

    Instant instant = date.toInstant();
    System.out.println(instant);

    ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(instant, ZoneId.of("America/Argentina/Rio_Gallegos"));
    System.out.println(ZoneId.getAvailableZoneIds());
    System.out.println(zonedDateTime);

    System.out.println("----------------------------------------------------------------------");

    LocalDateTime examDate = LocalDateTime.of(2022, 7, 6, 18, 57);

    if (LocalDateTime.now().isAfter(examDate.minusDays(1))){
      System.out.println("Przypomnienie o terminie egzaminu! " + examDate);
    } else {
      System.out.println("Brak ważnych egzminów - śpij spokojnie :)");
    }
  }
}
