package com.java.buddies.basics.loops;

import java.util.Scanner;

/**
 * <b>Caso de uso: <b/> Validación de tarjeta usando el Algoritmo de Luhn
 * <br>
 * <b>Reglas de negocio: <b/>
 * - El Algoritmo de Luhn es utilizado para validar números de tarjeta de crédito.
 * - Para aplicar el algoritmo:
 *   - Duplique el valor de cada segundo dígito, comenzando desde la derecha.
 *   - Si el resultado es mayor a 9, sume los dígitos del resultado.
 *   - Sume todos los dígitos.
 *   - El número es válido si el total es divisible por 10.
 * <br>
 * <b>Criterios de aceptación: <b/> La aplicación debe validar el número de tarjeta ingresado usando el Algoritmo de Luhn.
 * <b>Ejemplos: <b/> Tarjeta válida: 4732458488669315, Tarjeta inválida: 4532458488669315
 */
public class LuhnCardValidator {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    //inputs & validations
    System.out.print("Ingrese el número de la tarjeta: ");
    String cardNumber = scanner.next();

    // Algoritmo de Luhn
    int sum = 0;
    boolean alternate = false;

    for (int i = cardNumber.length() - 1; i >= 0; i--) {
      int digit = Character.getNumericValue(cardNumber.charAt(i));

      if (alternate) {
        digit *= 2;
        if (digit > 9) {
          digit -= 9;
        }
      }

      sum += digit;
      alternate = !alternate;
    }

    if (sum % 10 == 0) {
      System.out.println("El número de tarjeta es válido.");
    } else {
      throw new IllegalArgumentException("El número de tarjeta es inválido.");
    }
  }
}
