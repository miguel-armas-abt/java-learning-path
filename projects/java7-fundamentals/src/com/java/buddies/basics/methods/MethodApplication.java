package com.java.buddies.basics.methods;

import java.util.Scanner;

public class MethodApplication {

  public static void main(String[] args) {
//    int result = addition(2);
//    double result = additionSecond(1, 2, 3);
    printMessageIfIsLegalAge();
  }

  static boolean isLegalAge() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese la edad: ");
    int age = scanner.nextInt();

    //convencional con llaves
//    if(age >= 18) {
//      return true;
//    }
//    return false;

    //convencional sin llaves
//    if(age >= 18)
//      return true;
//    return false;

    //operador ternario
//    return (age >= 18)
//        ? true
//        : false;

    //directo
    return (age >= 18);
  }

  static double additionSecond(int x, int y, int z) {
    double result = 2*Math.pow(x, 2) + (3*y) - z + y;
    return result;
  }

  static int addition(int x) {
    int result = 2*x + 3;
    return result;
  }

  static void printMessageIfIsLegalAge() {
    boolean isLegalAge = isLegalAge();
    if(isLegalAge) {
      System.out.println("Es mayor de edad");
    } else {
      System.out.println("Es menor de edad");
    }
  }

}
