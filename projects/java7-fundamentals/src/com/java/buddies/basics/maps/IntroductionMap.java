package com.java.buddies.basics.maps;

import java.util.HashMap;
import java.util.Map;

public class IntroductionMap {

  public static void main(String[] args) {
    Map<String, String> userMap = new HashMap<>();
    userMap.put("76517361", "Miguel");
    userMap.put("76517362", "Martin");
    userMap.put("76517363", "Jhunior");
    userMap.put("76517363", "Jhunior", "", "");

//    String name = userMap.get("76517363");
//    System.out.println(name);

    boolean containsUser = userMap.containsKey("76517363");
    System.out.println(containsUser);

  }
}
