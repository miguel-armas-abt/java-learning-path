package com.java.buddies.oop.herency.vehicle;

public abstract class Vehicle {

  public Vehicle(String plate, String model) {
    this.plate = plate;
    this.model = model;
  }

  protected String plate;
  protected String model;

  abstract void printDetail();
}
