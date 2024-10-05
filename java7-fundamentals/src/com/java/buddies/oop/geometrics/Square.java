package com.java.buddies.oop.geometrics;

public class Square {

  public Square() {
  }

  private int length;

  public int getLength() {
    return length;
  }

  public void setLength(int length) {
    this.length = length;
  }

  public double calculateArea() {
    return length * length;
  }

}