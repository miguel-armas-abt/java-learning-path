package com.java.buddies.basics.ifelse;

import java.util.Scanner;

public class IntroConditionals {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese la edad del solicitante: ");
    int age = scanner.nextInt();

    if (age >= 18) {
      System.out.println("El solicitante es mayor de edad");
    } else {
      throw new IllegalArgumentException("El solicitante no cumple con la mayoría de edad");
    }
  }

}