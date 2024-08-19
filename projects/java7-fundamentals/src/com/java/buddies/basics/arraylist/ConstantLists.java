package com.java.buddies.basics.arraylist;

import java.util.Arrays;
import java.util.List;

public class ConstantLists {

  public static final String[] DNI_DB = {"76517360", "76517361", "76517362", "76517363"};
  public static final String[] NAMES_DB = {"Fabian", "Omar", "Jhunior", "Martin", "Lorena"};

  public static void main(String[] args) {
    List<String> nameList = Arrays.asList(NAMES_DB);
    List<String> dniList = Arrays.asList(DNI_DB);

    //obtener el segundo elemento
    String dniSecond = dniList.get(1);
    System.out.println(dniSecond);

    System.out.println("#######################");

    //recorrer todo el grupo de elementos
    for(String name: nameList) {
      System.out.println(name.toUpperCase());
    }

    //no me deja agregar más elementos porque es una constante
  }
}

