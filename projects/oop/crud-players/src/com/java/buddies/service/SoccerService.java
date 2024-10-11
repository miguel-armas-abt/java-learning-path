package com.java.buddies.service;

import com.java.buddies.models.SoccerPlayer;
import com.java.buddies.models.SoccerResponse;
import com.java.buddies.models.SoccerTeam;
import com.java.buddies.repository.SoccerPlayerRepository;
import com.java.buddies.repository.SoccerTeamRepository;

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
