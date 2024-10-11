package com.java.buddies;

public class MixedVehicle extends Vehicle implements PassengerTransportService, FreightTransportService {

  public MixedVehicle(String plate, String model) {
    super(plate, model);
  }

  @Override
  public void printFreight(double freightWeight) {
    System.out.println("El peso de la carga es :" + freightWeight);
  }

  @Override
  public void printPassengers(int quantity) {
    System.out.println("La cantidad de pasajeros es:" + quantity);
  }

  @Override
  void printDetail() {
    String message = "Placa: " + this.plate
        + "Modelo: " + this.model;
    System.out.println(message);
  }
}
