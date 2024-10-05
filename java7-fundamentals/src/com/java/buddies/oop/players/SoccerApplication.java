package com.java.buddies.oop.players;

import com.java.buddies.oop.players.models.SoccerResponse;
import com.java.buddies.oop.players.service.SoccerService;

public class SoccerApplication {

  public static void main(String[] args) {
//    SoccerTeamRepository teamRepository = new SoccerTeamRepository();
//    SoccerTeam team = teamRepository.findById(null);
//    System.out.println(team);

//    SoccerPlayerRepository playerRepository = new SoccerPlayerRepository();
//    System.out.println("############### findAll");
//    System.out.println(playerRepository.findAll());
//
//    System.out.println("############### add");
//    SoccerPlayer soccerPlayer = new SoccerPlayer(7L, "Pepito", "Arquero", 18, 2L);
//    playerRepository.add(soccerPlayer);
//
//    System.out.println("############### findById");
//    System.out.println(playerRepository.findById(7L));
//
//    System.out.println("############### updateById");
//    SoccerPlayer newSoccerPlayer = new SoccerPlayer();
//    newSoccerPlayer.setName("Juanito");
//    playerRepository.updateById(7L, newSoccerPlayer);
//    System.out.println(playerRepository.findById(7L));
//
//    System.out.println("############### findAll");
//    System.out.println(playerRepository.findAll());
//
//    System.out.println("############### deleteById");
//    playerRepository.deleteById(7L);
//    System.out.println(playerRepository.findAll());

    SoccerService soccerService = new SoccerService();
    SoccerResponse soccerResponse = soccerService.findById(2L);
    System.out.println(soccerResponse);

  }

}
