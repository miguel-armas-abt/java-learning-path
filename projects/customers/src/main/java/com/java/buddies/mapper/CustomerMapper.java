package com.java.buddies.mapper;

import com.java.buddies.dto.CustomerDTO;
import com.java.buddies.entity.CustomerEntity;

public class CustomerMapper {

  public CustomerDTO toDTO(CustomerEntity entity) {
    CustomerDTO dto = new CustomerDTO();
    dto.setDni(entity.getDni());
    dto.setName(entity.getName());
    return dto;
  }

}
