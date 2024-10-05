package com.java.buddies.players.repository.player.dao;

import com.java.buddies.players.repository.player.entity.SoccerPlayerEntity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SoccerPlayerDAOArray implements SoccerPlayerDAO {

  private static final SoccerPlayerEntity[] PLAYERS_DATABASE = {
      new SoccerPlayerEntity(1L, "Kylian Mbappé", "Delantero", 24, 1L),
      new SoccerPlayerEntity(2L, "Vinícius Jr.", "Delantero", 23, 1L),
      new SoccerPlayerEntity(3L, "Robert Lewandowski", "Delantero", 35, 2L),
      new SoccerPlayerEntity(4L, "Pedri", "Centrocampista", 21, 2L),
      new SoccerPlayerEntity(5L, "Neymar Jr.", "Delantero", 31, 3L),
      new SoccerPlayerEntity(6L, "Lionel Messi", "Delantero", 36, 3L)
  };

  private List<SoccerPlayerEntity> soccerPlayers;

  public SoccerPlayerDAOArray() {
    soccerPlayers = new ArrayList<>(Arrays.asList(PLAYERS_DATABASE));
  }

  @Override
  public void add(SoccerPlayerEntity player) {
    this.soccerPlayers.add(player);
  }

  @Override
  public List<SoccerPlayerEntity> findAll() {
    this.soccerPlayers.sort(Comparator.comparing(SoccerPlayerEntity::getId));
    return this.soccerPlayers;
  }

  @Override
  public SoccerPlayerEntity findById(Long id) {
    if(id == null)
      throw new IllegalArgumentException("[400 - Bad request] Id must not be null");

    SoccerPlayerEntity selected = null;
    for (SoccerPlayerEntity player: this.soccerPlayers) {
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

  @Override
  public void deleteById(Long id) {
    SoccerPlayerEntity currentPlayer = this.findById(id);

    List<SoccerPlayerEntity> modifiedList = new ArrayList<>();

    for (SoccerPlayerEntity player: this.soccerPlayers) {
      if(!id.equals(player.getId()))
        modifiedList.add(player);
    }

    this.soccerPlayers = modifiedList;
  }

  @Override
  public void updateById(Long id, SoccerPlayerEntity updatedPlayer) {
    if(updatedPlayer == null)
      throw new IllegalArgumentException("[400 - Bad request] player to update must not be null");

    SoccerPlayerEntity currentPlayer = this.findById(id);

    List<SoccerPlayerEntity> modifiedList = new ArrayList<>();

    for (SoccerPlayerEntity player: this.soccerPlayers) {
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
