package com.java.buddies.oop.players.repository;

import com.java.buddies.oop.players.models.SoccerTeam;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SoccerTeamRepository {

  private static final SoccerTeam[] TEAMS_DATABASE = {
      new SoccerTeam(1L, "Real Madrid", "Carlo Ancelotti", "Santiago Bernabéu", "Madrid"),
      new SoccerTeam(2L, "FC Barcelona", "Xavi Hernández", "Camp Nou", "Barcelona"),
      new SoccerTeam(3L, "Paris Saint-Germain", "Luis Enrique", "Parc des Princes", "París"),
      new SoccerTeam(4L, "Manchester City", "Pep Guardiola", "Etihad Stadium", "Manchester"),
      new SoccerTeam(5L, "Bayern Múnich", "Thomas Tuchel", "Allianz Arena", "Múnich")
  };

  private List<SoccerTeam> soccerTeams;

  public SoccerTeamRepository() {
    soccerTeams = new ArrayList<>(Arrays.asList(TEAMS_DATABASE));
  }

  public SoccerTeam findById(Long id) {
    if(id == null)
      throw new IllegalArgumentException("[400 - Bad request] Id must not be null");

    SoccerTeam selected = null;
    for(SoccerTeam team: this.soccerTeams) {
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
