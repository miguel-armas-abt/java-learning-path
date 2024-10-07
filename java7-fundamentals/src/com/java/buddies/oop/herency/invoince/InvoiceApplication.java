package com.java.buddies.oop.herency.invoince;

import java.util.*;

public class InvoiceApplication {

  public static void main(String[] args) {
    List<String> products = Arrays.asList("mouse", "teclado", "monitor");
    Invoice productInvoice = new ProductInvoice(products, 1L, "2024/10/06", 1250.0);
    productInvoice.printDetail();

    System.out.println("########################");

    Invoice serviceInvoice = new ServiceInvoice("Lavandería", 2L, "2024/10/06", 30.0);
    serviceInvoice.printDetail();

    productInvoice.printCommonMessage();
    serviceInvoice.printCommonMessage();
  }
}
