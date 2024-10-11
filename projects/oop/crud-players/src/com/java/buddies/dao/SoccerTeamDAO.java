package com.java.buddies.dao;

import com.java.buddies.entity.TeamEntity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SoccerTeamDAO {

  private static final TeamEntity[] TEAMS_DATABASE = {
      new TeamEntity(1L, "Real Madrid", "Carlo Ancelotti", "Santiago Bernabéu", "Madrid"),
      new TeamEntity(2L, "FC Barcelona", "Xavi Hernández", "Camp Nou", "Barcelona"),
      new TeamEntity(3L, "Paris Saint-Germain", "Luis Enrique", "Parc des Princes", "París"),
      new TeamEntity(4L, "Manchester City", "Pep Guardiola", "Etihad Stadium", "Manchester"),
      new TeamEntity(5L, "Bayern Múnich", "Thomas Tuchel", "Allianz Arena", "Múnich")
  };

  private List<TeamEntity> soccerTeams;

  public SoccerTeamDAO() {
    soccerTeams = new ArrayList<>(Arrays.asList(TEAMS_DATABASE));
  }

  public TeamEntity findById(Long id) {
    if(id == null)
      throw new IllegalArgumentException("[400 - Bad request] Id must not be null");

    TeamEntity selected = null;
    for(TeamEntity team: this.soccerTeams) {
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
