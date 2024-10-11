package com.java.buddies;

import com.java.buddies.model.Date;
import com.java.buddies.service.DateFormatterService;

/**
 * <b>Caso de uso: <b/> Formatear la fecha
 * <br>
 * <b>Reglas de negocio: <b/>
 * - El usuario brindará la fecha en formato YYYYMMDD
 * - Modelar la fecha con POO
 * - Generar una clase que implemente la lógica para el formateo
 * <br>
 * <b>Criterios de aceptación: <b/> La aplicación debe mostrar un mensaje de la fecha formateada.
 * Por ejemplo:
 * 20240908 --> Dom 08 Set 2024
 */
public class DateApplication {

  public static void main(String[] args) {
    DateFormatterService service = new DateFormatterService();
    Date date = service.retrieveDate("20241009");
    System.out.println(date);
  }
}
