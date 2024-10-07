package com.java.buddies.service;

import com.java.buddies.dto.CustomerDTO;
import java.util.List;

public interface CustomerService {

  List<CustomerDTO> findAll();

  CustomerDTO findByDni(String dni);
}
