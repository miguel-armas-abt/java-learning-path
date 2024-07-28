package com.java.buddies.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Conversión de moneda
 * - El tipo de cambio mide el valor de una moneda en relación a otra.
 * - El monto a convertir debe ser un valor positivo.
 */
public class MoneyExchangeApplication {

  private static final String PEN = "PEN";
  private static final String USD = "USD";

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    //inputs & validations
    Map<String, String> currenciesMap = new HashMap<>();
    currenciesMap.put(PEN, "S/");
    currenciesMap.put(USD, "$");

    double exchangeRate = 3.14;

    System.out.print("Por favor, ingrese la moneda de origen (PEN | USD): ");
    String originCurrency = scanner.next();

    if(!currenciesMap.containsKey(originCurrency))
      throw new IllegalArgumentException("La moneda de origen es inválida.");

    System.out.print("Por favor, ingrese la moneda de destino (PEN | USD): ");
    String destinationCurrency = scanner.next();

    if(!currenciesMap.containsKey(destinationCurrency))
      throw new IllegalArgumentException("La moneda de destino es inválida.");

    System.out.print("Por favor, ingrese el monto que desea convertir: ");
    double amount = scanner.nextDouble();

    if(amount <= 0)
      throw new IllegalArgumentException("El monto a transferir es inválido.");

    //process
    if(PEN.equals(originCurrency) && USD.equals(destinationCurrency))
      amount = amount / exchangeRate;

    if(USD.equals(originCurrency) && PEN.equals(destinationCurrency))
      amount = amount * exchangeRate;

    //output
    System.out.println("El monto convertido es: " + currenciesMap.get(destinationCurrency) + amount);
  }
}
