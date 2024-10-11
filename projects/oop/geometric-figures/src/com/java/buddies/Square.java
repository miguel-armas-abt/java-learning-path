package com.java.buddies;

public class Square extends GeometricFigure{

  private double length;

  public double getLength() {
    return length;
  }

  public void setLength(int length) {
    this.length = length;
  }

  @Override
  public double calculateArea() {
    return this.length * this.length;
  }

}