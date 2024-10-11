package com.java.buddies.service;

import com.java.buddies.entity.PlayerEntity;
import com.java.buddies.dto.TeamPlayerDTO;
import com.java.buddies.entity.TeamEntity;
import com.java.buddies.dao.SoccerPlayerDAO;
import com.java.buddies.dao.SoccerTeamDAO;

public class PlayerSearcherService {

  private SoccerPlayerDAO soccerPlayerDAO;
  private SoccerTeamDAO soccerTeamDAO;

  public PlayerSearcherService() {
    soccerPlayerDAO = new SoccerPlayerDAO();
    soccerTeamDAO = new SoccerTeamDAO();
  }

  public TeamPlayerDTO findById(Long id) {
    PlayerEntity player = soccerPlayerDAO.findById(id);
    Long teamId = player.getTeamId();

    TeamEntity team = soccerTeamDAO.findById(teamId);

    TeamPlayerDTO teamPlayer = new TeamPlayerDTO(player.getName(), team.getName());
    return teamPlayer;
  }

}
