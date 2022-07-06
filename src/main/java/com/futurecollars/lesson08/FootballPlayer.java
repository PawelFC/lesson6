package com.futurecollars.lesson08;

public interface FootballPlayer {

  String getName();

  String prepareForTheGame();

  default String enterTheStadium() {
    return "Player " + getName() + " enters the stadium.";
  }
}
