package com.java.buddies.oop.dates.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class FormatterService {

  private static final String DATE_PATTERN = "yyyyMMdd";
  private static final String SEPARATOR_ITEMS = ";";
  private static final String LANGUAGE_ES = "es";

  public String mapDate(String date) {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_PATTERN);
    LocalDate localDate = LocalDate.parse(date, formatter);
    return getDayAbbreviation(localDate) + SEPARATOR_ITEMS
        + localDate.getDayOfMonth() + SEPARATOR_ITEMS
        + getMonthName(localDate) + SEPARATOR_ITEMS
        + localDate.getYear();
  }

  private static String getDayAbbreviation(LocalDate localDate) {
    String abbreviation = localDate.getDayOfWeek().getDisplayName(TextStyle.SHORT, new Locale(LANGUAGE_ES));
    return abbreviation.substring(0,1).toUpperCase() + abbreviation.substring(1);
  }

  private static String getMonthName(LocalDate localDate) {
    String monthName = localDate.getMonth()
        .getDisplayName(TextStyle.FULL, new Locale(LANGUAGE_ES));
    return monthName.substring(0,1).toUpperCase() + monthName.substring(1);
  }
}


