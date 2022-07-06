package com.futurecollars.lesson8;

public interface FootballPlayer {

  String getName();

  String prepareForTheGame();

  default String enterTheStadium() {
    return "Player " + getName() + " enters the stadium.";
  }
}
