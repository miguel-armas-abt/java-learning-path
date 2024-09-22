package com.java.buddies.players;

import com.java.buddies.players.repository.player.SoccerPlayerRepository;

public class SoccerApplication {

  public static void main(String[] args) {

    SoccerPlayerRepository repository = new SoccerPlayerRepository();
    System.out.println(repository.findAll());

  }

}
