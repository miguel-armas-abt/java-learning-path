package com.java.buddies.basics.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * <b>Caso de uso: <b/> Chequeo de puntos de lealtad
 * <br>
 * <b>Reglas de negocio: <b/>
 * - Los clientes acumulan puntos de lealtad por cada transacción realizada con su tarjeta de crédito.
 * - Los puntos de lealtad que pueden ser canjeados por productos o servicios.
 * - Cada cliente tiene un identificador único.
 * - El cliente puede verificar la cantidad de puntos acumulados ingresando su ID de cliente.
 * <br>
 * <b>Criterios de aceptación: <b/> La aplicación debe permitir verificar los puntos de lealtad de un cliente.
 */
public class LoyaltyPointsChecker {

  private static final Map<String, Integer> customersDB = new HashMap<>();

  // database
  static {
    customersDB.put("CUST001", 1200);
    customersDB.put("CUST002", 850);
    customersDB.put("CUST003", 400);
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // inputs & validations
    System.out.print("Por favor, ingrese su ID de cliente: ");
    String customerId = scanner.next();

    if (!customersDB.containsKey(customerId)) {
      throw new IllegalArgumentException("ID de cliente no encontrado.");
    } else {
      // process
      int loyaltyPoints = customersDB.get(customerId);

      // output
      System.out.println("Cliente " + customerId + " tiene " + loyaltyPoints + " puntos de lealtad.");
    }
  }
}
