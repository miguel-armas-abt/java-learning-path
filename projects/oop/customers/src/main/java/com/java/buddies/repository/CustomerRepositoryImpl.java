package com.java.buddies.repository;

import com.java.buddies.dao.CustomerDAO;
import com.java.buddies.dao.CustomerDAOImpl;
import com.java.buddies.entity.CustomerEntity;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepository {

  private final CustomerDAO customerDAO;

  public CustomerRepositoryImpl() {
    this.customerDAO = new CustomerDAOImpl();
  }

  @Override
  public List<CustomerEntity> findAll() {
    return customerDAO.findAll();
  }

  @Override
  public CustomerEntity findByDni(String dni) {
    return customerDAO.findByDni(dni);
  }

}
