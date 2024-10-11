package com.java.buddies.repository;

import com.java.buddies.models.SoccerPlayer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SoccerPlayerRepository {

  private static final SoccerPlayer[] PLAYERS_DATABASE = {
      new SoccerPlayer(1L, "Kylian Mbappé", "Delantero", 24, 1L),
      new SoccerPlayer(2L, "Vinícius Jr.", "Delantero", 23, 1L),
      new SoccerPlayer(3L, "Robert Lewandowski", "Delantero", 35, 2L),
      new SoccerPlayer(4L, "Pedri", "Centrocampista", 21, 2L),
      new SoccerPlayer(5L, "Neymar Jr.", "Delantero", 31, 3L),
      new SoccerPlayer(6L, "Lionel Messi", "Delantero", 36, 3L)
  };

  private List<SoccerPlayer> soccerPlayers;

  public SoccerPlayerRepository() {
    soccerPlayers = new ArrayList<>(Arrays.asList(PLAYERS_DATABASE));
  }

  public void add(SoccerPlayer player) {
    this.soccerPlayers.add(player);
  }

  public List<SoccerPlayer> findAll() {
    this.soccerPlayers.sort(Comparator.comparing(SoccerPlayer::getId));
    return this.soccerPlayers;
  }

  public SoccerPlayer findById(Long id) {
    if(id == null)
      throw new IllegalArgumentException("[400 - Bad request] Id must not be null");

    SoccerPlayer selected = null;
    for (SoccerPlayer player: this.soccerPlayers) {
      if(id.equals(player.getId())) {
        selected = player;
        break;
      }
    }

    if (selected == null) {
      throw new IllegalArgumentException("[404 - Not Found] Player with id '" + id + "' not found");
    }

    return selected;
  }

  public void deleteById(Long id) {
    List<SoccerPlayer> modifiedList = new ArrayList<>();

    for (SoccerPlayer player: this.soccerPlayers) {
      if(!id.equals(player.getId()))
        modifiedList.add(player);
    }

    this.soccerPlayers = modifiedList;
  }

  public void updateById(Long id, SoccerPlayer updatedPlayer) {
    if(updatedPlayer == null)
      throw new IllegalArgumentException("[400 - Bad request] player to update must not be null");

    SoccerPlayer currentPlayer = this.findById(id);

    List<SoccerPlayer> modifiedList = new ArrayList<>();

    for (SoccerPlayer player: this.soccerPlayers) {
      if(!id.equals(player.getId())) {
        modifiedList.add(player);
      }
      else {
        currentPlayer.setAge(updatedPlayer.getAge() != null ? updatedPlayer.getAge() : currentPlayer.getAge());
        currentPlayer.setName(updatedPlayer.getName() != null ? updatedPlayer.getName() : currentPlayer.getName());
        currentPlayer.setPosition(updatedPlayer.getPosition() != null ? updatedPlayer.getPosition() : currentPlayer.getPosition());
        currentPlayer.setTeamId(updatedPlayer.getTeamId() != null ? updatedPlayer.getTeamId() : currentPlayer.getTeamId());
        modifiedList.add(currentPlayer);
      }
    }
    this.soccerPlayers = modifiedList;
  }

}
