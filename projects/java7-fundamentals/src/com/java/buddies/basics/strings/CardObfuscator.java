package com.java.buddies.basics.strings;

import java.util.Scanner;

/**
 * <b>Caso de uso: <b/> Ofuscación de las tarjetas
 * <br>
 * <b>Reglas de negocio: <b/>
 * - Para evitar la divulgación innecesaria de información confidencial del usuario, algunos datos deben ser mostrados parcialmente.
 * - El BIN (Bank Identification Number) es el conjunto de los seis primeros dígitos de una tarjeta, los cuales permiten identificar:
 *    - Banco y país de emisión de la tarjeta
 *    - Tipo de tarjeta (crédito, débito, etc)
 *    - Red de pago (Visa, Mastercard, etc)
 * - Tanto el BIN como los últimos cuatro dígitos de la tarjeta deben mostrarse, mientras que la parte central debe ser ofuscada.
 * <br>
 * <b>Criterios de aceptación: <b/> La aplicación debe ofuscar la tarjeta ingresada.
 * <br>
 * <b>Ejemplos: <b/>
 * - Si la tarjeta tiene 16 dígitos: 4222241111113004 --> 422224******3004
 * - Si la tarjeta tiene 15 dígitos: 377753111113380 --> 377753*****3380
 */
public class CardObfuscator {

  private final static String SIX_CHARS_MASK = "******";
  private final static String FIVE_CHARS_MASK = "*****";
  private final static int DEFAULT_CARD_LENGTH = 16;
  private final static int THIRD_SEGMENT_LENGTH = 4;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    //inputs & validations
    System.out.print("Por favor, ingrese su número de tarjeta: ");
    String cardNumber = scanner.next();

    //process
    String mask = (DEFAULT_CARD_LENGTH == cardNumber.length())
        ? SIX_CHARS_MASK
        : FIVE_CHARS_MASK;

    int secondAndThirdSegmentLength = mask.length() + THIRD_SEGMENT_LENGTH;
    int totalLength = cardNumber.length();

    String lastDigits = cardNumber.substring(totalLength - THIRD_SEGMENT_LENGTH);
    String initialDigits = cardNumber.substring(0, totalLength - secondAndThirdSegmentLength);
    cardNumber = initialDigits + mask + lastDigits;

    //output
    System.out.println("Tarjeta ofuscada: " + cardNumber);
  }
}
