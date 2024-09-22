package com.java.buddies.players.repository.team.dao;

import com.java.buddies.players.repository.team.entity.SoccerTeamEntity;

public interface SoccerTeamDAO {

  SoccerTeamEntity findById(Long id);
}
