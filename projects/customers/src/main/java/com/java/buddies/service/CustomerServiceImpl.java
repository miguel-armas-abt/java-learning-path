package com.java.buddies.service;

import com.java.buddies.dto.CustomerDTO;
import com.java.buddies.entity.CustomerEntity;
import com.java.buddies.mapper.CustomerMapper;
import com.java.buddies.repository.CustomerRepository;
import com.java.buddies.repository.CustomerRepositoryImpl;
import java.util.ArrayList;
import java.util.List;

public class CustomerServiceImpl implements CustomerService {

  private final CustomerMapper mapper;
  private final CustomerRepository repository;

  public CustomerServiceImpl() {
    mapper = new CustomerMapper();
    repository = new CustomerRepositoryImpl();
  }

  @Override
  public List<CustomerDTO> findAll() {
    List<CustomerEntity> customerEntities = repository.findAll();
    List<CustomerDTO> customerDTOS = new ArrayList<>();

    for (CustomerEntity customerEntity: customerEntities) {
      CustomerDTO customerDTO = mapper.toDTO(customerEntity);
      customerDTOS.add(customerDTO);
    }

    return customerDTOS;
  }

  @Override
  public CustomerDTO findByDni(String dni) {
    CustomerEntity entity = repository.findByDni(dni);
    return mapper.toDTO(entity);
  }
}
