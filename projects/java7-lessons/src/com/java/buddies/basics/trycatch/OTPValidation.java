package com.java.buddies.basics.trycatch;

import java.security.SecureRandom;
import java.util.Scanner;

/**
 * <b>Caso de uso: <b/> Verificación de identidad mediante OTP
 * <br>
 * <b>Reglas de negocio: <b/>
 * - El cliente solicita realizar una operación sensible (cambio de contraseña, transferencias, etc).
 * - El sistema envía un OTP al número de teléfono registrado del cliente.
 * - El cliente debe ingresar el OTP para verificar su identidad.
 * <br>
 * <b>Criterios de aceptación: <b/> La aplicación debe verificar correctamente el OTP antes de proceder con la operación.
 */
public class OTPValidation {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    SecureRandom random = new SecureRandom();
    int otp = random.nextInt(900000) + 100000;

    System.out.println("Se envió un código OTP a su número telefónico");

    try {
      Thread.sleep(3000); // Simula un retraso de 3 segundos
      System.out.println(otp);
    } catch (InterruptedException e) {
      throw new IllegalArgumentException("Lo sentimos, ocurrió un error al enviar el código OTP.");
    }

    System.out.print("Ingrese el OTP recibido: ");
    int enteredOtp = scanner.nextInt();

    if (otp == enteredOtp) {
      System.out.println("Verificación exitosa.");
    } else {
      throw new IllegalArgumentException("OTP incorrecto. Verificación fallida.");
    }
  }
}
