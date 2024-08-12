package com.java.buddies.basics.strings;

import java.util.Locale;

//ctrl + / comentar líneas
//ctrl + espacio
public class StringsProcessor {

  public static void main(String[] args) {
    String name = "  Miguel Armas Abt";
//    String nameCustomized = name.trim(); //elimina espacios al inicio y al final
//    String nameCustomized = name.toLowerCase();
//    String nameCustomized = name.toUpperCase();
//    String nameCustomized = name.concat("."); // simbolo de concatenación + es más eficiente
//    String nameCustomized = name.repeat(2);
    String nameCustomized = name.replace(" ", "*");
//    char nameCustomized = name.charAt(2);
//    boolean nameCustomized = name.contains("Armas");
//    int nameCustomized = name.indexOf("Miguel");

    System.out.println("name: " + name);
    System.out.println("nameCustomized: " + nameCustomized);
  }
}
