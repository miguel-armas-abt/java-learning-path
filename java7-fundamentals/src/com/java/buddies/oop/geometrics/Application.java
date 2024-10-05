package com.java.buddies.oop.geometrics;

public class Application {

  public static void main(String[] args) {
    Square square = new Square();
    square.setLength(2);

    double resultArea = square.calculateArea();

    System.out.println("El area del cuadrado es: " + resultArea);
  }
}