package com.futurecollars;

import com.futurecollars.lesson6.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {

  @Test
  void shouldReturnCorrectSeasonDependsOnGivenMonth() {
    // given
    int february = 2;
    int june = 6;
    int november = 11;
    int wrongMinusValue = -7;
    int wrgonTooHighValue = 48;

    // when
    String winterExpected = Main.getSeason(february);
    String summerExpected = Main.getSeason(june);
    String autumnExpected = Main.getSeason(november);
    String firstWrongValueExpected = Main.getSeason(wrongMinusValue);
    String secondWrongValueExpected = Main.getSeason(wrgonTooHighValue);

    // then
    Assertions.assertEquals(winterExpected, "WINTER");
    Assertions.assertEquals(summerExpected, "SUMMER");
    Assertions.assertEquals(autumnExpected, "AUTUMN");
    Assertions.assertEquals(firstWrongValueExpected, "No such month: -7");
    Assertions.assertEquals(secondWrongValueExpected, "No such month: 48");
  }
}
