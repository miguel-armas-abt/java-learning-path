package com.java.buddies.basics.ifelse;

public class ConditionalApplication {

  public static void main(String[] args) {
    int edad = 15;
    if ( edad >= 18) {
      System.out.println("Mayor de edad");
    } else {
      throw new IllegalArgumentException("Menor de edad");
    }
  }

}