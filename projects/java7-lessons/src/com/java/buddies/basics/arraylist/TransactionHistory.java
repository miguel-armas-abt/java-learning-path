package com.java.buddies.basics.arraylist;

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

  private static final String SEPARATOR = "----------------------------------------";

  private static final String[] transactionsDB = {
      "Depósito, 1000.00, 01/07/2024",
      "Retiro, 200.00, 05/07/2024",
      "Depósito, 500.00, 10/07/2024"
  };

  public static void main(String[] args) {
    //output
    for (String transaction : transactionsDB) {
      String[] parts = transaction.split(",");
      System.out.println("Tipo: " + parts[0].trim());
      System.out.println("Monto: " + parts[1].trim());
      System.out.println("Fecha: " + parts[2].trim());

      System.out.println(SEPARATOR);
    }
  }

}
