package com.java.buddies.basics.strings;

// objetos vs datos primitivos
// objetos tienen métodos (por ejemplo, .equals(), .toLoweCase(), .concat(), etc. ---> le pertenecen al objeto String)
// primitivo int no tiene métodos
public class PrimitiveComparation {

  public static void main(String[] args) {
    //comparación de cadenas
    String name = "Miguel";
    boolean isEquals = name.equals("Miguel");
    System.out.println("Comparación de cadenas (¿son iguales?): " + isEquals);


    System.out.println("#######################################");


    // comparación de datos primitivos
    int age = 17;

    boolean isEqualsInt = (age == 18);

    if (isEqualsInt) {
      System.out.println("Son números iguales");
    } else {
      System.out.println("Son números diferentes");
    }
  }
}
