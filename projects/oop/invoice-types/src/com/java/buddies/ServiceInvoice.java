package com.java.buddies;

public class ServiceInvoice extends Invoice {

  private String descriptionService;

  public ServiceInvoice(String descriptionService, Long invoiceNumber, String date, Double totalAmount) {
    super(invoiceNumber, date, totalAmount);
    this.descriptionService = descriptionService;
  }

  @Override
  void printDetail() {
    String message = "";
    message = message
        + "\nServicio: " + this.descriptionService
        + "\nTotal: " + this.totalAmount
        + "\nFecha: " + this.date;

    System.out.println(message);
  }

}
