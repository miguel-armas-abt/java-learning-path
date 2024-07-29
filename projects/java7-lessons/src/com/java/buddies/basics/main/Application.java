/**
 * Un paquete es como una carpeta en nuestro proyecto que nos permite organizar nuestras clases en diferentes módulos.
 * En este caso, com.java.buddies.basics.main es el paquete donde se encuentra la clase Application.
 */
package com.java.buddies.basics.main;

/**
 * - Application es una clase de Java. Una clase es una plantilla que define el comportamiento del programa.
 * - El nombre de la clase debe corresponder con el nombre del archivo.
 * - Los bloques que agrupan código deben iniciar y terminar con llave '{}'
 * - Cada línea de código que realiza una acción se llama instrucción. Cada instrucción debe terminar con punto y coma ';'
 */
public class Application {

  /**
   * - El método main es el punto de arranque de nuestra aplicación.
   */
  //shortcut: psvm
  public static void main(String[] args) {

    //shortcut: sout
    System.out.println("Hello world!");
  }
}
