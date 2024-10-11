package com.java.buddies;

import com.java.buddies.dto.TeamPlayerDTO;
import com.java.buddies.service.PlayerSearcherService;

public class Application {

  public static void main(String[] args) {
    PlayerSearcherService playerSearcherService = new PlayerSearcherService();
    TeamPlayerDTO teamPlayerDTO = playerSearcherService.findById(2L);
    System.out.println(teamPlayerDTO);

  }

}
