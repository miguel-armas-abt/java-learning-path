package com.java.buddies.players.repository.team.dao;

import com.java.buddies.players.repository.team.entity.SoccerTeamEntity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SoccerTeamDAOArray implements SoccerTeamDAO {

  private static final SoccerTeamEntity[] TEAMS_DATABASE = {
      new SoccerTeamEntity(1L, "Real Madrid", "Carlo Ancelotti", "Santiago Bernabéu", "Madrid"),
      new SoccerTeamEntity(2L, "FC Barcelona", "Xavi Hernández", "Camp Nou", "Barcelona"),
      new SoccerTeamEntity(3L, "Paris Saint-Germain", "Luis Enrique", "Parc des Princes", "París"),
      new SoccerTeamEntity(4L, "Manchester City", "Pep Guardiola", "Etihad Stadium", "Manchester"),
      new SoccerTeamEntity(5L, "Bayern Múnich", "Thomas Tuchel", "Allianz Arena", "Múnich")
  };

  private List<SoccerTeamEntity> soccerTeams;

  public SoccerTeamDAOArray() {
    soccerTeams = new ArrayList<>(Arrays.asList(TEAMS_DATABASE));
  }

  @Override
  public SoccerTeamEntity findById(Long id) {
    if(id == null)
      throw new IllegalArgumentException("[400 - Bad request] Id must not be null");

    SoccerTeamEntity selected = null;
    for(SoccerTeamEntity team: this.soccerTeams) {
      if(id.equals(team.getId())) {
        selected = team;
        break;
      }
    }

    if (selected == null) {
      throw new IllegalArgumentException("[404 - Not Found] Team with id '" + id + "' not found");
    }

    return selected;
  }

}
