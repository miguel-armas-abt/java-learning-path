package com.java.buddies;

import com.java.buddies.service.CustomerService;
import com.java.buddies.service.CustomerServiceImpl;

public class Application {

  public static void main(String[] args) {

    CustomerService customerService = new CustomerServiceImpl();
    System.out.println(customerService.findAll());
    System.out.println(customerService.findByDni("76517368"));
  }

}