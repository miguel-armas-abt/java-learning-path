package com.java.buddies.lists;

import java.util.ArrayList;
import java.util.List;

/**
 * <b>Caso de uso: <b/> Consulta de historial de transacciones
 * <br>
 * <b>Reglas de negocio: <b/>
 * - Los clientes pueden consultar su historial de transacciones.
 * - Cada transacción incluye el tipo (depósito, retiro), el monto y la fecha.
 * <br>
 * <b>Criterios de aceptación: <b/> La aplicación debe permitir mostrar el historial de transacciones.
 */
public class TransactionHistory {

  public static void main(String[] args) {
    List<String> transactions = new ArrayList<>();
    transactions.add("Depósito, 1000.00, 01/07/2024");
    transactions.add("Retiro, 200.00, 05/07/2024");
    transactions.add("Depósito, 500.00, 10/07/2024");

    //output
    for (String transaction : transactions) {
      String[] parts = transaction.split(",");
      System.out.println("Tipo: " + parts[0].trim());
      System.out.println("Monto: " + parts[1].trim());
      System.out.println("Fecha: " + parts[2].trim());

      System.out.println("----------------------------------------");
    }
  }

}
