package com.java.buddies.oop.players.service;

import com.java.buddies.oop.players.models.SoccerPlayer;
import com.java.buddies.oop.players.models.SoccerResponse;
import com.java.buddies.oop.players.models.SoccerTeam;
import com.java.buddies.oop.players.repository.SoccerPlayerRepository;
import com.java.buddies.oop.players.repository.SoccerTeamRepository;

public class SoccerService {

  private SoccerPlayerRepository soccerPlayerRepository;
  private SoccerTeamRepository soccerTeamRepository;

  public SoccerService() {
    soccerPlayerRepository = new SoccerPlayerRepository();
    soccerTeamRepository = new SoccerTeamRepository();
  }

  public SoccerResponse findById(Long id) {
    SoccerPlayer soccerPlayer = soccerPlayerRepository.findById(id);
    Long teamId = soccerPlayer.getTeamId();

    SoccerTeam soccerTeam = soccerTeamRepository.findById(teamId);

    SoccerResponse soccerResponse = new SoccerResponse(soccerPlayer.getName(), soccerTeam.getName());
    return soccerResponse;
  }

}
