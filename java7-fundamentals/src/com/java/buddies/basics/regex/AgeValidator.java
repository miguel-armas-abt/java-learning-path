package com.java.buddies.basics.regex;

import java.util.Scanner;

/**
 * <b>Caso de uso: <b/> Verificación de edad
 * <br>
 * <b>Reglas de negocio: <b/>
 * - Para solicitar una tarjeta de crédito, el solicitante debe tener al menos 18 años.
 * - La edad debe calcularse a partir de la fecha de nacimiento ingresada.
 * - La fecha de nacimiento debe ser válida y estar en formato DD/MM/AAAA.
 * <br>
 * <b>Criterios de aceptación: <b/> La aplicación debe validar la edad del solicitante.
 */
public class AgeValidator {

  private static final String BIRTH_DATE_REGEX = "\\d{2}/\\d{2}/\\d{4}";

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    //inputs & validations
    System.out.print("Ingrese su fecha de nacimiento (DD/MM/AAAA): ");
    String birthDate = scanner.next();

    if (!birthDate.matches(BIRTH_DATE_REGEX)) {
      throw new IllegalArgumentException("Fecha de nacimiento inválida. Formato esperado: DD/MM/AAAA.");
    }

    int currentYear = 2024;
    String[] dateParts = birthDate.split("/");

    int birthYear = Integer.parseInt(dateParts[2]);
    int age = currentYear - birthYear;

    //process
    if (age < 18) {
      throw new IllegalArgumentException("Lo sentimos, debe tener al menos 18 años para obtener una tarjeta de crédito.");
    }

    //output
    System.out.println("Solicitante mayor de edad.");
  }
}
