package com.java.buddies.basics.regex;

public class IntroRegex {
  public static void main(String[] args) {

    String stringToTest = "938817321";

    boolean isPhone = stringToTest.matches("^9\\d{8}$");
    System.out.println(isPhone);

  }
}
