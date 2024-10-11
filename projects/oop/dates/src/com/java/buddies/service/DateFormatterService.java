package com.java.buddies.service;

import com.java.buddies.model.Date;
import com.java.buddies.model.Day;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class DateFormatterService {

  private static final String DATE_PATTERN = "yyyyMMdd";
  private static final String SEPARATOR_ITEMS = ";";
  private static final String LANGUAGE_ES = "es";

  public Date retrieveDate(String stringDate) {
    String formattedDate = retrieveDateAsString(stringDate);
    String[] dateElements = formattedDate.split(SEPARATOR_ITEMS);
    Date date = new Date();
    Day day = new Day();
    day.setDescription(dateElements[0]);
    day.setNumber(dateElements[1]);
    date.setDay(day);
    date.setMonth(dateElements[2]);
    date.setYear(dateElements[3]);
    return date;
  }

  private String retrieveDateAsString(String stringDate) {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_PATTERN);
    LocalDate localDate = LocalDate.parse(stringDate, formatter);

    return retrieveDayName(localDate) + SEPARATOR_ITEMS
        + localDate.getDayOfMonth() + SEPARATOR_ITEMS
        + retrieveMonthName(localDate) + SEPARATOR_ITEMS
        + localDate.getYear();
  }

  private String retrieveDayName(LocalDate localDate) {
    String abbreviation = localDate.getDayOfWeek().getDisplayName(TextStyle.SHORT, new Locale(LANGUAGE_ES));
    return abbreviation.substring(0,1).toUpperCase() + abbreviation.substring(1);
  }

  private String retrieveMonthName(LocalDate localDate) {
    String monthName = localDate.getMonth().getDisplayName(TextStyle.FULL, new Locale(LANGUAGE_ES));
    return monthName.substring(0,1).toUpperCase() + monthName.substring(1);
  }
}


