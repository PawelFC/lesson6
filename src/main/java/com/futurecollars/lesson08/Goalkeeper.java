package com.futurecollars.lesson08;

public class Goalkeeper implements FootballPlayer {

  private String nickname;
  private int shirtNum;

  public Goalkeeper(String nickname, int shirtNum) {
    this.nickname = nickname;
    this.shirtNum = shirtNum;
  }

  @Override
  public String getName() {
    return nickname + shirtNum;
  }

  @Override
  public String prepareForTheGame() {
    return "Goalkeeper is preparing for the game....";
  }


}
