package com.java.buddies.players.repository.player;

import com.java.buddies.players.repository.player.dao.SoccerPlayerDAO;
import com.java.buddies.players.repository.player.dao.SoccerPlayerDAOFile;
import com.java.buddies.players.repository.player.entity.SoccerPlayerEntity;
import java.util.List;

public class SoccerPlayerRepository {

  private final SoccerPlayerDAO soccerPlayerDAO;

  public SoccerPlayerRepository() {
    soccerPlayerDAO = new SoccerPlayerDAOFile();
  }

  public List<SoccerPlayerEntity> findAll() {
    return soccerPlayerDAO.findAll();
  }

}
