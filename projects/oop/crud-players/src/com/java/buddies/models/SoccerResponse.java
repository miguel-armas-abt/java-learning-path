package com.java.buddies.models;

public class SoccerResponse {

  private String playerName;
  private String teamName;

  public SoccerResponse(String playerName, String teamName) {
    this.playerName = playerName;
    this.teamName = teamName;
  }

  public void setPlayerName(String playerName) {
    this.playerName = playerName;
  }

  public void setTeamName(String teamName) {
    this.teamName = teamName;
  }

  public String getPlayerName() {
    return playerName;
  }

  public String getTeamName() {
    return teamName;
  }

  @Override
  public String toString() {
    return "SoccerResponse{" +
        "playerName='" + playerName + '\'' +
        ", teamName='" + teamName + '\'' +
        '}';
  }
}
