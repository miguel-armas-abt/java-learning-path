package com.java.buddies.basics.collections.maps;

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

  public static void main(String[] args) {
    Map<String, Integer> userPointsMap = new HashMap<>();
    userPointsMap.put("USER001", 1200);
    userPointsMap.put("USER002", 850);
    userPointsMap.put("USER003", 400);

    Scanner scanner = new Scanner(System.in);

    // inputs & validations
    System.out.print("Por favor, ingrese su ID de cliente: ");
    String customerId = scanner.next();

    if (!userPointsMap.containsKey(customerId)) {
      throw new IllegalArgumentException("ID de cliente no encontrado.");
    } else {
      // process
      int loyaltyPoints = userPointsMap.get(customerId);

      // output
      System.out.println("Cliente " + customerId + " tiene " + loyaltyPoints + " puntos de lealtad.");
    }
  }
}
