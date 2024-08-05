package com.java.buddies.basics.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * <b>Caso de uso: <b/> Cajero automático: Depósitos en cuenta corriente
 * <br>
 * <b>Reglas de negocio: <b/>
 * - Un cliente puede realizar múltiples depósitos en su cuenta corriente a través de un cajero automático (ATM).
 * - El monto de cada depósito debe ser positivo.
 * - La aplicación debe permitir ingresar el monto de cada depósito y calcular el saldo total.
 * - Después de cada depósito, el usuario puede optar por realizar otro depósito o finalizar la transacción.
 * <br>
 * <b>Criterios de aceptación: <b/> La aplicación debe registrar cada depósito y mostrar el saldo total.
 */
public class ATMDepositProcessor {

  private static final String YES = "si";
  private static final String SEPARATOR = "----------------------------------------";

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    List<Double> deposits = new ArrayList<>();
    double totalBalance = 0;

    while (true) {
      // Input & validation
      System.out.print("Ingrese el monto del depósito: ");
      double deposit = scanner.nextDouble();

      if (deposit <= 0) {
        System.out.println("El monto del depósito debe ser positivo.");
        continue; // Interrumpir y continuar con la siguiente iteración
      }

      deposits.add(deposit);
      totalBalance += deposit;

      System.out.printf("Depósito de %.2f registrado. Saldo total: %.2f\n", deposit, totalBalance);

      System.out.print("¿Desea realizar otro depósito? (SI/NO): ");
      String response = scanner.next().trim().toLowerCase();

      if (!YES.equals(response)) {
        break; // Salir del bucle
      }

      System.out.println(SEPARATOR);
    }

    System.out.println(SEPARATOR);

    // output
    System.out.println("Transacción finalizada.");
    System.out.printf("Depósitos realizados: %s\n", deposits);
    System.out.printf("Saldo total: %.2f\n", totalBalance);
  }
}