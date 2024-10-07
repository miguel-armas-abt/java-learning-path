package com.java.buddies.oop.herency.invoince;

import java.util.List;

public class ProductInvoice extends Invoice {

  private List<String> products;

  public ProductInvoice(List<String> products, Long invoiceNumber,
                        String date, Double totalAmount) {
    super(invoiceNumber, date, totalAmount);
    this.products = products;
  }

  @Override
  void printDetail() {
    String message = "";

    for (String product : this.products) {
      message += (product + ", ") ;
    }

    message = message
        + "\nTotal: " + this.totalAmount
        + "\nFecha: " + this.date;

    System.out.println(message);
  }
}
