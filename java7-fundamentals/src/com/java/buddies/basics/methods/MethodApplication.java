package com.java.buddies.basics.methods;

import java.util.Scanner;

public class MethodApplication {

  public static void main(String[] args) {
    System.out.println("################ Suma ################");
    System.out.println(sum(2, 3));

    System.out.println("################ Exponente ################");
    System.out.println(exponent(2, 3));

    System.out.println("################ Mayor de edad ################");
    printMessageIfIsLegalAge();
  }

  static double exponent(int base, int exponent) {
    return Math.pow(base, exponent);
  }

  static int sum(int firstNumber, int secondNumber) {
    return firstNumber + secondNumber;
  }

  static boolean isLegalAge() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese la edad: ");
    int age = scanner.nextInt();

    return (age >= 18);
  }

  static void printMessageIfIsLegalAge() {
    boolean isLegalAge = isLegalAge();
    if(isLegalAge)
      System.out.println("El usuario es mayor de edad");
    else
      throw  new IllegalArgumentException("El usuario es menor de edad");
  }

}
