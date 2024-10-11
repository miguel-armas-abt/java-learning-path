package com.java.buddies;

public abstract class Invoice {

  public Invoice(Long invoiceNumber, String date, Double totalAmount) {
    this.invoiceNumber = invoiceNumber;
    this.date = date;
    this.totalAmount = totalAmount;
  }

  protected Long invoiceNumber;
  protected String date;
  protected Double totalAmount;

  abstract void printDetail();

  public String printCommonMessage() {
    return "Esto es común a todas las implementaciones";
  }
}
