package com.java.buddies.basics.strings;

public class IntroStrings {

  public static void main(String[] args) {
    String name = "  Miguel Armas Abt  ";
    String modified = "";
    modified = name.trim(); //elimina espacios al inicio y al final
    modified = name.toLowerCase();
    modified = name.toUpperCase();
    modified = name.concat("."); // simbolo de concatenación + es más eficiente
    modified = name.repeat(2);
    modified = name.replace(" ", "*");

    char modifiedChar = name.charAt(2);
    boolean containsSubstring = name.contains("Armas");
    int indexOfOccurrence = name.indexOf("Miguel");

    System.out.println("name: " + name);
    System.out.println("modified: " + modified);
    System.out.println("modifiedChar: " + modifiedChar);
    System.out.println("containsSubstring: " + containsSubstring);
    System.out.println("indexOfOccurrence: " + indexOfOccurrence);
  }
}
