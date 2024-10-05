package com.java.buddies.basics.collections.maps;

import java.util.HashMap;
import java.util.Map;

public class IntroMaps {

  public static void main(String[] args) {
    Map<String, String> userMap = new HashMap<>();
    userMap.put("76517361", "Miguel");
    userMap.put("76517362", "Martin");

    System.out.println("\n########## Obtener un elemento por su clave #############");
    String name = userMap.get("76517362");
    System.out.println(name);

    System.out.println("\n########## Validar si existe una clave en el mapa #############");
    boolean containsUser = userMap.containsKey("76517363");
    System.out.println(containsUser);

  }
}
