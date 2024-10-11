package com.java.buddies;

public class VehicleApplication {

  public static void main(String[] args) {
    MixedVehicle vehicle = new MixedVehicle("ABCD", "Toyota Yaris");
    vehicle.printDetail();
    vehicle.printFreight(2000.0);
    vehicle.printPassengers(11);
  }
}
