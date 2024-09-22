package com.java.buddies.players.repository.player.dao;

import com.java.buddies.players.repository.player.entity.SoccerPlayerEntity;
import java.util.List;

public interface SoccerPlayerDAO {

  void add(SoccerPlayerEntity player);

  List<SoccerPlayerEntity> findAll();

  SoccerPlayerEntity findById(Long id);

  void deleteById(Long id);

  void updateById(Long id, SoccerPlayerEntity updatedPlayer);
}
