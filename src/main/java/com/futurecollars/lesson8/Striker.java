package com.futurecollars.lesson8;

public class Striker implements FootballPlayer {

  private String firstName;
  private String lastName;
  private int shirtNum;

  public Striker(String firstName, String lastName, int shirtNum) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.shirtNum = shirtNum;
  }

  @Override
  public String getName() {
    return firstName.substring(0, 1).toUpperCase()
        + lastName.substring(0, 1).toUpperCase()
        + this.shirtNum;
  }

  @Override
  public String prepareForTheGame() {
    return "Striker is preparing for the game now...";
  }
}
