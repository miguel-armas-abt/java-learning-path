package com.java.buddies.model;

public class Date {

  private Day day;
  private String month;
  private String year;

  public Date() {}

  public Date(Day day, String month, String year) {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public String getMonth() {
    return month;
  }

  public void setMonth(String month) {
    this.month = month;
  }

  public Day getDay() {
    return day;
  }

  public void setDay(Day day) {
    this.day = day;
  }

  public String getYear() {
    return year;
  }

  public void setYear(String year) {
    this.year = year;
  }

  @Override
  public String toString() {
    return "{\"day\": {\"description\": \"" + this.day.getDescription() + "\", \"number\": \"" + this.day.getNumber() + "\"}, \"month\": \"" + this.month + "\", \"year\": \"" + this.year + "\"}";
  }
}