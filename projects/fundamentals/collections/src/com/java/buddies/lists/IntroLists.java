package com.java.buddies.lists;

import java.util.ArrayList;
import java.util.List;

public class IntroLists {

  public static void main(String[] args) {
    List<String> nameList = new ArrayList<>();
    nameList.add("Fabian");
    nameList.add("Omar");
    nameList.add("Jhunior");
    nameList.add("Martin");
    nameList.add("Lorena");

    System.out.println("\n########## Segundo elemento (índice 1) #############");
    String secondName = nameList.get(1);
    System.out.println(secondName);

    System.out.println("\n########## Recorrido de todos sus elementos #############");
    for(String name: nameList) {
      System.out.println(name);
    }

    System.out.println("\n########## Añadir un elemento #############");
    nameList.add("Yoau");
    for(String name: nameList) {
      System.out.println(name);
    }

    System.out.println("\n########## Remover primer elemento #############");
    nameList.remove(0);
    for(String name: nameList) {
      System.out.println(name);
    }

  }
}