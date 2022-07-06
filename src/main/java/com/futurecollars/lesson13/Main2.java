package com.futurecollars.lesson13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main2 {
  public static void main(String[] args) {
    FootballPlayer player1 = new FootballPlayer("Robert Lewandowski", "Poland");
    FootballPlayer player2 = new FootballPlayer("Wojciech Szczęsny", "Poland");
    FootballPlayer player3 = new FootballPlayer("Grzegorz Krychowiak", "Poland");
    FootballPlayer player4 = new FootballPlayer("Kylian Mbappe", "France");
    FootballPlayer player5 = new FootballPlayer("Ngolo Kante", "France");
    FootballPlayer player6 = new FootballPlayer("Sergio Ramos", "Spain");

    List<FootballPlayer> allPlayers = new ArrayList<>();
    allPlayers.add(player1);
    allPlayers.add(player2);
    allPlayers.add(player3);
    allPlayers.add(player4);
    allPlayers.add(player5);
    allPlayers.add(player6);

    Map<String, List<FootballPlayer>> playersByNationality = new HashMap<>();

    for (FootballPlayer player : allPlayers) {
        if (playersByNationality.containsKey(player.getNationality())) {
          playersByNationality.get(player.getNationality()).add(player);
        } else {
          List<FootballPlayer> playersForNationality = new ArrayList<>();
          playersForNationality.add(player);
          playersByNationality.put(player.getNationality(), playersForNationality);
        }
    }

//    playersByNationality.put(player1.getNationality(), player1);
//    playersByNationality.put(player2.getNationality(), player2);
//    playersByNationality.put(player3.getNationality(), player3);
//    playersByNationality.put(player4.getNationality(), player4);
//    playersByNationality.put(player5.getNationality(), player5);
//    playersByNationality.put(player6.getNationality(), player6);

    System.out.println(playersByNationality);
  }
}
