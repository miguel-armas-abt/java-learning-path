package com.java.buddies.repository;

import com.java.buddies.entity.CustomerEntity;
import java.util.List;

public interface CustomerRepository {

  List<CustomerEntity> findAll();

  CustomerEntity findByDni(String dni);
}
