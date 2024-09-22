package com.java.buddies.players.repository.player.dao;

import com.java.buddies.players.commons.CsvReader;
import com.java.buddies.players.repository.player.entity.SoccerPlayerEntity;
import com.java.buddies.players.repository.player.enums.PlayerEntityHeaders;
import java.util.ArrayList;
import java.util.List;

public class SoccerPlayerDAOFile implements SoccerPlayerDAO {

  private static final String FILE_PATH = "/database/soccer_players.csv";
  private static final char SEPARATOR = ',';

  @Override
  public void add(SoccerPlayerEntity player) {

  }

  @Override
  public List<SoccerPlayerEntity> findAll() {
    List<SoccerPlayerEntity> players = new ArrayList<>();
    try {
      CsvReader.getRecords(FILE_PATH, SEPARATOR)
          .forEach(csvRecord -> {
            SoccerPlayerEntity soccerPlayer = new SoccerPlayerEntity();
            String id = csvRecord.get(PlayerEntityHeaders.ID.name());
            String name = csvRecord.get(PlayerEntityHeaders.NAME.name());
            String position = csvRecord.get(PlayerEntityHeaders.POSITION.name());
            String age = csvRecord.get(PlayerEntityHeaders.AGE);
            String teamId = csvRecord.get(PlayerEntityHeaders.TEAM_ID);

            soccerPlayer.setId(Long.parseLong(id));
            soccerPlayer.setName(name);
            soccerPlayer.setPosition(position);
            soccerPlayer.setAge(Integer.parseInt(age));
            soccerPlayer.setTeamId(Long.parseLong(teamId));

            players.add(soccerPlayer);
          });
    } catch (Exception exception) {
      throw new IllegalArgumentException("ErrorReadingCSV", exception);
    }
    return players;
  }

  @Override
  public SoccerPlayerEntity findById(Long id) {
    return null;
  }

  @Override
  public void deleteById(Long id) {

  }

  @Override
  public void updateById(Long id, SoccerPlayerEntity updatedPlayer) {

  }
}
